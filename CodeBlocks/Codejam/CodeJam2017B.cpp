#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int t;
    int array[20];
    long long int number;
    int digit;
    int i, j;
    scanf("%d", &t);

    for(i = 1; i <= t; i++)
    {
        scanf("%lld", &number);

        string s = stoi(number);
        int siz = s.size();

        for( j = 1; j < siz; j++)
        {
            digit = number%10;
            number /= 10;
            array[j] = digit;
            printf("ss%d\n", array[j]);

        }

        if(array[j] >= array[j+1] )
        {
            printf("sds%d\n", array[j]);
        }

    }
}
