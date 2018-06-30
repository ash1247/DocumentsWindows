#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int lucky[] = {4, 7, 44, 47, 74, 77, 447, 444, 477, 474, 744, 747, 774, 777};
    int check = 0;
    int length = sizeof( lucky ) / sizeof(int);

    cin >> n;

    for(int i = 0; i < length; i++)
    {
        if( n % lucky[i] == 0 )
        {
            check = 1;
            break;
        }
    }

    if( check == 1)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }

    return 0;
}
