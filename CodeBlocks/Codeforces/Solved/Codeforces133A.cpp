#include <bits/stdc++.h>

int main( void )
{
    char word[101];
    int i, j = 0;
    int length;

    scanf("%s", word);

    length = strlen( word );

    for( i = 0; i < length; i++)
    {
        if( word[i] == 'H' || word[i] == 'Q' || word[i] == '9'  )
        {
            j = 1;
        }
    }

    if( j == 1)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }

    return 0;
}


