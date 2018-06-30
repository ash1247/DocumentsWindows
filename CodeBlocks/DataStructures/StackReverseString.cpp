#include <bits/stdc++.h>

using namespace std;

void Reverse( char *c, int n);

int main( void )
{
    char s[51];
    printf("Enter a string: ");
    cin >> s;
    Reverse( s, strlen(s) );

    cout << "Output: " << s << endl;
}

void Reverse( char *c, int n)
{
    stack<char> s;
    for(int i = 0; i < n; i++ )
    {
        s.push( c[i] );
    }

    for(int i = 0; i < n; i++ )
    {
        c[i] = s.top();
        s.pop();
    }
}
