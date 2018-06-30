#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int t, n;
    int i = 0, j = 0;
    int count = 0;

    cin >> t;

    for( i = 1; i <= t; i++ )
    {
        cin >> n;

        long int A[n];
        long int B[n];
        count = 0;
        int k = n;

        for( j = 1; j <= n; j++ )
        {
            cin >> A[j];
        }

        while( k != 0 )
        {
            if( A[n] / A[n - 1] != (long int)sqrt(A[n]) )
            {
                break;
            }
            else if( A[k] / A[k - 1] == (long int)sqrt(A[n]) )
            {
                count++;
            }
            if ( k == 1)
            {
                break;
            }

            k--;
        }

        if( count + 1 == n)
        {
            printf("YES\n");
            for( k = 1; k <= n; k++)
            {
                printf("%d ", k);
            }
            printf("\n");
        }
        else
        {
            printf("NO\n");
        }
    }

}
