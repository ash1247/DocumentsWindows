#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int x = 0;
    int n;
    char inp[5];

    scanf("%d", &n);

    char s1[5] = "++X";
    char s2[5] = "X++";
    char s3[5] = "--X";
    char s4[5] = "X--";
    for(int i = 1; i <= n; i++)
    {
        scanf("%s", inp);
        if(strcmp(s1, inp) == 0 | strcmp(s2, inp) == 0)
        {
            x++;
        }
        else if(strcmp(s3, inp) == 0 | strcmp(s4, inp) == 0)
        {
            x--;
        }
    }

    printf("%d\n", x);

}
