#include <bits/stdc++.h>

void merge(int * array_of_integers, int p, int q, int r);
void merge_sort(int * array_of_integers, int p, int r);

int main( void )
{
    int i = 0, j = 0, key = 0, N;
    clock_t t;
    clock_t start, end;

    char ch, buffer[64];
    double time = 0.0;

    FILE *fPointer;

    fPointer = fopen("Numbers Unsorted.txt", "w");

    printf("Please enter how many numbers you want to enter: ");
    scanf("%d", &N);

    printf("\n");

    int array[N];

    srand( t );

    fprintf( fPointer, "\n");

    for(i = 1; i <= N; i++ )
    {
        int number = rand();
        fprintf( fPointer, "%d \n", number );
    }

    printf("Finished writing in File named 'Numbers Unsorted.txt'.\n\n");

    fclose(fPointer);

    fPointer = fopen("Numbers Unsorted.txt", "r");

    // Read the file unless the file encounters an EOF
	while(1){
		// Reads the character where the seeker is currently
		ch = fgetc(fPointer);

		if(ch == EOF){
			break;
		}

		else if(ch == '\n'){

			// Converting the content of the buffer into
			// an array position
			array[j] = atoi(buffer);

			// Incrementing the array position
			j++;

			// Clearing the buffer
			memset(buffer, '\0', 64);

			// clearing the counter
			i = 0;

			// then continue
			continue;
		}
		else{

			// reads the current character in the buffer
			buffer[i] = ch;

			// incrementing the counter
			i++;
		}
	}

    fclose(fPointer);

    printf( "\n" );

    printf("Completed Reading from file.\n\n");
    printf("Before Sorting...\n");
    for(i = 1; i <= N; i++ )
    {
        if( i % 6 == 0)
        {
            printf("\n");
        }
        printf( "%d \t\t", array[i]);
    }

    printf( "\n\n\n" );

    start = clock();

    merge_sort( array, 1, N);

    end = clock();

    fPointer = fopen("Numbers Sorted.txt", "w");

    printf("After Sorting...\n");
    for(i = 1; i <= N; i++ )
    {
        if( i % 6 == 0)
        {
            printf("\n");
        }
        printf( "%d \t\t", array[i]);
        fprintf( fPointer, "%d\n", array[i]);
    }

    fclose(fPointer);

    time = ((double)(end - start)) / CLOCKS_PER_SEC ;

    printf("\n\nTotal time taken %.3lf s\n", time);

    printf("Finished writing in File named 'Numbers Sorted.txt'.\n\n");

    return 0;


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
