#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int x;
    int y;

    cin >> n;

    if( n % 2 == 0)
    {
        y = 8;
        x = n - y;
    }
    else
    {
        y = 9;
        x = n - y;
    }

    cout << x << " " << y << endl;
}
