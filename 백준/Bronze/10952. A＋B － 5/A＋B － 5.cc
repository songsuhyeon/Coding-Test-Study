#include<iostream>
#include <vector>

using namespace std;

int main() {
	
	int a, b;

	vector<int> v;

	while(1)
	{
		cin >> a >> b;
		v.push_back(a + b);

		if (a == 0 && b == 0)
			break;

	}

	for (int i = 0; i < v.size() - 1; i++)
	{
		cout << v[i] << endl;
	}

	return 0;
}
