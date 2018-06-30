#include <stdio.h>
#include <stdlib.h>

//With Global and Local Variables

void printSomething();

int acne = 20;

int main( void )
{
    printf("I have %d acne\n", acne);
    printf("I am in main\n");
    printSomething();
    int acne = 8;
    printf("I am in main, again!\n");
    printf("I have %d acne\n", acne);

    return 0;
}

void printSomething()
{
    int acne = 9;
    printf("Bitch I am working now.\n");
    printf("I have %d acne\n", acne);

    return;
}
