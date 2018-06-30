#include <stdio.h>
#include <stdlib.h>

int main( void )
{
    FILE *fPointer;
    fPointer = fopen("Anip.txt", "w+");
    fputs("I ate rice with beef today", fPointer);

    fseek(fPointer, 6, SEEK_SET);
    fputs("Polao with beef today.\n", fPointer );

    fseek(fPointer, -8, SEEK_END);
    fputs("along with salads today.\n", fPointer );

    fclose( fPointer );
    return 0;
}
