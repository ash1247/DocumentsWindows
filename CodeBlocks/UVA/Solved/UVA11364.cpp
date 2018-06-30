#include <bits/stdc++.h>

using namespace std;
int main( void )
{
    int t, n, maxi, mini;
    cin >> t;
    while(t--)
    {
        maxi = INT_MIN;
        mini = INT_MAX;
        cin >> n;
        int *a = new int[n];

        for(int i = 0; i < n; i++)
        {
            cin >> a[i];
            maxi = max(a[i], maxi);
            mini = min(a[i], mini);
        }

        cout << (2 * (maxi - mini) ) << endl;
    }
}
