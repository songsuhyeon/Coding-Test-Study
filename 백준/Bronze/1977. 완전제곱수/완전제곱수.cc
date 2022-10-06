#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int m, n;
	int sum = 0;
	vector<int> v;

	cin >> m >> n;

	for (int i = m; i <= n; i++)
	{
		for (int j = 1; j <= i; j++)
		{
			if (i == j * j)
			{
				sum += i;
				v.push_back(i);
			}
		}
	}
	
	if (v.size() == 0)
	{
		cout << -1;
	}
	else
	{
		cout << sum << endl;
		cout << v[0] << endl;
	}

	return 0;
}