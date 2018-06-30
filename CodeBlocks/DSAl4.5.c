/* Program of searching data in a linear array
*/

#include <stdio.h>

int main(void)
{
    int ladata[100]; //initialize array named ladata
    int k;           //array counter
    int n;           //array upper bound
    int item;        //item for searching
    int loc = 1;     //initialize of location of the item

    printf("How many numbers you want to enter: ");
    scanf("%d", &n);

    for(k = 1; k <= n; k++)//loop for entering the data
    {
        printf("Enter the %d number: ", k);
        scanf("%d", &ladata[k] );
    }

    for(k = 1; k <= n; k++)//loop for printing the data
        printf("The number %d is %d\n", k, ladata[k] );

    printf("Enter the number you want to search: ");
    scanf("%d", &item);//prompt for the item searching

    ladata[n + 1] = item; //assign the last position of ladata as item

    while( ladata[loc] != item)
    {                   //while item is not equal to item
        loc = loc + 1;

        if(loc == n + 1) //if location is equal to the
        {                //last item in the array
            loc = 0;       //do this
            printf("The number is not in the array.\n");
            break;
        }
    }

    if( ladata[loc] == item) //if item is equal to ladata
    {                      // loc position do this
        printf("array index %d is the location of number %d", loc, item);
    }

    return 0;
}
