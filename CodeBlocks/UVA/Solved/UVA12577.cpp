#include <bits/stdc++.h>


int main(void)
{
    char input[80];
    char *msg1 = "Hajj";
    char *msg2 = "Umrah";
    char *stop = "*";
    int ret1;
    int ret2;
    int ret3;
    int con = 1;

    while(scanf("%s", input) )
    {
        ret1 = strcmp(input, msg1);
        ret2 = strcmp(input, msg2);
        ret3 = strcmp(input, stop);

        if(ret3 == 0)
        {
            break;
        }
        else if(ret1 == 0)
        {
            printf("Case %d: Hajj-e-Akbar\n", con);
            con++;
        }
        else if(ret2 == 0)
        {
            printf("Case %d: Hajj-e-Asghar\n", con);
            con++;
        }
    }
    return 0;
}
