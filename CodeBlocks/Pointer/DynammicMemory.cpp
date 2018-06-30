#include <bits/stdc++.h>

int main(void)
{
    //c
    int a;
    int *p;
    p = (int*) malloc(sizeof(int));
    *p = 20;
    p = (int*)malloc(20* sizeof(int));
    *p = 20;

    free(p);

    //c++
    p = new int;
    delete p;
    p = new int[20];
    delete[] p;
}



