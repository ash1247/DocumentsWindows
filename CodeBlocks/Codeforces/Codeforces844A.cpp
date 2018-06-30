#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int i, j, e = 0, k = 0, l = 0, number = 0;
    char searc;

    char s[1001];
    char ch, ch1;

    scanf("%s", s);
    scanf("%d", &n);

    j = strlen(s);

    int q = j - n;

    for(i = 0; i < j; i++)
    {
        ch = s[i];
        ch1 = s[i + 1];
        searc = ch;



        for(int p = i; p < j - q; p++ )
        {
           /* if( (int)searc > s[p + 1] || (int)searc < s[p + 1] )
            {
                e++;
            }

            if( searc == s[i + 1] )
            {
                k++;
            }

            if( k >= 2 )
            {
                l++;
                break;
            }

            if( p <= j - q )
            {
                break;
            }

            p = p + k;
            if( k >= 2)
            {
                p = p - 1;
            } */
        }

        if( ch == ch1 )
        {
            number = number + 1;
        }
        else if(n > j)
        {
            printf("impossible\n");
            break;
        }

        k = 0;
        l = 0;
    }

    if( n < e || e == 0 )
    {
        printf("impossible\n");
    }
    else if( n <= j  )
    {
        printf("%d\n", number);
    }

    return 0;
}
