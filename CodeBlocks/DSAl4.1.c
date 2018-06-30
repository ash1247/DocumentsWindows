/* Program of traversing a linear array and
printing the elements of the array*/


#include <stdio.h>

int main(void)
{
    int ladata[100];//linear array data with 100 element size
    int k;          // array counter
    int n;          // array size for user to enter

    printf("How many numbers you want to enter: ");
    scanf("%d", &n);

    for(k = 1; k <= n; k++) //loop for entering the data
    {
        printf("Enter the %d number: ", k);
        scanf("%d", &ladata[k] );
    }

    for(k = 1; k <= n; k++) // loop for printing the data
        printf("The number %d is %d\n", k, ladata[k] );

    return 0;


}
