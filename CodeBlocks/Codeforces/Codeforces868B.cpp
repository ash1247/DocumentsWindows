#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int h, m, s, t1, t2, flag = 0;

    cin >> h >> m >> s >> t1 >> t2;

    int hour_hand = h;
    float minute_hand = (float)m / 5;
    float second_hand = (float) (s / 5);

    if( t2 > 12 & t1 == 12 )
    {
        t2 += 13;
    }
    if( t1 > 12 & t2 == 12 )
    {
        t1 += 13;
    }

    for( int i = t1; i <= t2; i++ )
    {
        cout << flag << endl;
        if( i % 13 ==  hour_hand  )
        {
            flag = 1;
            break;
        }
        if( ( (i * 60) % 61) / 5 == minute_hand )
        {
            flag = 1;
            break;
        }
        if( ( (i * 3600) % 61) / 5 == second_hand )
        {
            flag = 1;
            break;
        }
    }

    if( flag == 1)
    {
        cout << "NO\n";
    }
    else
    {
        cout << "YES\n";
    }

    return 0;
}
