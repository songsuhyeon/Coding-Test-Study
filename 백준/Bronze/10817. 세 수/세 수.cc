#include <iostream>
#include <vector>
#include<algorithm>

using namespace std;

int main()
{
	int a, b, c;

	cin >> a >> b >> c;

	vector<int> v;
	vector<int>::iterator start, end, iter;
	vector<int> v2;

	v.push_back(a);
	v.push_back(b);
	v.push_back(c);
	
	start = v.begin();
	end = v.end();

	sort(start, end);

	cout << v[1];

	return 0;
}