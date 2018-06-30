#include <bits/stdc++.h>

using namespace std;

struct DNode
{
    int data;
    DNode* next;
    DNode* prev;
};

struct DNode* newDNode(int x)
{
    DNode* newNode = new DNode();

    newNode->data = x;
    newNode->prev = NULL;
    newNode->next = NULL;

    return newNode;
};

DNode* start;

void insertAtBegining(int x);
void insertAtEnd(int x);
void traverse();
void reverseTraverse();


int main( void )
{
    start = NULL;
    insertAtBegining(1);
    insertAtBegining(2);

    traverse();
    reverseTraverse();

    return 0;
}

void insertAtBegining(int x)
{
    DNode* temp = newDNode(x);
    if(start == NULL)
    {
        start = temp;
        return;
    }

    start->prev = temp;
    temp->next = start;
    start = temp;
}

void insertAtEnd(int x)
{
	DNode* temp = start;
	DNode* newNode = newDNode(x);

	if(start == NULL)
    {
		start = newNode;
		return;
	}

	while(temp->next != NULL)
    {
        temp = temp->next;
    }

	temp->next = newNode;
	newNode->prev = temp;
}

void traverse()
{
    DNode* temp = start;
    cout << "Forward list is: ";
    while( temp != NULL )
    {
        printf(" %d ->", temp->data );
        temp = temp->next;
    }
    cout << endl;
}

void reverseTraverse()
{
    DNode* temp = start;

    if( temp == NULL )
    {
        return;
    }
    while( temp->next != NULL )
    {
        temp = temp->next;
    }

    cout << "Reverse list is: ";
    while( temp != NULL )
    {
        printf(" %d ->", temp->data );
        temp = temp->prev;
    }
    cout << endl;
}
