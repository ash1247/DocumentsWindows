#include <stdio.h>

int main(void)
{
    float salary, percentage, earned;

    scanf("%f", &salary);

    if(salary == 0.00 || salary <= 400.00)
    {
        percentage = (salary * 15) / 100;
        earned = salary + percentage;
        printf("Novo salario: %.2f\n", earned);
        printf("Reajuste ganho: %.2f\n", percentage);
        printf("Em percentual: 15 %%\n");
    }
    else if(salary == 400.01 || salary <= 800.00)
    {
        percentage = (salary * 12) / 100;
        earned = salary + percentage;
        printf("Novo salario: %.2f\n", earned);
        printf("Reajuste ganho: %.2f\n", percentage);
        printf("Em percentual: 12 %%\n");
    }
    else if(salary == 800.01 || salary <= 1200.00)
    {
        percentage = (salary * 10) / 100;
        earned = salary + percentage;
        printf("Novo salario: %.2f\n", earned);
        printf("Reajuste ganho: %.2f\n", percentage);
        printf("Em percentual: 10 %%\n");
    }
    else if(salary == 1200.01 || salary <= 2000.00)
    {
        percentage = (salary * 7) / 100;
        earned = salary + percentage;
        printf("Novo salario: %.2f\n", earned);
        printf("Reajuste ganho: %.2f\n", percentage);
        printf("Em percentual: 7 %%\n");
    }
    else if(salary >= 2000.01)
    {
        percentage = (salary * 4) / 100;
        earned = salary + percentage;
        printf("Novo salario: %.2f\n", earned);
        printf("Reajuste ganho: %.2f\n", percentage);
        printf("Em percentual: 4 %%\n");
    }
}
