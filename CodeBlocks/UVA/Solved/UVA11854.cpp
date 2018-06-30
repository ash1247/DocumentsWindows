#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int x, y, z, large, small, medium, rightAngle;

    while(scanf("%d %d %d", &x, &y, &z) != EOF)
    {
        large = max(x, max(y, z));
        small = min(x, min(y, z));
        medium = (x + y + z) - (large + small);

        rightAngle = (small * small) + (medium * medium) ;

        if(x == 0 && y == 0 && z == 0)
            break;

        if(sqrt(rightAngle) == large)
            printf("right\n");
        else
            printf("wrong\n");
    }
}
