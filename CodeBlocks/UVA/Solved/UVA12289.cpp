#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int t, count;
    string s;
    cin >> t;
    for(int i = 1; i <= t; i++)
    {
        count = 0;
        cin >> s;
        if( s.length() == 3 )
        {
            if( s[0] == 'o')
            {
                count++;
            }
            if(s[1] == 'n' )
            {
                count++;
            }
            if( s[2] == 'e' )
            {
                count++;
            }
            if( count >= 2)
            {
                printf("1\n");
            }
            else
            {
                printf("2\n");
            }
        }
        else
        {
            printf("3\n");
        }
    }

    return 0;
}
