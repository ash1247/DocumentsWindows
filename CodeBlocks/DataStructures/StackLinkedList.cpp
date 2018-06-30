#include <bits/stdc++.h>

using namespace std;

struct Node
{
    int data;
    Node* next;
};

Node* top = NULL;

void push(int x);
void pop();
void checkTop();
void isEmpty();
void traverse();

int main( void )
{
    checkTop();
    isEmpty();
    push(2); traverse();
    push(3); traverse();
    push(4); traverse();
    push(5); traverse();
    checkTop();
    pop(); traverse();
    isEmpty();

}

void push( int x )
{
    Node* temp = new Node();
    temp->data = x;
    temp->next = top;
    top = temp;
}

void pop()
{
    Node* temp;

    if( top == NULL )
    {
        printf("Stack is underflow.\n");
        return;
    }
    temp = top;
    top = top->next;
    free(temp);
}

void checkTop()
{
    Node* temp = top;
    if(top == NULL)
    {
        printf("Stack is Empty.\n");
        return;
    }
    printf("Top : %d\n", top->data );
}

void isEmpty()
{
    if( top == NULL )
    {
        printf("Stack is Empty\n");
    }
    else
    {
        printf("Stack is not Empty\n");
    }
}

void traverse()
{
    Node* temp = top;
    printf("Stack is: ");
    while( temp != NULL )
    {
        printf("%d ", temp->data );
        temp = temp->next;
    }
    printf("\n");
}
