#include <bits/stdc++.h>

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

    for( j = 1; j <= N; j++)
    {
        key = array[j];

        i = j - 1;

        while ( (i > 0) && (array[i] > key) )
        {
            array[ i + 1] = array[i];
            i = i - 1;
        }
        array[ i + 1 ] = key;
    }

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
