#include <bits/stdc++.h>

using namespace std;

struct BstNode
{
    char data;
    BstNode* left;
    BstNode* right;
};

BstNode* GetNewNode(char data);
BstNode* insert( BstNode* root, char data );
bool search( BstNode* root, char data );
void dfsPreorder(BstNode* root);
void dfsInorder(BstNode* root);
void dfsPostorder(BstNode* root);


int main( void )
{
    BstNode* root = NULL;

    /*Code To Test the logic
	  Creating an example tree

                M
			   / \
			  B   Q
			 / \   \
			A   C   Z
    */


    root = insert(root,'M'); root = insert(root,'B');
	root = insert(root,'Q'); root = insert(root,'Z');
	root = insert(root,'A'); root = insert(root,'C');

	//Print Nodes in Preorder.
	cout<<"Preorder: ";
	dfsPreorder(root);
	cout<<"\n";
	//Print Nodes in Inorder
	cout<<"Inorder: ";
	dfsInorder(root);
	cout<<"\n";
	//Print Nodes in Postorder
	cout<<"Postorder: ";
	dfsPostorder(root);
	cout<<"\n";
}

BstNode* GetNewNode(char data)
{
    BstNode* newNode = new BstNode();
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

BstNode* insert( BstNode* root, char data )
{
    if( root == NULL )
    {
        root = GetNewNode(data);
    }
    else if( data <= root->data )
    {
        root->left = insert( root->left, data );
    }
    else
    {
        root->right = insert(root->right, data);
    }
    return root;
}

bool search( BstNode* root, char data )
{
    if( root == NULL )
    {
        return false;
    }
    else if( root->data == data)
    {
        return true;
    }
    else if( data <= root->data)
    {
        return search( root->left, data );
    }
    else
    {
        return search( root->right, data);
    }
}

void dfsPreorder(BstNode* root)
{
    if( root == NULL )
    {
        return;
    }
    printf("%c ", root->data);
    dfsPreorder(root->left);
    dfsPreorder(root->right);
}
void dfsInorder(BstNode* root)
{
    if( root == NULL )
    {
        return;
    }
    dfsInorder(root->left);
    printf("%c ", root->data);
    dfsInorder(root->right);
}
void dfsPostorder(BstNode* root)
{
    if( root == NULL )
    {
        return;
    }
    dfsPostorder(root->left);
    dfsPostorder(root->right);
    printf("%c ", root->data);
}

