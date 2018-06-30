#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int a, b, i = 0;

    cin >> a >> b;

    for( i = 1; i <= 2000; i++, a--)
    {
        if( i % b == 0)
        {
            a++;
        }
        if( a == 1)
        {
            cout << i << endl;
            break;
        }
    }

    return 0;

}

