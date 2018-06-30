#include <bits/stdc++.h>
int compare(int a, int b)
{
    if( a < b) return 1;
    else return -1;
}
int compareqsort(const void *a, const void *b)
{
    int A = (*(int*)a); //typecasting to int* and
    int B = (*(int*)b); //getting value by derefencing
    return A-B;
    //return B-A for non-increasing
    //return abs(A) - abs(B) for absolute non-decreasing abs value
}
void BubbleSort(int* A, int n, int (*compare)(int, int))
{
    for(int i = 0; i < n; i++)
    {
        for(int j = n - 1; j >= i + 1; j--)
        {
            if( compare(A[j],A[j-1]) > 0 )
            {
                int temp = A[j];
                A[j] = A[j-1];
                A[j-1] = temp;
            }
        }
    }
}

void C()
{
    printf("Hello\n");
}
void B(void (*ptr)() )
{
    ptr();
}
int main(void)
{
    void (*p)() = C;
    B(p);
    B(C); // works same as previous lines in single line
    int A[] = {3,2,1,5,6,4};
    int D[] = {-31,22,-1,50,-6,4};
    qsort(D, 6, sizeof(int), compareqsort);
    BubbleSort(A, 6, compare);
    for(int i = 0; i < 6; i++)
    {
        printf("%d ", A[i] );
    }
    printf("\n");
    for(int i = 0; i < 6; i++)
    {
        printf("%d ", D[i] );
    }
}
