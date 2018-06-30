#include <bits/stdc++.h>

int partition(int *A, int p, int r);
void quick_sort(int *A, int p, int r);

int main ( void ){
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

    quick_sort(A, 1, n);

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


int partition(int *A, int p, int r){

	int i, j;
	i = p - 1;
	int x = A[r];

	for(j = p; j < r; j++)
    {
		if(A[j] <= x){
			i++;
			int aux = A[i];
			A[i] = A[j];
			A[j] = aux;
		}
	}

	A[r] = A[i + 1];
	A[i + 1] = x;

	return i + 1;
}

void quick_sort(int *A, int p, int r){

	if(p < r)
    {
		int q = partition(A ,p, r);
		quick_sort(A,p, q - 1);
		quick_sort(A,q + 1,r);
	}
}
