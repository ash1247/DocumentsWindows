#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    char ch[4] = {'^','v', '<', '>'};
    int j , k , l;
    char cinput1, cinput2;
    long int input;

    scanf("%c %c", &cinput1, &cinput2);
    scanf("%d", &input);

    for( int i = 0; i < 4; i++)
    {
        if( cinput1 == ch[i] )
        {
            j = i;
        }
    }

    for( int i = 0; i < input; i++)
    {
        if( j < 4)
        {
            j = 0;
        }
        if( cinput1 == cinput2)
        {
            l = k;
            break;
        }
        k++;
    }




    printf("%d\n", 8l);


}
