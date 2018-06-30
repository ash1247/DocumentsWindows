#include <bits/stdc++.h>

int main( void )
{
    char s[101];
    int i, j, length;

    scanf("%s", s);

    length = strlen(s);

    std::sort( s, s+length );

    for(i = (length/2); i <= length - 1 ; i++)
    {
        printf("%c", s[i] );
        if( i <= length - 2)
        {
            printf("+");
        }
    }
}
