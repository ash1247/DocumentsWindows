#include <bits/stdc++.h>

using namespace std;

int main(void )
{
    int t,donate, sum = 0;
    char s[20];
    cin >> t;
    while(t--)
    {
        scanf("%s", s);
        if( strcmp(s, "donate") == 0)
        {
            scanf("%d", &donate);
            sum += donate;
        }
        else
        {
            printf("%d\n", sum);
        }

    }
}
