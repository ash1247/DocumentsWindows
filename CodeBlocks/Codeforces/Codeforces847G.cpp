#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    long int sum = 0;
    long int remainder = 0;
    long int max = 0;

    cin >> n;

    int A[n];

    for(int i = 1; i <= n; i++)
    {
        cin >> A[i];
        sum += A[i];
    }

    if( n < 9)
    {
        while ( sum > 0 )
        {
            remainder = sum % 10;
            if ( remainder > max && remainder <= n )
            {
                max = remainder;
            }
            sum /= 10;
        }
    }

    cout << max << endl;

    return 0;
}
