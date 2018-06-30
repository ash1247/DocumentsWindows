#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int start, first, second, last, ans = 0;

    cin >> start >> first >> second >> last;

    while( start || first || second || last )
    {
        ans = 1080+((start-first+40)%40+(second-first+40)%40+(second-last+40)%40)*9;
        cout << ans << endl;
        cin >> start >> first >> second >> last;
    }
}
