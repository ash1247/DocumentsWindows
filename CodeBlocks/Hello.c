#include <stdio.h>

int main(void)
{
    int height = 0;
    int line = 0;
    int column = 0;

    while (height <= 0 || height > 23)
    {
        printf("Enter the height: ");
        scanf("%d", &height);
    }
    printf("\n");

    /* Chooses a row: */
    for ( line = 1 ; line <= height ; line++ )
    {
        /* Chooses a column: */
        for ( column = 1 ; column <= height ; column++ )
        {
            /* Prints an hash character or a space character: */
            if ( column >= height + 1 - line )
            {
                printf("#");
            }
            else
            {
                printf(" ");
            }
        }

        printf("\n");
    }

    return 0;
}
