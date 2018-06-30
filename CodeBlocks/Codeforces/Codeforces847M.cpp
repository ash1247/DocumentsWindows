#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int i = 0;
    int change = 0;
    cin >> n;

    int temp[n];
    int diff[n];
    temp[0] = 0;

    for( i = 1; i <= n; i++ )
    {
        cin >> temp[i];
        diff[i] = temp[i] - temp[ i - 1] ;
    }

    for( i = 2; i <= n; i++)
    {
        if( diff[i] == diff[2] )
        {
            change = 1;
        }
        else if( diff[i] == 0)
        {
            change = 2;
        }
        else
        {
            change = 3;
        }
    }

    if( change == 1 )
    {
        cout << temp[n] + diff[2] << endl;
    }
    if( change == 2)
    {
        cout << temp[n];
    }
    if( change == 3)
    {
        cout << temp[n];
    }



}
