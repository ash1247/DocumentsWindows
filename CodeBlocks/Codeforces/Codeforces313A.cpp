#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long long int n, ab;

    cin >> n;

    ab = n;

    if( n / 10 > ab )
    {
        ab = n / 10;
    }
    if( n % 10 + ( n / 100 ) * 10 > ab )
    {
        ab = n % 10 + ( n / 100 ) * 10;
    }

    cout << ab << endl;

    return 0;
}
