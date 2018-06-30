#include <bits/stdc++.h>
#define MAX_SIZE 101
using namespace std;

int A[MAX_SIZE];
int top = -1;

void push(int x);
void pop();
int checkTop();
void isEmpty();
void traverse();

int main( void )
{
    push(2);
    push(3);
    push(5);
    push(8);

    traverse();

    pop();

    printf("Top: %d\n", checkTop() );
    traverse();
}

void push(int x)
{
    if( top == MAX_SIZE - 1)
    {
        printf("Stack overflow\n");
        return;
    }
    A[++top] = x;
}
void pop()
{
    if( top == -1)
    {
        printf("Error: No element to pop. Stack underflow\n");
        return;
    }
    top--;
}
int checkTop()
{
    return A[top];
}

void isEmpty()
{
    if( top == -1)
    {
        printf("Stack is Empty.\n");
    }
    else
    {
        printf("Stack is not empty\n");
    }
}

void traverse()
{
    for(int i = 0; i <= top; i++)
    {
        printf(" %d ", A[i] );
    }
    printf("\n");
}
