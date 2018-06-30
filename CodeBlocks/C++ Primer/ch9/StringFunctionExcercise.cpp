#include <iostream>
#include <string>

using namespace std;

void stringReplace( string &s, string &oldVal, string &newVal)
{
    auto iter = s.begin();
    s.replace( newVal, )
    //s.erase( oldVal.size() );
    //s.insert( s.size(), newVal );
}

int main()
{
    string s1, s2, s3;
    cin >> s1 >> s2 >> s3;

    stringReplace(s1,s2,s3);

    cout << s1 << endl;
    cout << s2 << endl;
    cout << s3 << endl;
}
