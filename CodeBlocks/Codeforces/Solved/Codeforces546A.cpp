#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long long int w, k;
    long long int n, borrow;
    long long int total = 0;

    cin >> k >> n >> w;

    for(int i = 1; i <= w; i++)
    {
        total += i * k;
    }

    if(total > n)
    {
        borrow = labs(n - total);
    }
    else
    {
        borrow = 0;
    }

    cout << borrow << endl;

    return 0;
}
