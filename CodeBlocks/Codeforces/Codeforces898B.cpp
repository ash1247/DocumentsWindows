#include <bits/stdc++.h>

using namespace std;

int main(void)
{

    int a,b,n,check = 0, temp = 0, i = 0;

    cin >> n >> a >> b;

    for(i = 0; i*a <= n; i++)
    {
        temp = n - i*a;
        if( temp%b == 0)
        {
            check = 1;
            break;
        }
    }

    if(check == 1)
    {
        cout << "YES\n";
        cout << i << " " << temp/b << endl;
    }
    else
    {
        cout << "NO\n";
    }

    return 0;

    /*if(a== 1)
    {
        cout << "YES\n";
        cout << n << " 0\n";
        return 0;
    }
    else if(b==1)
    {
        cout << "YES\n";
        cout << n << " 0\n";
        return 0;
    }

    for(int i = 0; i <= x; i++)
    {
        for(int j = 0; j <= x; j++)
        {
            if( (a*i) + (b*j) == n)
            {
                cout << "YES" << endl;
                cout << i << " " << j << endl;
                return 0;
            }
        }
    }

    cout << "NO\n";*/

}

