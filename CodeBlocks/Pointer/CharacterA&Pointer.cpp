#include <bits/stdc++.h>

void print(char* c)
{
    while( *c != '\0')
    {
        printf("%c", *c);
        c++;
    }
}
int main(void)
{
    char c[20] = "hello";
    print(c);
}


