#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, m;
    int small;
    cin >> n >> m;

    small = n;

    if( m < n)
    {
        small = m;
    }

    if( small % 2 == 0)
    {
        cout << "Malvika\n";
    }
    else
    {
        cout << "Akshat\n";
    }

    return 0;
}
