#include <bits/stdc++.h>

void merge(int * array_of_integers, int p, int q, int r);
void merge_sort(int * array_of_integers, int p, int r);

int main( void )
{
    int i, j, n, min, tmp;
    clock_t start, end;
    double time;

    std::cout << "Please enter the size of the array: ";
    std::cin >> n;
    printf("\n");

    int array[n];


    for(i = 1; i <= n; i++)
    {
        array[i] = rand();
    }

    printf("Before Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", array[i] );
    }

    start = clock();

    merge_sort(array, 1, n);

    end = clock();

    time = ( (double)(end - start) ) / CLOCKS_PER_SEC;

    printf("\nAfter Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", array[i] );
    }

    std::cout << "\n\nTotal time taken " << time << " s.";

}

void merge(int * array_of_integers, int p, int q, int r){
   int n1 = q - p + 1;
   int n2 = r - q;
   int i, j, k;
   int left_array[n1+1];
   int right_array[n2+1];

   left_array[n1 + 1] = 123456798;
   right_array[n2 + 1] = 123456798;

   for(i = 1; i <= n1; i++)
     left_array[i] = array_of_integers[p + i - 1];
   for(j = 1; j <= n2; j++)
     right_array[j] = array_of_integers[q + j];

   i = 1;
   j = 1;

   for(k = p; k <= r; k++){
     if(left_array[i] <= right_array[j]){
       array_of_integers[k] = left_array[i];
       i++;
     } else {
       array_of_integers[k] = right_array[j];
       j++;
     }
   }
 }

 void merge_sort(int * array_of_integers, int p, int r){
   if(p < r){
     int q = (p+r)/2;
     merge_sort(array_of_integers, p, q);
     merge_sort(array_of_integers, q + 1, r);
     merge(array_of_integers, p, q, r);
   }
 }
