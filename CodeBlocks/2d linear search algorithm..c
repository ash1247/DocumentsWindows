#include <stdio.h>

int main ()
{
    int m, n;
    int array[100][100]; // array of size
    int i,j;             //counters i,j
    int number;          // number for searching
    int x = 0, y = 0;   // location of the number

    printf(" Row size = ");
    scanf("%d", &m);

    printf(" Column size = ");
    scanf("%d", &n);

    //for input into array
    for(i = 1; i <= m; i++)
    {
        printf("\n");
        for(j = 1; j <= n ; j++)
        {
            printf(" Array[%d][%d]= ",i,j);
            scanf("%d", &array[i][j]);
        }
    }

    //for printing the array
    for(i=1; i <= m ; i++)
    {
        printf("\n");
        for(j = 1; j <= n; j++)
        {
            printf("%d  ", array[i][j]);

        }
        printf("\n\n");
    }


    printf("Enter The number you want:");
    scanf("%d",&number);

    //for searching the array
    for(i = 1; i <= m; i++)
    {
        for(j = 1; j<= n; j++)
        {
            if(number == array[i][j])
                {
                    x = i;
                    y = j;
                }
        }
    }

    if (x == 0 && y == 0)
        printf("Number does not exists\n");
    else
        printf("Number exists on row %d column %d\n", x, y);


    return 0;
}

