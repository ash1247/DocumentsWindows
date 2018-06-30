#include <bits/stdc++.h>

using namespace std;

int count(string a, string b, int m, int n)
{
    if ((m == 0 && n == 0) || n == 0)
    {
        return 1;
    }
    if (m == 0)
    {
        return 0;
    }
    if (a[m - 1] == b[n - 1])
    {
        return count(a, b, m - 1, n - 1) +
               count(a, b, m - 1, n);
    }
    else
    {
        return count(a, b, m - 1, n);
    }
}

int main()
{
    string a;

    cin >> a;

    string b = "QAQ";

    cout << count(a, b, a.size(), b.size()) << endl;

    /*
    string a;
    int ans = 0;
    cin >> a;

    int z = a.size();

    for(int i = 0; i < z-2; i++)
    {
        if(a[i]=='Q')
        {
            for(int j = i+1; j < z - 1; j++)
                if(a[j]=='A')
                {
                    for(int g = j+1; g < z; g++)
                           if(a[g]=='Q')
                                ans++;
                }
        }
    }
    */
    return 0;
}
