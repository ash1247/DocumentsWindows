#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    char word[120];
    int n, size, count = 0, i;

    scanf("%d", &n);

    for(i = 1; i <= n; i++)
    {
        scanf("%s", word);
        size = strlen(word);
        if(size > 10)
        {
            count = size - 2;
            printf("%c", word[0]);

            printf("%d", count);

            printf("%c\n", word[size - 1]);
        }
        else
            printf("%s\n", word);
    }

    return 0;
}
