#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    long long int n;
    long long int count14 = 0, count23 = 0;

    cin >> n;

    long long int x;
    long long int y;

    for(int i = 0; i < n; i++)
    {
        cin >> x >> y;
        if( x > 0 )
        {
            count14++;
        }
        if( x < 0 )
        {
            count23++;
        }
    }

    if( count14 <= 1 || count23 <= 1 )
    {
        printf("Yes\n");
    }
    else
    {
        printf("No\n");
    }

    return 0;
}
