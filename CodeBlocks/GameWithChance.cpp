#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <time.h>

int main( void )
{
    int die1, die2, die3;
    int dieSumP, dieSum;
    int win = 0;
    int lose = 0;
    clock_t t;
    char ch;

    srand(t);
    die1 = ( rand() % 6) + 1;
    die2 = ( rand() % 6) + 1;
    die3 = ( rand() % 6) + 1;

    dieSum = die1 + die2 + die3;

    printf("Sum of the numbers of three die are %d\n\n", dieSum);

    printf("What do you think of the next time?\n");
    printf("Will it be higher or lower?\n");
    printf("Type in 'H' or 'h' for High or 'L' or 'l' for Low\n");
    printf("and press enter.\n");
    printf("To quit the game, type in 'q' and press enter.\n\n");

    while( ch != 'q' )
    {
        dieSumP = dieSum;

        printf("Previous Sum of the numbers of three die were %d\n\n", dieSumP);

        scanf("%c", &ch);
        getchar();

        printf("You entered %c\n", ch);

        if(ch == 'H' || ch == 'h' || ch == 'L' || ch == 'l' )
        {
            printf("\n\n");

            die1 = ( rand() % 6) + 1;
            die2 = ( rand() % 6) + 1;
            die3 = ( rand() % 6) + 1;

            dieSumP = dieSum;

            dieSum = die1 + die2 + die3;

            printf("Sum of the numbers of three die are %d\n\n", dieSum);

            if( ch == 'H' || ch == 'h' )
            {
                if( dieSumP < dieSum )
                {
                    printf("Congratulation you win.\n\n");
                    win++;
                }
                else
                {
                    printf("You lose.\n\n");
                    lose++;
                }
            }
            else if(ch == 'L' || ch == 'l')
            {
                if( dieSumP > dieSum )
                {
                    printf("Congratulation you win.\n\n");
                    win++;
                }
                else
                {
                    printf("You lose.\n\n");
                    lose++;
                }
            }

            printf("You won %d times, lost %d times\n\n", win, lose);
            printf("What do you think of the next time?\n");
            printf("Will it be higher or lower?\n");
            printf("Type in 'H' or 'h' for High or 'L' or 'l' for Low\n");
            printf("and press enter.\n");
            printf("To quit the game, type in 'q' and press enter.\n\n");
        }
        else if( ch == 'q' )
        {
            printf("You won %d times, lost %d times\n\n", win, lose);
            printf("Thanks for playing.\n");
            printf("This program will close now.\n");
            break;
        }
        else
        {
            printf("Please enter a valid command.\n\n");
        }
    }

    return 0;
}
