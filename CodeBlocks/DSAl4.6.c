/* Program of sorting data in a linear array
using bubble sort and search the element using binary
search*/

#include <stdio.h>

int main(void)
{
    int data[100];   //initialize array named ladata
    int k = 1;       //array counter
    int ptr = 1;     //counter for each pass through the data
    int item;       //item for searching
    int n;          //array upper bound
    int beg;        //beginning position of array
    int end;        //end position of array
    int mid;       //mid position of array
    int loc;       //location of the data
    int hold;      //temporary hold variable for the changed data

    printf("How many numbers you want to enter: ");
    scanf("%d", &n);

    for(k = 1; k <= n; k++)
    {
        printf("Enter the %d number: ", k);
        scanf("%d", &data[k] );
    }

    printf("\nThe number entered in original order\n");

    for(k = 1; k <= n; k++)
    {
        printf("%6d", data[k] );
    }

    for(ptr = 1; ptr <= n; ptr++) //implementing bubble sort
    {
        for( k = 1; k <= n - 1; k++ )
        {
            if (data[k] > data[k + 1])
            {
                hold = data[k];
                data[k] = data[k + 1];
                data[k + 1] = hold;
            }
        }
    }

    printf("\nIn ascending order after Bubble Sort\n");
    for(k = 1; k <= n; k++)  //printing data after bubble sort
        printf("%6d", data[k] );

    printf("\n\nEnter the number you want to search: ");
    scanf("%d", &item);  //prompt for the item you want to search

    beg = 1; //set beginning as 1/lower bound
    end = n; //set end as upper bound

    mid = (int)((beg + end) / 2); //mid position and cast the
                                // output as int
    while( beg <= end & data[mid] != item )
    {                           //while beg is less than end
                                //and data[mid] is not equal to
                                //item

        if (item < data[mid] ) //if item is bigger than data mid
        {
            end = mid - 1;  //set end as mid - 1
        }
        else
        {
            beg = mid + 1; //else set beg as mid + 1
        }

        mid = (int)((beg + end) / 2); //set mid position continuously
    }                                  //while loop runs

    if (data[mid] == item)
    {
        loc = mid; //if data[mid] is equal to item set loc as mid and print
        printf("array index %d is the location of number %d\n", loc, item);
    }
    else
    {
        loc = 0; //else set loc to 0 and print
        printf("The number entered is not in the array.\n");
    }
}
