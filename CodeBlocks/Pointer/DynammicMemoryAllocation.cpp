#include<bits/stdc++.h>

int main(void)
{
    //c
    int n = 5;
    //(int*) is typecasting because they return void pointer
    int *p = (int*)malloc(20 * sizeof(int)); //allocates memory 20 * size of int
    int *q = (int*)calloc(40, sizeof(int)); //same as malloc but initializes whole q with 0.
    int *r1 = (int*)realloc(p, 2 * n * sizeof(int)); //reallocates memory by copying p into q and doubles it's size
    int *r2 = (int*)realloc(NULL, 2 * n * sizeof(int)); //same as malloc

    free(p);

}




