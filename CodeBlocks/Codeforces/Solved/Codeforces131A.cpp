#include <bits/stdc++.h>

int main( void )
{
    char word[101];
    char ch;
    int i;
    int length;
    bool cont = true;

    scanf("%s", word);

    length = strlen( word );

    for( i = 1; i < length; i++)
    {
        if( word[i] >= 'a' )
        {
            cont = false;
            break;
        }
    }

    if(cont)
    {
        for( i = 0; i < length; i++ )
        {
            if( word[i] >= 'a' )
            {
                word[i] -= ( 'a' - 'A');
            }
            else
            {
                word[i] += ( 'a' - 'A');
            }
        }
    }

    printf("%s\n", word);


    return 0;
}

