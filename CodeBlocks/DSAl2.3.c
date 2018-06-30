#include <Stdio.h>
#include <string.h>

int main(void)
{
    int data[10] = {11, 2, 3, 4, 10, 0, 9, 12, 1, 100};

    int k = 1;
    int location = 0;

    int max = data[0];

    while( k <= 10 )
    {
        if( max < data[ k ] )
        {
            location = k;
            max = data[ k ];
        }
        k++;
    }

    printf("location %d(starts from 0) in array named data"
           "\ncontains the max number %d\n\n", location , max);

}
