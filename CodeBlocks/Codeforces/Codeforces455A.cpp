#include <bits/stdc++.h>
#define LLI long long int

using namespace std;

int main( void )
{
    LLI n, x;

    const int MAX_N = 100001;

    vector<LLI> cnt( MAX_N, 0);
    vector<LLI> f( MAX_N, 0);

    cin >> n;

    while( n-- )
    {
        cin >> x;
        cnt[x]++;
    }

    f[0] = 0;
    f[1] = cnt[1];

    for(int i = 2; i <= MAX_N; i++ )
    {
        f[i] = max( f[i - 1], ( f[i - 2] + cnt[i] * i ) );
    }

    cout << f[MAX_N - 1] << endl;

    return 0;
}
