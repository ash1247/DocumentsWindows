#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string s;
    string s1 = "``";
    string s2 = "''";
    char c;
    bool check = true;

    while( getline(cin, s) )
    {
        for(int i = 0; i <= s.size(); i++)
        {
            if( s[i] == '"' )
            {
                if(check){
                    s.erase(i, 1);
                    s.insert(i, s1);
                    check = false;
                }
                else{
                    s.erase(i, 1);
                    s.insert(i, s2);
                    check = true;
                }
            }
        }

        cout << s << endl;
    }
    return 0;
}
