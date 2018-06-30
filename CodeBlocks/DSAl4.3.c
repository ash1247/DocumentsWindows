/* Program of deleting data in a linear array and
printing the elements of the array*/

#include <stdio.h>

int main(void)
{
    int ladata[100]; //linear array named ladata
    int k; //array counter
    int n; // array upper bound
    int j; // array delete position
    int item; //the item you want to delete

    printf("How many numbers you want to enter: ");
    scanf("%d", &n);

    for(k = 1; k <= n; k++) //loop for entering the data
    {
        printf("Enter the %d number: ", k);
        scanf("%d", &ladata[k] );
    }

    for(k = 1; k <= n; k++) // loop for printing the data
        printf("The number %d is %d\n", k, ladata[k] );

    printf("Enter the position you want to delete: ");
    scanf("%d", &j); //prompt for the position to delete

    item = ladata[j]; //assigns item to ladata j positioned element

    for(k = j; k <= n-1; k++)  //k assigned to j, while k
        ladata[k] = ladata[k+1];// is not equal to n-1 elements
                                //increment k and set the next position
    --n;                         //as the current position and decrease
                                //array size by 1

    for(k = 1; k <= n; k++)// loop for printing the new resized array
        printf("The number %d is %d\n", k, ladata[k] );

    return 0;

}
