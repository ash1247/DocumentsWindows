#include <bits/stdc++.h>
#define N 101

using namespace std;

int A[N];
int front = -1;
int rear = -1;

bool isEmpty();
bool IsFull();
void enqueue(int x);
void dequeue();
int fron();
void Print();

int main( void )
{
    enqueue(2);  Print();
    enqueue(4); Print();
    enqueue(6);  Print();
    dequeue();	  Print();
    enqueue(8);  Print();
}

bool isEmpty()
{
    if( front == -1 && rear == -1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool IsFull()
{
    return (rear+1)% N == front ? true : false;
}

void enqueue(int x)
{
    if( rear + 1 % N == front)
    {
        return;
    }
    else if( isEmpty() )
    {
        front = 0;
        rear = 0;
    }
    else
    {
        rear = (rear + 1) % N;
    }
    A[rear] = x;
}

void dequeue()
{
    if( isEmpty() )
    {
        printf("Queue is empty\n");
    }
    else if( front == rear )
    {
        front = -1;
        rear = -1;
    }
    else
    {
        front = (front + 1) % N;
    }
}

int fron()
{
    if( isEmpty() )
    {
        cout <<"Error: cannot return front from empty queue\n";
        return -1;
    }
    return A[front];
}

void Print()
{
    // Finding number of elements in queue
    int count = (rear+N-front)%N + 1;
    cout<<"Queue       : ";
    for(int i = 0; i <count; i++)
    {
        int index = (front+i) % N; // Index of element while travesing circularly from front
        cout<<A[index]<<" ";
    }
    cout<<"\n\n";
}
