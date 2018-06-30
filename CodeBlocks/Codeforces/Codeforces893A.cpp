#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    cin >> n;
    int flag = 0;
    int a[n];

    char p[3] = { 'A', 'B', 'C'};

    for(int i = 1; i <= n; i++)
    {
        cin >> a[i];
        if( a[i] == 1 & (p[0] == 'A' | p[1] == 'A') )
        {
            if( p[0] == 'A')
            {
                swap( p[1], p[2] );
            }
            else if( p[1] == 'A' )
            {
                swap( p[0], p[2] );
            }
        }
        else if( a[i] == 2 & (p[0] == 'B' | p[1] == 'B') )
        {
            if( p[0] == 'B')
            {
                swap( p[1], p[2] );
            }
            else if( p[1] == 'B' )
            {
                swap( p[0], p[2] );
            }
        }
        else if( a[i] == 3 & (p[0] == 'C' | p[1] == 'C') )
        {
            if( p[0] == 'C')
            {
                swap( p[1], p[2] );
            }
            else if( p[1] == 'C' )
            {
                swap( p[0], p[2] );
            }
        }
        else
        {
            flag = 1;
        }
    }

    if( flag == 0 )
    {
        cout << "YES\n";
    }
    else if( flag == 1 )
    {
        cout << "NO\n";
    }

    return 0;
}


/*
#include <bits/stdc++.h>

#define itn int
#define all(x) (x).begin(), (x).end()
#define make_unique(x) sort(all((x))); (x).resize(unique(all((x))) - (x).begin())

#ifdef ONLINE_JUDGE
	inline int pidorand() {
		return ((rand() & 32767) << 15) | (rand() & 32767);
	}
	#define rand pidorand
#endif	// ONLINE_JUDGE

#ifdef OLBOEB
	#define return std::cerr << __FUNCTION__ << "\n"; return
#endif  // OLBOEB

using namespace std;

inline int nxt() {
	int x;
	scanf("%d", &x);
	return x;
}

int main() {
	int n = nxt();
	vector<int> a(n);
	for (int i = 0; i < n; ++i) {
		a[i] = nxt();
	}

	int spec = 3;
	for (int x : a) {
		if (x == spec) {
			puts("NO");
			return 0;
		}
		spec = 6 - x - spec;
	}
	puts("YES");

	return 0;
}*/
