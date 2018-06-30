#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int n, k;       // n is the number of contestants
    int count = 0;
    int a[100];                //k is the pass mark

    scanf("%d %d", &n, &k);

    for(int i = 1; i <= n; i++)
    {
        scanf("%d", &a[i]);
    }

    for(int i = 1; i <= n; i++)
    {
        if(a[i] > 0 & a[i] >= a[k] )
        {
            count++;
        }
    }

    printf("%d\n", count);


}
