#include <stdio.h>
#include <ctype.h>

void convertToUppercase(char *sPtr ); // prototype

int main( void )
{
    char string[] = "cHaRaCters and $32.98"; // initialize char array

    printf( "The string before conversion is: %s", string );
    convertToUppercase( string );
    printf( "\nThe string after conversion is: %s\n", string );
} // end main

// convert string to uppercase letters
void convertToUppercase( char *sPtr)
{
    while ( *sPtr != '\0' ) {
        *sPtr = toupper( *sPtr );
        ++sPtr;  // current character is not '\0'
    // convert to uppercase
    // make sPtr point to the next character
    } // end while
} // end function convertToUppercase
