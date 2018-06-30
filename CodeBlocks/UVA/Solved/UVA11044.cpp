#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int t, n, m, ans = 0;
    cin >> t;
    while(t--)
    {
        cin >> n >> m;
        ans = (n / 3) * (m / 3) ;
        cout << ans << endl;
    }
    return 0;
}
