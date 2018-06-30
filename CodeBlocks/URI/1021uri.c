#include<stdio.h>

int main(void)

{
        float moneyin, moedas1;
        int money, moedas;

        scanf("%f",&moneyin);
        money = (int)(moneyin);

        moedas1 = round((((moneyin - money) * 100)));

        moedas = (int)moedas1;

        printf("NOTAS:\n");


        printf("%d nota(s) de R$ 100.00\n", money/100);

        printf("%d nota(s) de R$ 50.00\n", ((money%100)/50) );

        printf("%d nota(s) de R$ 20.00\n", (((money%100)%50)/20) );

        printf("%d nota(s) de R$ 10.00\n", ((((money%100)%50)%20)/10));

        printf("%d nota(s) de R$ 5.00\n", (((((money%100)%50)%20)%10)/5));

        printf("%d nota(s) de R$ 2.00\n", ((((((money%100)%50)%20)%10)%5)/2) );

        printf("MOEDAS:\n");

        printf("%d moeda(s) de R$ 1.00\n", (((((((money%100)%50)%20)%10)%5)%2)/1) );

        printf("%d moeda(s) de R$ 0.50\n", (moedas/50) );

        printf("%d moeda(s) de R$ 0.25\n", ((moedas%50)/25) );

        printf("%d moeda(s) de R$ 0.10\n",(((moedas%50)%25)/10) );

        printf("%d moeda(s) de R$ 0.05\n",((((moedas%50)%25)%10)/05) );

        printf("%d moeda(s) de R$ 0.01\n",((((moedas%50)%25)%10)%05)/01 );


        return 0;


}
