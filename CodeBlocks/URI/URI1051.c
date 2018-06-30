#include <stdio.h>

int main(void)
{
    float salary, percentage, percentage1, percentage2;

    scanf("%f", &salary);

    if(salary <= 0.00 || salary <= 2000.00)
    {
        printf("Isento\n");

    }
    else if(salary <= 2000.01 || salary <= 3000.00)
    {
        salary = salary - 2000.00;
        percentage = (salary * .08);
        printf("R$ %.2f\n", percentage);
    }
    else if(salary <= 3000.01 || salary <= 4500.00)
    {
        salary = salary - 3000;
        percentage = (salary * .18) + (1000 * .08);
        printf("R$ %.2f\n", percentage);
    }
    else if( salary >= 4500.01)
    {
        salary = salary - 4500;
        percentage = (salary * .28) + (1500 * .18)+ (1000 * .08);
        printf("R$ %.2f\n", percentage);
    }

    return 0;
}
