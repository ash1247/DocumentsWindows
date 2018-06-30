#include <stdio.h>

int main(void)
{
    int data[100];

    int k = 1;
    int location = 0;
    int item;
    int n;

    printf("Please enter how many numbers you want to enter: ");
    scanf("%d", &n);

    for( k = 1; k <= n; k++)
        scanf("%d", &data[k]);

    printf("Please enter the number you want to search: ");
    scanf("%d", &item);

    for( k = 1; k <= n; k++)
     {
        if( item == data[k] )
            location = k;
     }


   if( location == 0 )
        printf("Item in not in the array Data.");

    else
        printf("array index %d is the location of number %d", location, item);

}
