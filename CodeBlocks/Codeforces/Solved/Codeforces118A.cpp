#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    string str;
    char vowels[] = {'a', 'o', 'y', 'e', 'u', 'i'};

    cin >> str;

    transform(str.begin(), str.end(), str.begin(), ::tolower );

    for(int j = 0; j <= strlen(vowels); j++)
    {
        str.erase(remove(str.begin(), str.end(), vowels[j] ), str.end() ) ;
    }

    for(int i = 0; i < str.length(); i++)
    {
        str.insert(i, ".");
        i++;
    }

    cout << str << '\n';


}
