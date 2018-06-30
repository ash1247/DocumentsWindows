#include <bits/stdc++.h>

int main(void)
{
    long long int lines, ans;

    while(scanf("%lld", &lines) != EOF)
    {
        if(lines >= 0)
        {
            ans = (lines * (lines + 1))/2 + 1;
            printf("%lld\n", ans);
        }
    }
    return 0;
}
