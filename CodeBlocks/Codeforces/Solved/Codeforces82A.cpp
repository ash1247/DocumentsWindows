#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long long int n, p = 1;

    cin >> n;

    while ( p * 5 < n)
    {
        n -= p * 5;
        p *= 2;
    }

    string names[] = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

    cout << names[ ( n - 1 ) / p ] << endl;
}
