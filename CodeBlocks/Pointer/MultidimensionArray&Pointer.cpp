#include <bits/stdc++.h>

void func2( int (*A)[6] )
{

}
void func3( int (*A)[2][2] )
{

}

int main(void)
{
    int B[6][6] = {
    {1,2,3,4,5,6} ,
    {7,8,9,10,11,12} ,
    {13,14,15,16,17,18} ,
    {19,20,21,22,23,24} ,
    {25,26,27,28,29,30} ,
    {31,32,33,34,35,36}
    };

    int C[3][2][2] = { { {2,5},{7,9} },
                       { {3,4}, {6,1} },
                        { {0,8}, {11,13} } };
    func2(B);
    func3(C);
    printf("%d %d %d %d\n", C, *C, C[0], &C[0][0] );

    /*printf("Values in the table\n");
    for(int i=0;i<6;i++)//For i<6 change 6 to the number of n rows.
    {
        for(int j=0;j<6;j++)//For j<6 change 6 to the number of n coloumns.
        {
            printf("%d\t",B[i][j]);
        }
        printf("\n");
    }
    printf("\nAddresses\n");
    for(int i=0;i<6;i++)//For i<6 change 6 to the number of n rows.
    {
        for(int j=0;j<6;j++)//For j<6 change 6 to the number of n coloumns.
        {
            printf("%d\t",&B[i][j]);
        }
        printf("\n");
    }
    //Here is the code you want to edit and get used to
    //the various additions you can do to get different values.
    printf("\nArithmatic\n");
    printf("%d\n",&B[5][5]);
    printf("%d\n",&B[0]+2);
    printf("%d\n",&B[0]+10);*/

    return 0;
}

