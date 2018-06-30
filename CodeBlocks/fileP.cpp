#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <ctype.h>

int main(void)
{
    FILE * f;
    int singleLine[150];
    f = fopen("Number2.txt", "r");

    printf("%d\n", sizeof(singleLine));
    /*while( fgets( singleLine, 150, f) != NULL )
    {
        printf("%s", singleLine);
    }
*/
    return 0;

}
