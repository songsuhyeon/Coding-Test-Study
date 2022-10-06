#include <iostream>
#include <vector>
#include<algorithm>

using namespace std;

int main()
{
	int n, k;

	vector<int> v;
	cin >> n >> k;

	for (int i = 0; i < n; i++)
	{
		int tmp;
		cin >> tmp;
		v.push_back(tmp);
	}
	
	for (int i = 0; i < n; i++)
	{
		if (v[i] < k)
			cout << v[i] << " ";
	}

	return 0;
}