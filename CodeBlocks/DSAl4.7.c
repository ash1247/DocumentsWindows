#include <stdio.h>
#define SIZE 10

int main(void)
{
    int a[SIZE][SIZE];
    int b[SIZE][SIZE];
    int c[SIZE][SIZE];
    int m, p, n;
    int i, j, k;

    printf("This is row X column matrix multiplication program.\n\n");
    printf("Matrix A = m X p Matrix B = p X n\n");

    printf("Enter the size for A and B matrices: \n");

    printf("Enter m :");
    scanf("%d", &m);
    printf("\n");

    printf("Enter p :");
    scanf("%d", &p);
    printf("\n");

    printf("Enter n :");
    scanf("%d", &n);
    printf("\n");

    printf("Enter the elements for first matrix:\n");
    printf("Matrix A size is %d X %d:\n", m, p );
    printf("\n");

    for(i = 1; i <= m; i++)
    {
        for(j = 1; j <= p; j++)
        {
            printf("a[%d][%d]: ", i, j);
            scanf("%d", &a[i][j]);
        }

    }

    printf("\n");
    printf("Enter the elements for second matrix:\n");
    printf("Matrix B size is %d X %d:\n", p, n );
    printf("\n");

    for(i = 1; i <= p; i++)
    {
        for(j = 1; j <= n; j++)
        {
            printf("b[%d][%d]: ", i, j);
            scanf("%d", &b[i][j]);
        }
    }

    printf("\n");
    printf("The A matrix is: \n");
    printf("\n");

    for(i = 1; i <= m; i++)
    {
        for(j = 1; j <= p; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }

    printf("\n");
    printf("The B matrix is: \n");
    printf("\n");

    for(i = 1; i <= p; i++)
    {
        for(j = 1; j <= n; j++)
        {
             printf("%d ", b[i][j]);
        }
        printf("\n");
    }

    for(i = 1; i <= m; i++)
    {
        for(j = 1; j <= n; j++ )
        {
            c[i][j] = 0;

            for(k = 1; k <= p; k++)
            {
                c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
        }
    }

    printf("\n");
    printf("The A X B = C matrix is: \n");
    printf("Matrix C size is %d X %d:\n", m, n );
    printf("\n");

    for(i = 1; i <= m; i++)
    {
        for(j = 1; j <= n; j++)
        {
            printf("%d ", c[i][j]);
        }
        printf("\n");
    }
}
