#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(void) 
{
	int n;
	cin >> n;
	int a = 0, b = 0;

	while (n--)
	{
		int ai, bi;
		cin >> ai >> bi;

		if (ai > bi)
			a++;
		else if (ai < bi)
			b++;
	}
	
	cout << a << " " << b;

	return 0;
}
