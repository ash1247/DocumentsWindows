/**************************************************

program: check if your input a is divided by b or not.
prints 1 for dividable, 0 for not.


****************************************************/
#include <stdio.h>

int main(void)
{
    int a, b;

    scanf("%d %d", &a, &b);

    if(a % b == 0)
    {
        printf("1\n");
    }
    else
        printf("0\n");

    return 0;

}
