#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main(void)
{
    lli a , b , c, mod;
    int cnt = 1;

    cin >> a >> b >> c;


    while( true && cnt <= 1e6)
    {
        if( a < b)
        {
            a *= 10;
        }

        mod = a % b;
        a /= b;

        if( a % 10 == c)
        {
            cout << cnt << endl;
            return 0;
        }

        cnt++;
        a = mod;
    }

    cout << -1 << endl;
    /*long double a,b;
    int i = 0, occ = 0;
    int check = 0;
    char c;
    long double ans = 0.0;
    string s;

    cin >> a >> b >> c;

    ans = a/b;
    stringstream ss;
    ss << fixed << setprecision( 20 ) << ans;
    s = ss.str();

    for(i = 0; i < s.length() - 1; i++)
    {
        if(s[i] == '.')
        {
            check = 1;
        }
        if(s[i] == c & check == 1)
        {
            occ = i - 1;
            break;
        }
        else
        {
            occ = -1;
        }
    }

    cout << occ << endl;*/
}

