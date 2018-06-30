#include <bits/stdc++.h>


int main(void)
{
    int i;
    int sum;
    double average;
    for(i = 1; i <= 550; i++)
    {
        sum += i;
    }

    average = (double)sum/550;
    printf("%lf",average);
}
