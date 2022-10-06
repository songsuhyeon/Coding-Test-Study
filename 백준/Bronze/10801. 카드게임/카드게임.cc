#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(void) 
{
	int a[11] = { 0 };
	int b[11] = { 0 };

	for (int i = 1; i <= 10; i++)
	{
		cin >> a[i];
	}
	for (int i = 1; i <= 10; i++)
	{
		cin >> b[i];
	}

	for (int i = 1; i <= 10; i++)
	{
		if (a[i] < b[i])
			b[0]++;
		else if(a[i] > b[i])
			a[0]++;
		else if (a[i] == b[i])
		{
			a[0]++;
			b[0]++;
		}
	}

	if (a[0] < b[0])
		cout << "B";
	else if (a[0] > b[0])
		cout << "A";
	else if (a[0] == b[0])
		cout << "D";

	return 0;
}
