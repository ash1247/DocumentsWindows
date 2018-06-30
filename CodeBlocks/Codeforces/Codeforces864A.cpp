#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int i = 0;
    int j = 0;
    int k = 0;
    cin >> n;

    int a[n];


    for( i = 0; i < n; i++ )
    {
        cin >> a[i];
    }

    sort( a, a + n);

    for(i = 0; i < n; i++)
    {
        for(j = i + 1; j < n; )
        {
            if(a[i] == a[j])
            {
                for(k = j; k < n - 1; k++)
                {
                    a[k] = a[ k + 1];
                }
                --n;
            }
            else
            {
                j++;
            }
        }
    }

    if( n % 2 == 0 & n != 1 )
    {
        printf("YES\n");
        for( i = 0; i < n; i++ )
        {
            cout << a[i] << " ";
        }
        printf("\n");
    }
    else
    {
        printf("NO\n");
    }

    return 0;
}

