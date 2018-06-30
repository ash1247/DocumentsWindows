#include <bits/stdc++.h>

void add(int *p)
{
    *p = (*p) + 1;
}
int main(void)
{
    int a = 10;
    add(&a);
    printf("%d\n",a);
}

