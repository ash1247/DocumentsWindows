#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int t;
    int n, a, b;

    cin >> t;

    for(int i = 1; i <= t; i++)
    {
        cin >> n;

        if( n > 10)
        {
            a = n - 10;
            b = 10;
        }
        else
        {
            a = 0;
            b = n;
        }

        cout << a << " " << b << "\n";

        a = 0;
        b = 0;
    }

    return 0;
}

