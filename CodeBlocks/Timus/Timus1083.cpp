#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int n;
    int k;

    string str;

    while( cin >> n >> str)
    {
        int ans = 1;

        k = str.length();

        while( n > 0)
        {
            ans = ans * n;
            n = n - k;
        }

        cout << ans << "\n";
    }
    return 0;
}
