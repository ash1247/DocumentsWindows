#include <bits/stdc++.h>

using namespace std;
inline void keep_window_open() { char ch; cin >> ch; }

int main(void)
{
	double d = 0;
	int x = { 20 };
	char b{ 42 };
	while (cin >> d)
	{
		int i = d;
		char c = i;
		int i2 = c;
		cout << "d == " << d
			<< " i == " << i
			<< " i2 == " << i2
			<< " char(" << c << ")\n";
	}
	keep_window_open();

	return 0;
}