#include <bits/stdc++.h>

int Add(int a, int b)
{
    return a+b;
}
int* Function(int a) //a function that would return int* pointer to int
{

}
void hello(char *name)
{
    printf("Hello %s\n", name);
}
int (*Function2)(int a); // a function pointer


int main(void)
{
    int c;
    int (*p)(int, int);
    p = &Add;
    //p = Add works as same
    c = (*p)(2,3);
    //c = p(2,3) work as same
    printf("%d\n",c);
    void (*ptr)(char*);
    ptr = hello;
    ptr("Ashik");
}
