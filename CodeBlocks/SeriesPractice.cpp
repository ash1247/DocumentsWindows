#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int num = 0, ans = 0;

    cin >> num;

    int n = num;

    if(num == 0)
    {
        cout << 1 << "\n";
    }

    else
    {

        for(int i = 1; i <= num; i++)
        {
            ans = i + ans; //series 1 + 2 + 3 + ..... + n or 1 + (2 + 3) + (4 + 5 + 6) +......n
        }

        cout << ans <<"\n";

        ans = 0;

        for(int i = 1; i <= num; i++)
        {
            ans = pow(i, 2) + ans; // series 1^2 + 2^2 + 3^2 + ... + n^2
        }

        cout << ans <<"\n";

        ans = 0;

        for(int i = 1; i <= num; i++)
        {
            ans = pow(i, i) + ans; // series 1^1 + 2^2 + 3^3 + ... + n^n
        }

        cout << ans <<"\n";

        ans = 0;

        for(int i = 1; i <= num; i++) // series 1 - 2 + 3 - 4 + ..... n
        {
            if( i % 2 == 1)
            {
                ans = ans + i;
            }
            else if(i % 2 == 0)
            {
                ans = ans - i;
            }
        }

        cout << ans <<"\n";

        ans = 0;

    }

    for(int i = 1; i <= num; i++) // series 1*n + 2 * (n-1) +****+ n * 1
    {
        ans = (i * n) + ans;

        n = n - 1;
    }

    cout << ans <<"\n";

    ans = 0;


}
