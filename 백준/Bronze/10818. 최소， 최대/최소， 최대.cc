#include <iostream>

using namespace std;

int main()
{
	int n;
	cin >> n;

	int tmp;
	int max, min;

	cin >> tmp;
	
	max = tmp;
	min = tmp;


	for (int i = 1; i < n; i++)
	{
		cin >> tmp;

		if (tmp >= max)
		{
			max = tmp;
		}
		else if (tmp <= min)
		{
			min = tmp;
		}
	}

	cout << min << " " << max;

	return 0;
}