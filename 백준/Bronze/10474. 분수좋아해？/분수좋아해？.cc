#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(void) 
{
	int a, b;
	while (1)
	{
		cin >> a >> b;

		cin.ignore();

		if (a == 0 && b == 0)
			break;

		int x = 0;
		if (a >= b)
		{
			x = a / b;
		}

		cout << x << " " << a % b << " / " << b << "\n";
		
	}
	

	return 0;
}
