#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int n;
    int dot;
    int odd = 1;
    int k = 0;

    cin >> n;

    dot = n - 1;

    cout << "\n\n";

    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            cout << "*";
        }

        for(int j = n - 1; j >= i; j--)
        {
            cout << ".";
        }

        cout << "\n";
    }

    cout << "\n\n";

    for(int i = 1; i <= n; i++)
    {

        for(int j = 1; j <= i -1 ; j++)
        {
            cout << ".";
        }

        for(int j = n; j >= i; j--)
        {
            cout << "*";
        }

        cout << "\n";
    }

    cout << "\n\n";


    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= dot; j++)
        {
            cout << ".";
        }
        for(int j = 1; j <= odd; j++)
        {
            cout << "*";
        }
        for(int j = 1; j <= dot; j++)
        {
            cout << ".";
        }

        cout << "\n";

        odd = odd + 2;
        dot = dot - 1;
    }

    cout << "\n\n";


    odd = ((n - 1) * 2) + 1;
    dot = n - 1;


    for(int i = 1; i <= n; i++)
    {

       for(int j = 1; j <= i - 1; j++)
       {
           cout << ".";
       }

       for(int j = odd; j >= 1; j--)
       {
           if(j <= dot)
           {
               k = k - 1;
           }
           else
           {
               k = k + 1;
           }

           cout << k;
       }

       for(int j = 1; j <= i - 1; j++)
       {
           cout << ".";
       }

        cout << "\n";

        odd = odd - 2;
        k = 0;
        dot = dot - 1;

    }

    cout << "\n\n";

    odd = ((n - 1) * 2) + 1;
    dot = odd / 2;
    int column = 1;

    k = 0;

    for(int i = 1; i <= odd; i++)
    {
       for(int j = 1; j <= dot; j++)
       {
            cout << ".";
       }

       if(i <= n - 1)
       {
           k = i;
           dot = dot - 1;
       }
       else
       {
           k = (odd + 1) - i;
           dot = dot + 1;
       }

       for(int j = 1; j <= column; j++)
       {
           int midColumn = column / 2 + 1;

           cout << k;

           if( j < midColumn )
           {
               k--;
           }
           else
           {
               k++;
           }
       }

       cout << "\n";

       if(i <= odd / 2  )
       {
           column = column + 2;
       }
        else
       {
           column = column - 2;
       }

        k = 0;


    }

    cout << "\n\n";

}
