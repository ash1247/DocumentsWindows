#include <bits/stdc++.h>

int main(void)
{
    int x = 5;
    int *p = &x;
    int *(*q) = &p;
    int *(*(*r)) = &q;

    printf("%d\n", x);
    printf("%d\n", p);
    printf("%d\n", *p);
    printf("%d\n", q);
    printf("%d\n", *(*q));
    printf("%d\n", *r);
    printf("%d\n", *(*r));
    printf("%d\n", *(*(*r)));
    *(*(*r)) = 10;
    printf("%d\n", x);

}
