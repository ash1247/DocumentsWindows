#include <bits/stdc++.h>

using namespace std;

struct Node
{
    int data;
    Node* next;
};

Node* front = NULL;
Node* rear = NULL;

void enqueue(int x);
void dequeue();
int Front();
void Print();

int main( void )
{
    enqueue(2); Print();
	enqueue(4); Print();
	enqueue(6); Print();
	dequeue();  Print();
	enqueue(8); Print();
}

void enqueue(int x)
{
    Node* temp = new Node();
    temp->data = x;
    temp->next = NULL;
    if( front == NULL && rear == NULL )
    {
        front = rear = temp;
        return;
    }

    rear->next = temp;
    rear = temp;
}
void dequeue()
{
   Node* temp = front;
   if( front == NULL)
   {
       return;
   }
   if( front == rear )
   {
       front = rear = NULL;
   }
   else
   {
       front = front->next;
   }

   free(temp);
}
int Front()
{
	if(front == NULL)
    {
		printf("Queue is empty\n");
		return -1;
	}
	return front->data;
}

void Print()
{
	struct Node* temp = front;
	while(temp != NULL)
    {
		printf("%d ",temp->data);
		temp = temp->next;
	}
	printf("\n");
}
