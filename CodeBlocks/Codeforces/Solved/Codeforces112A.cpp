#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    string str1;
    string str2;

    cin >> str1;
    cin >> str2;

    int cmp = 0;

    for(int i = 0; i < str1.size(); i++)
    {
        if(tolower(str1[i]) < tolower(str2[i]) )
        {
            cmp = -1;
            break;
        }
        if(tolower(str1[i]) > tolower(str2[i]) )
        {
            cmp = 1;
            break;
        }
    }

    cout << cmp << "\n";

    return 0;
}
