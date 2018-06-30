#include <stdio.h>
#include <stdlib.h>;
#include <ctype.h>
#include <string.h>
#include <math.h>
#include "Info.h"

int main(void)
{
    struct user Ema;
    struct user Ash;

    Ema.userID = 1;
    Ash.userID = 2;

    puts("Enter the first name of user 1:");
    gets(Ema.firstName);

    puts("Enter the first name of user 2:");
    gets(Ash.firstName);

    printf("User 1 id is %d\n", Ema.userID );
    printf("User 2 first Name is %s\n", Ash.firstName );


    return 0;
}
