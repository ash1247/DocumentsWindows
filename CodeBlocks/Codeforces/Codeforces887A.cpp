#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string s;
    long long int sum = 0;

    cin >> s;

    for(int i = 0; i < s.length(); i++ )
    {
        sum += s[i];
    }

    if( sum >= 385 | sum == 337 )
    {
        cout << "yes\n";
    }
    else
    {
        cout << "no\n";
    }

    return 0;
}
