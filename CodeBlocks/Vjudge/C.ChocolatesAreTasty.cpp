#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long long int n, x = 0, total = 0;

    cin >> n;

    long long int a[n];

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        x ^= a[i];
    }

    for (int i = 0; i < n; i++)
    {
        if( a[i] > ( a[i] ^ x ) )
        {
            total++;
        }
    }


    cout << total << endl;

    return 0;
}

