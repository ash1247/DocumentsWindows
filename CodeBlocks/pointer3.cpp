#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

int main(void)
{
    char movie1[] = "The Return of ASH!!!";

    char *movie2 = "Hey U! Miss ME?";

    puts( movie2 );

    movie2 = "Hey Biatch! Miss ME?";

    puts( movie2 );

    char movie[20];
    char *pMovie = movie;

    fgets( pMovie, 20, stdin);
    puts( pMovie );

    return 0;
}
