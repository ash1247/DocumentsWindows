#include <bits/stdc++.h>

int main( void )
{
    char word[1001];
    char ch;

    scanf("%s", word);

    ch = toupper(word[0]);
    word[0] = ch;

    printf("%s", word);

    return 0;
}
