#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int t;

    cin >> t;

    for( int i = 1; i <= t; i++ )
    {
        long long int n, k, M;
        cin >> n >> k >> M;

        long long int a[n], b[n], sum[n], c = 0;

        for(int k = 1; k <= n; k++)
        {
            a[k] = 0;
            b[k] = 0;
        }

        b[n] = 1;

        for(int j = 1; j <= n ; j++)
        {
            sum[j] = ((a[j] ^ b[j]) ^ c);
            c = ((a[j] & b[j]) | (a[j] & c)) | (b[j] & c);
        }

        for(int j = 1; j <= n ; j++)
        {
            cout << sum[j] << "\n";
        }




    }
}
