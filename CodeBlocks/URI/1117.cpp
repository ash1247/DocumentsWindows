#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    double a, b, c = 0;
    int d = 0;

    while( true )
    {
        if( d == 2)
        {
            break;
        }

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
    }
    b = c / 2.00;
    cout  << fixed << setprecision(2);

    cout << "media = " << b << endl;
}
