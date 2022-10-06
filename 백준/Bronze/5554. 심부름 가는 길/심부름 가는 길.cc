#include <iostream>
#include <string>

using namespace std;

int main(void) 
{
	int n = 4;
	int sum = 0;
	while (n--)
	{
		int s;
		cin >> s;
		sum += s;
	}

	cout << sum / 60 << "\n";
	cout << sum % 60 << "\n";

	return 0;
}
