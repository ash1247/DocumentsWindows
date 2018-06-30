#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n = 0, t = 0;

    cin >> n >> t;

    char pos[n];

    cin >> pos;

    while( t-- )
    {
        for(int i = 1; i < n; i++)
        {
            if( pos[i] == 'G' && pos[i - 1] == 'B')
            {
                pos[i] = 'B';
                pos[i - 1] = 'G';
                i++;
            }
        }
    }

    cout << pos << endl;

    return 0;

}
