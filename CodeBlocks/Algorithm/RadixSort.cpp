#include <bits/stdc++.h>

void counting_sort(int *A, int *B, int n, int k);
int* radix_sort(int *A, int n, int k, int d);

int main( void )
{
    int i, j, n, k = 0, d = 9;

    std::cout << "Please enter the size of the array: ";
    std::cin >> n;
    printf("\n");

    int *A = new int[n];

    for(i = 1; i <= n; i++)
    {
        A[i] = rand();
        k = std::max(k, A[i] );
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

    A = radix_sort(A, n, k, d);

    printf("\nAfter Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", A[i] );
    }

    return 0;
}

int* radix_sort(int *A, int n, int k, int d)
{
    int *B = new int[n + 1];
    for(int i = 0; i <= d; i++)
    {
        counting_sort(A, B, n, k);
    }
    return B;
}

void counting_sort(int *A, int *B, int n, int k)
{
    int C[k];
    int i, j;

    for(i = 0; i <= k; i++)
		C[i] = 0;

	for(j = 1; j <= n; j++)
		C[A[j] ] = C[A[j] ] + 1;

	for(i = 1; i <= k; i++)
		C[i] = C[i] + C[i-1];

	for(j = n; j >= 1; j--){
		B[C[A[j] ] ] = A[j];
		C[A[j] ] = C[A[j] ] - 1;
	}
}




