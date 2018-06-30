#include <bits/stdc++.h>
using namespace std;
unsigned long long a, b;

int sod(int z)
{
	int p,q=0;
	while(z!=0)
	{
		 p = z%10;
		 q+=p;
		 z = (z-p)/10;
	}
	return q;
}
int f(int z )
{
	while(z>=10)
	{
		z = sod(z);
	}
	return z;
}
int select(unsigned long long a,unsigned long long b){
	if(a==1){
	//	cout<<"1"<<endl;
	return 1;
	}
	else{
		unsigned long long x = (double)a;
		unsigned long long y = (double)b;
		unsigned long long z = (int)pow(x,y);
		//cout << f(z) << endl;
		return f(z);
	}
}
main()
{
    int T;
    cin >> T;
    for(int i=1;i<=T;i++){
	cin >> a >> b;
	cout << "Case " << i << ": " << select(a,b) << endl;
}
return 0;
}
