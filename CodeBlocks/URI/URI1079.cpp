#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int n, i;
    float num1, num2, num3, sum, average;

    scanf("%d", &n);

    for( i = 1; i <= n ; i++)
    {
        scanf("%f %f %f", &num1, &num2, &num3);
        average = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;

        printf("%.1f\n", average);

    }




    return 0;
}





