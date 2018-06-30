#include <bits/stdc++.h>

int main(void)
{
    int m = 3, n = 3;
    int A[m][n] = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
    };

    int top = 0;
    int bottom = m -1;
    int left = 0;
    int right = n - 1;
    int dir = 0;

    while( top <= bottom & left <= right )
    {
        if( dir == 0 )
        {
            for(int i = left; i <= right; i++)
            {
                printf("%d ", A[top][i]);
            }
            top++;
        }
        else if(dir == 1)
        {
            for(int i = top; i <= bottom; i++)
            {
                printf("%d ", A[i][right] );
            }
            right--;
        }
        else if(dir == 2)
        {
            for(int i = right; i >= left; i--)
            {
                printf("%d ", A[bottom][i] );
            }
            bottom--;
        }
        else if(dir == 3)
        {
            for(int i = bottom; i >= top; i--)
            {
                printf("%d ", A[i][left] );
            }
            left++;
        }
        dir = (dir+1)%4;

    }
}
