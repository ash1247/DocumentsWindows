#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int count = 0;

    cin >> n;

    int p[n], q[n];

    for( int i = 1; i <= n; i++)
    {
        cin >> p[i] >> q[i];
        if( abs(p[i] - q[i]) >= 2 )
        {
            count++;
        }
    }

    cout << count << endl;

    return 0;

}
