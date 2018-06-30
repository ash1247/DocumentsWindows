
#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int n, num, i;
    char c;
    float coe = 0, rat = 0, sap = 0;
    float total;
    float coep, ratp, sapp;

    scanf("%d", &n);

    for( i = 1; i <= n; i++)
    {
        scanf("%d %c", &num, &c);
        if(c == 'C')
            coe += num;
        else if(c == 'R')
            rat += num;
        else if(c == 'S')
            sap += num;
    }

    total = coe + rat + sap;

    coep = ((coe/total)*100);
    ratp = ((rat/total)*100);
    sapp = ((sap/total)*100);

    printf("Total: %d cobaias\n", (int)total);
    printf("Total de coelhos: %d\n", (int)coe);
    printf("Total de ratos: %d\n", (int)rat );
    printf("Total de sapos: %d\n", (int)sap);
    printf("Percentual de coelhos: %.2f %%\n", coep);
    printf("Percentual de ratos: %.2f %%\n", ratp );
    printf("Percentual de sapos: %.2f %%\n", sapp);

}






