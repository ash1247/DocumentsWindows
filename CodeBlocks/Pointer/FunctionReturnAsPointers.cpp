#include<bits/stdc++.h>

int* Add(int* a, int* b)
{
    int *c = (int*)malloc(sizeof(int));
    *c = (*a)+(*b);
    return c;
}
int main(void)
{
    int a = 2, b = 4;
    int* p = Add(&a,&b);
    printf("Sum = %d\n", *p);
}
