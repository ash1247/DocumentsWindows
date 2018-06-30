#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    double a, b, c = 0;
    int d = 0, p = 1, q = 0;
    bool ch = true;

    while( ch )
    {
        cin >> a;

        if( a >= 0 && a <= 10 )
        {
            d++;
            c += a;
        }
        else
        {
            cout << "nota invalida\n";
        }

        if( d == 2)
        {
            b = c / 2.00;
            cout  << fixed << setprecision(2);
            cout << "media = " << b << endl;

            cout << "novo calculo (1-sim 2-nao)\n";
            cin >> p;

            d = 0;
            c = 0;

            if( p != 1 | p != 2)
            {
                while( true )
                {
                    if ( p == 1 | p == 2)
                    {
                        q = p;
                        break;
                    }
                    cout << "novo calculo (1-sim 2-nao)\n";
                    cin >> p;
                }
                if( q == 2)
                {
                    break;
                }
            }

        }
    }
    return 0;
}

