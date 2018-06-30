#include <stdio.h>

int main(void)
{
    double tempCel, tempFar;
    char t;
    int temp;
    int i = 1;

   while(scanf("%d %c", &temp, &t) != EOF)
   {

    if(t == 'F')
    {
        tempCel = ((((double)temp - 32) * 5) / 9);
        printf("Case %d: %.2f degree Centigrade\n", i, tempCel );
        i++;
    }

    else if(t == 'C')
    {
        tempFar = ((((double)9 * temp) / 5) + 32);
        printf("Case %d: %.2f degree Fahrenheit\n", i, tempFar );
        i++;
    }

    }

}
