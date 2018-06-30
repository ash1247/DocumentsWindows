#include <bits/stdc++.h>

using namespace std;

void matrix_chain_order( int *p, int n );
void print_parenthesis(int i, int j, int n,
                      int *bracket, char &name);

int main ( void )
{
    int n;

    cin >> n;

    int P[n];

    for(int i = 0; i < n; i++ )
    {
       cin >> P[i];
    }

    matrix_chain_order( P, n);

    return 0;
}

void matrix_chain_order( int *p, int n )
{
    int m[n][n];
    int bracket[n][n];
    for (int i=1; i<n; i++)
    {
        m[i][i] = 0;
    }
    for (int L=2; L<n; L++)
    {
        for (int i=1; i<n-L+1; i++)
        {
            int j = i+L-1;
            m[i][j] = INT_MAX;
            for (int k=i; k<=j-1; k++)
            {
                int q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];

                if (q < m[i][j])
                {
                    m[i][j] = q;
                    bracket[i][j] = k;
                }
            }
        }
    }

    char name = 'A';

    cout << "Optimal Parenthesization is : ";
    print_parenthesis(1, n-1, n, (int *)bracket, name);
    cout << "\nOptimal Cost is : " << m[1][n - 1] << endl;

}

void print_parenthesis(int i, int j, int n,
                      int *bracket, char &name)
{
    if (i == j)
    {
        cout << name++;
        return;
    }

    cout << "(";
    print_parenthesis(i, *((bracket+i*n)+j), n,bracket, name);
    print_parenthesis(*((bracket+i*n)+j) + 1, j,
                     n, bracket, name);
    cout << ")";
}
