#include <stdio.h>

int main()

{
       int money,note100,note50,note20,note10,note5,note2,note1;
       scanf("%d",&money);
       printf("%d\n", money);
       note100=money/100;
       printf("%d nota(s) de R$ 100,00\n", note100);
       note50=(money%100)/50;
       printf("%d nota(s) de R$ 50,00\n", note50);
       note20=((money%100)%50)/20;
       printf("%d nota(s) de R$ 20,00\n", note20);
       note10=(((money%100)%50)%20)/10;
       printf("%d nota(s) de R$ 10,00\n", note10);
       note5=((((money%100)%50)%20)%10)/5;
       printf("%d nota(s) de R$ 5,00\n", note5);
       note2=(((((money%100)%50)%20)%10)%5)/2;
       printf("%d nota(s) de R$ 2,00\n", note2);
       note1=((((((money%100)%50)%20)%10)%5)%2)/1;
       printf("%d nota(s) de R$ 1,00\n", note1);


       return 0;


}


