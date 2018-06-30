#include <stdio.h>
#include <math.h>

int main(void)
{
    float n1, n2, n3, n4, n5, average1, average2;

    scanf("%f %f %f %f", &n1, &n2, &n3, &n4);

    average1 = (n1*2 + n2*3 + n3*4 + n4) / ( 4 + 3 + 2 + 1);

    printf("Media: %.1f\n", average1 );


    if( average1 >= 5.0 && average1 <= 6.9 )
     {
        printf("Aluno em exame.\n");

        scanf("%f", &n5);
        printf("Nota do exame: %.1f\n", n5);

        average2 = (average1 + n5) / 2;

        if( average2 >= 5.0 )
        printf("Aluno aprovado.\n");

        else if( average2 <= 4.9 )
        printf("Aluno reprovado.\n");

        printf("Media final: %.1f\n", average2 );
     }

    else if( average1 >= 7.0 )
        printf("Aluno aprovado.\n");

    else if( average1 < 5.0 )
        printf("Aluno reprovado.\n");

    else
        printf("Please enter a valid number.\n");

    return 0;
}
