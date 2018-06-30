#include <bits/stdc++.h>

using namespace std;

struct BstNode
{
    int data;
    BstNode* left;
    BstNode* right;
};

BstNode* GetNewNode(int data);
BstNode* insert( BstNode* root, int data );
BstNode* Delete( BstNode* root, int data );
bool search( BstNode* root, int data );
bool isBSTUtil( BstNode* root, int minValue, int maxValue );
bool isBinarySearchTree( BstNode* root );
bool isBinarySearchTreeInorder( BstNode* root );
int findMinI(BstNode* root);
int findMinR(BstNode* root);
int findMaxR(BstNode* root);
int findHeight(BstNode* root); //maximum depth number of edges in
                            //longest path from root to a leaf
                            //node(depth = no. of edges in path
                            //from root to that node)


int main( void )
{
    BstNode* root = NULL;

    root = insert(root, 15);
    root = insert(root, 10);
    root = insert(root, 20);
    root = insert(root, 25);
    root = insert(root, 8);
    root = insert(root, 12);
    root = insert(root, 30);

    root = Delete(root, 25);

    cout << isBinarySearchTreeInorder(root) << endl;
}

BstNode* GetNewNode(int data)
{
    BstNode* newNode = new BstNode();
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

BstNode* insert( BstNode* root, int data )
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

BstNode* Delete( BstNode* root, int data )
{
    if( root == NULL )
    {
        return root;
    }
    else if( data < root->data )
    {
        root->left = Delete(root->left, data);
    }
    else if( data > root->data )
    {
        root->right = Delete( root->right, data);
    }
    else
    {
        // Case 1:  No child
        if( root->left == NULL && root->right == NULL )
        {
            delete root;
            root = NULL;
        }
        //Case 2: One child
        else if( root->left == NULL)
        {
            BstNode* temp = root;
            root = root->right;
            delete temp;
        }
        else if( root->right == NULL)
        {
            BstNode* temp = root;
            root = root->left;
            delete temp;
        }
        // case 3: 2 children
        else
        {
            BstNode* temp;
            temp->data = findMinR( root->right);
            root->data = temp->data;
            root->right = Delete(root->right, temp->data );
        }
    }

    return root;
}

bool search( BstNode* root, int data )
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

int findMinI(BstNode* root)
{
    if( root == NULL )
    {
        cout << "Tree is empty\n";
        return -1;
    }
    while( root->left != NULL )
    {
        root = root->left;
    }
    return root->data;
}

int findMinR(BstNode* root)
{
    if( root == NULL )
    {
        cout << "Tree is empty\n";
        return -1;
    }
    else if( root->left == NULL )
    {
        return root->data;
    }

    return findMinR(root->left);
}

int findMaxR(BstNode* root)
{
    if( root == NULL )
    {
        cout << "Tree is empty\n";
        return -1;
    }
    else if( root->right == NULL )
    {
        return root->data;
    }

    return findMaxR(root->right);
}

int findHeight( BstNode* root )
{
    if( root == NULL )
    {
        return -1;
    }
    int leftHeight = findHeight(root->left);
    int rightHeight = findHeight(root->right);

    return max(leftHeight, rightHeight) + 1;
}

bool isBSTUtil( BstNode* root, int minValue, int maxValue )
{
    if( root == NULL )
    {
        return true;
    }
    if( root->data >= minValue
       && root->data < maxValue
       && isBSTUtil(root->left, minValue, root->data) &&
       isBSTUtil(root->right, root->data, maxValue) )
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool isBinarySearchTree( BstNode* root )
{
    return isBSTUtil( root, INT_MIN, INT_MAX );
}

bool isBinarySearchTreeInorder(BstNode* root)
{
    int temp = 0;
    if( root == NULL )
    {
        return true;
    }
    isBinarySearchTreeInorder(root->left);
    cout << root->data << " ";
    if( temp > root->data)
    {
        return false;
    }
    temp = root->data;
    isBinarySearchTreeInorder(root->right);
}

