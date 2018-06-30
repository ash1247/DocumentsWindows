/* Program of inserting data in a linear array and
printing the elements of the array*/

#include <stdio.h>

int main(void)
{
    int ladata[100]; //linear array named ladata
    int k; //array counter
    int n; // array upper bound
    int j; // array insert position
    int item; //the item you want to add

    printf("How many numbers you want to enter: ");
    scanf("%d", &n);

    for(k = 1; k <= n; k++) //loop for entering the data
    {
        printf("Enter the %d number: ", k);
        scanf("%d", &ladata[k] );
    }

    for(k = 1; k <= n; k++) //loop for printing the data
        printf("The number %d is %d\n", k, ladata[k] );

    printf("Enter the position you want to add the number: ");
    scanf("%d", &k); //prompt for the position you want to add the number

    j = n; // n assigned to new counter j

    while( j >= k ) //while j is not equal to k
    {
        ladata[ j + 1 ] = ladata[ j ]; // continue setting the number position
        j--;                           // a 1 step back and decrement
                                        // by 1
    }

    printf("Enter the number you want to add: ");
    scanf("%d", &item ); //prompt for the item to add
    ladata[k] = item;  //the k position of the given input will be the new
                        // position in the linear array

    n++; //increase the size of the array by one

    for(k = 1; k <= n; k++) //loop for printing the new increased linear data array
    printf("The number %d is %d\n", k, ladata[k] );

    return 0;


}

