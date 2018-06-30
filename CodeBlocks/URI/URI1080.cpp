#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int n, i, largest = 0, pos = 0;

    for( i = 1; i <= 100 ; i++)
    {
        scanf("%d", &n);
        if( n > largest)
        {
            largest = n;
            pos = i;
        }
    }

    printf("%d\n%d\n", largest, pos);

    return 0;
}





