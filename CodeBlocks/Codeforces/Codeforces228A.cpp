#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    set<long int> collection;
    long int s;
    int count = 0;


    for(int i = 0; i < 4; i++ )
    {
        cin >> s;
        collection.insert( s );
    }

    cout << 4 - collection.size() << endl;

    return 0;
}
