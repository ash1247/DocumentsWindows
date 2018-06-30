#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SIZE 7

int main(void)
{
    unsigned int frequency[ SIZE ] = { 0 };
    unsigned int roll;
    size_t face;
    std::cout << std:: endl;
    srand( time ( NULL ) );

    for( roll = 1; roll <= 600000; ++roll )
    {
        face = 1 + rand() % 6;

        ++frequency[ face ];
    }

    printf("%s%17s\n", "Face", "Frequency" );
    for( face = 1; face < SIZE; ++face)
    {
        printf( "%4d%17d\n", face, frequency[ face ] );
    }

}
