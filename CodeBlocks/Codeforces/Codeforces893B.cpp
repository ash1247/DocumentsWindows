#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long long int n, i, j = 1;
    long long int max = 0, ans = 0;;
    vector<long long int> v;

    while( max < 100000 )
    {
        max = ( pow(2, j) - 1 ) * ( pow(2, j - 1) );
        if( max > 100000)
        {
            break;
        }
        v.push_back(max);
        j++;
    }

    cin >> n;

    for( int i = 0; i < v.size(); i++ )
    {
        if( n % v[i] == 0 )
        {
            ans = v[i];
        }
    }

    cout << ans << endl;

    return 0;
}
