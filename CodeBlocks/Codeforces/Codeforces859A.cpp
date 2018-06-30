#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int k, i;
    int count = 0;
    long int maxi = 0;

    cin >> k;

    long int A[k];

    for( i = 1; i <= k; i++ )
    {
        cin >> A[i];

        if( A[i] > maxi )
        {
            maxi = A[i];
        }
    }

    if( maxi > 25 )
    {
        count = maxi - 25;
    }

    cout << count << endl;

    return 0;

}
