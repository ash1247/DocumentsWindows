#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, m;
    string s;
    int l, r;
    char c1, c2;
    cin >> n >> m >> s;

    for(int i = 0; i < m; i++ )
    {
        cin >> l >> r >> c1 >> c2;
        for(int j = l; j <= r; j++)
        {
            if( s[ j - 1] == c1 )
            {
                s[ j - 1] = c2;
            }
        }
    }

    cout << s << endl;
}
