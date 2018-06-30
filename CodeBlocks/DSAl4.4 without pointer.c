/* Program of sorting data in a linear array
using bubble sort and printing the
elements of the array*/

#include <stdio.h>

int main(void)
{
    int ladata[100]; //initialize array named ladata
    int k = 1; //array counter
    int n;  // array upper bound
    int ptr = 1; //counter for each pass through the data
    int hold;   //temporary hold variable for the changed data

    printf("How many numbers you want to enter: ");
    scanf("%d", &n);

    for(k = 1; k <= n; k++) //loop for entering the data
    {
        printf("Enter the %d number: ", k);
        scanf("%d", &ladata[k] );
    }

    printf("\nThe number entered in original order\n");
    for(k = 1; k <= n; k++) //print the inputted data in the order
    {                        // they were inserted
        printf("%6d", ladata[k] );
    }

    for(ptr = 1; ptr <= n; ptr++) //loop for each pass
    {
        for( k = 1; k <= n - 1; k++ ) //loop for traversing the data
        {
            if (ladata[k] > ladata[k + 1]) //checks two inputs at a time
            {                              //and compare them and sort them
                hold = ladata[k];          //in ascending order
                ladata[k] = ladata[k + 1];
                ladata[k + 1] = hold;
            }
        }
    }

    printf("\nIn ascending order after Bubble Sort\n");
    for(k = 1; k <= n; k++)
        printf("%6d", ladata[k] );

    return 0;

}
