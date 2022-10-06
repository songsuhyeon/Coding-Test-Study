#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int p, q;
	int n, k;


	cin >> n;
	cin >> k;

	vector<int> v;

	for (int i = 1; i <= n; i++)
	{
		if (n % i == 0)
			v.push_back(i);
	}

	cout << v[k - 1] << endl;


	return 0;
}