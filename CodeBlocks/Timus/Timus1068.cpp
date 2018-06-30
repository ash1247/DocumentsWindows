#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int n;

    cin >> n;

    printf("%d\n", n>0 ? n*(n+1)/2 : 1+n*(1-n)/2);

    /*if( num == 1)
    {
        cout << 1;
    }

    else if(num > 1)
    {
        for(int i = 1; i <= num; i++)
        {
            ans = i + ans;
        }

        cout << ans;
    }

    else if(num <= 0)
    {
        for(int i = 1; i >= num; i--)
        {
            ans = i + ans;
        }

        cout << ans;
    }*/

    return 0;
}
