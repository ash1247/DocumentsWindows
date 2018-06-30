#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int i = 0;
    int tmp;
    cin >> n;

    int p[n];

    for( i = 1; i <= n; i++ )
    {
        cin >> tmp;
        p[tmp] = i;
    }

    for( i = 1; i <= n; i++ )
    {
        cout << p[i] << " ";
    }

    return 0;
}
