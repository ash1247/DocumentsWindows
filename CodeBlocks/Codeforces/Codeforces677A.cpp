#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, h;
    int count = 0;
    cin >> n >> h;

    int a[n];

    for(int i = 1; i <= n; i++ )
    {
        cin >> a[i];
        if( a[i] > h)
        {
            count += 2;
        }
        else
        {
            count++;
        }
    }


    cout << count << endl;

    return 0;
}
