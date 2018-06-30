#include <bits/stdc++.h>

using namespace std;

int main(void )
{
    int t, i;
    string s;
    cin >> t;
    while(t--)
    {
        cin >> s;
        i = s.length();
        if( s == "1" | s== "4" | s=="78")
        {
            s = "+\n";
        }
        else if( s[i - 1] == '5' & s[i - 2] == '3')
        {
            s = "-\n";
        }
        else if( s[0] == '9' & s[i-1] == '4')
        {
            s = "*\n";
        }
        else if( s[0] == '1' & s[1] == '9' & s[2] == '0' )
        {
            s = "?\n";
        }
        cout << s;
    }
    return 0;
}

