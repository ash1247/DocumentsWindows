#include <bits/stdc++.h>

using namespace std;

struct Node
{
    int data;
    Node* next;
};

void insertAtBegining(int x);
void insertAtPosition(int x, int pos);
void insertAtEnd(int x);
void deleteAtPosition(int pos);
void traverse();
void traverseRecursion(Node* node);
void reverseList();
void reverseListRecursion(Node* node);
void reverseTraverseRecursion(Node* node);
void reverseListStack();

Node* start;

int main( void )
{
    start = NULL;
    cout << "how many numbers?\n";
    int n, i, x;

    insertAtBegining(2);
    insertAtEnd(3);
    insertAtEnd(4);
    insertAtEnd(5);
    traverse();
    reverseListStack();

    traverseRecursion(start);
}

void insertAtBegining(int x)
{
    Node* temp = new Node();
    temp->data = x;
    temp->next = start;
    start = temp;
}

void insertAtEnd(int x)
{
    Node* temp = new Node();
    temp->data = x;

    Node* temp1 = start;

    while( temp1->next != NULL)
    {
        temp1 = temp1->next;
    }

    temp->next = temp1->next;
    temp1->next = temp;

}
void insertAtPosition(int x, int pos)
{
    Node* temp1 = new Node();
    temp1->data = x;
    temp1->next = NULL;
    if( pos == 1 )
    {
        temp1->next = start;
        start = temp1;
        return;
    }

    Node* temp2 = start;
    for( int i = 1; i <= pos - 2; i++ )
    {
        temp2 = temp2->next;
    }

    temp1->next = temp2->next;
    temp2->next = temp1;
}

void deleteAtPosition(int pos)
{
    Node* temp1 = start;
    if( pos == 1)
    {
        start = temp1->next;
        free(temp1);
        return;
    }
    for(int i = 0; i < pos - 2; i++ )
    {
        temp1 = temp1->next;
    }
    Node* temp2 = temp1->next;
    temp1->next = temp2->next;
    free(temp2);
}

void traverse()
{
    Node* temp = start;
    cout << "list is: ";
    while( temp != NULL )
    {
        printf(" %d ->", temp->data );
        temp = temp->next;
    }
    cout << endl;
}

void traverseRecursion(Node* node)
{
    if(node == NULL)
    {
        printf("\n");
        return;
    }
    printf(" %d ->", node->data);
    traverseRecursion(node->next);
}

void reverseTraverseRecursion(Node* node)
{
    if(node == NULL)
    {
        printf("\n");
        return;
    }
    reverseTraverseRecursion(node->next);
    printf(" %d ->", node->data);
}

void reverseList()
{
    Node* current = start;
    Node* next;
    Node* previous = NULL;

    while( current != NULL )
    {
        next = current->next;
        current->next = previous;
        previous = current;
        current = next;
    }
    start = previous;
}

void reverseListRecursion(Node* node)
{
    if(node->next == NULL)
    {
        start = node;
        return;
    }
    reverseTraverseRecursion(node->next);
    Node* q = node->next;
    q->next = node;
    node->next = NULL;
}

void reverseListStack()
{
    stack<Node*> s;
    Node* temp = start;

    while( temp != NULL )
    {
        s.push(temp);
        temp = temp->next;
    }

    Node* temp1 = s.top();

    start = temp1;

    s.pop();

    while( !s.empty() )
    {
        temp1->next = s.top();
        s.pop();
        temp1 = temp1->next;
    }

    temp1->next = NULL;
}
