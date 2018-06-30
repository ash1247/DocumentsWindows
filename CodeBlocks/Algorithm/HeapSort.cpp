#include <bits/stdc++.h>

void max_heapify(int *, int);
void build_max_heap(int *, int);
void heapsort(int *, int);
void swap(int *, int *);
int heapsize;

int main( void )
{
    int i, n;
    clock_t start, end;
    double time;

    std::cout << "Please enter the size of the array: ";
    std::cin >> n;
    printf("\n");

    int A[n];

    for(i = 1; i <= n; i++)
    {
        A[i] = rand();
    }

    printf("Before Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", A[i] );
    }

    start = clock();

    heapsort( A, n);

    end = clock();

    time = ( (double)(end - start) ) / CLOCKS_PER_SEC;

    printf("\nAfter Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", A[i] );
    }

    std::cout << "\n\nTotal time taken " << time << " s.";

    free(A);

    return 0;
}

void heapsort(int *arr,int len)
{
   int i;
   build_max_heap(arr,len);

    for(i= len;i>=2;i--)
    {
        swap(&arr[1],&arr[i]);
        heapsize = heapsize -1;
        max_heapify(arr,1);
    }
}
void max_heapify(int *arr,int i)
{
    int l=2*i,r=2*i+1,largest;
    if(l<=heapsize && arr[l]>arr[i])
        largest = l;
    else
        largest = i;
    if(r<=heapsize && arr[r]>arr[largest])
        largest = r;

    if(largest != i)
    {
        swap(&arr[i],&arr[largest]);
        max_heapify(arr,largest);
    }
}
void build_max_heap(int *arr,int le2won)
{
    heapsize = len;
    int i;
    for(i =len/2;i>=1;i--)
    {
        max_heapify(arr,i);
    }
}
void swap(int *a ,int *b)
{
    int temp = *a;
    *a= *b;
    *b= temp;
}

