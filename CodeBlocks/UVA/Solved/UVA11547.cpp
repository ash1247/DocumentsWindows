#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int t;
    int n, cal, ans;

    cin >> t;
    while(t--){
        ans = 0;
        cin >> n;

        cal = ((( ( (n * 567) / 9 ) + 7492 ) * 235 ) / 47 ) - 498;
        ans = (cal / 10) % 10;
        cout << abs(ans) << endl;
    }
}
