#include<iostream>
#include <vector>

using namespace std;

int main() {
	
	int n;
	int a, b;

	vector<int> v;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> a >> b;
		v.push_back(a + b);
	}

	for (int i = 0; i < v.size(); i++)
	{
		cout << v[i] << endl;
	}

	return 0;
}
