#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    string num;
    string danger0 = "0000000";
    string danger1 = "1111111";

    cin >> num;
    size_t found0 = num.find(danger0);
    size_t found1 = num.find(danger1);

    if( found0 != string::npos || found1 != string::npos )
    {
        cout << "YES" << "\n";
    }
    else
    {
        cout << "NO" << "\n";
    }
}


