#include<bits/stdc++.h>

using namespace std;

int main(void)
{
    long long int n, a[200000];

    scanf("%lld", &n);

    for(int i = 1; i <= n; i++)
    {
        scanf("%lld", &a[i]);
    }

    for(int i = 1; i <= n; i++)
    {
        int min = a[i] - a[i - 1];
        printf("%d\n", min);
    }

}
