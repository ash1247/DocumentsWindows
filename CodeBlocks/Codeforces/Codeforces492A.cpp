#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long long int n, ans = 0, i = 0;

    cin >> n;

    while ( ans <= n )
    {
        i++;
        ans += ( i * (i + 1) ) / 2;
    }

    cout << i - 1 << endl;

    return 0;


}
