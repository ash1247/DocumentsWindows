#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, a, b, ans = 0;
    cin >> n >> a >> b;

    ans = ( ( a - 1 + b) % n + n) % n + 1;

    cout << ans << endl;
}

