#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int n; // 학생의 수
	cin >> n;

	// yyyy, mm, dd, name
	vector<pair<pair<int, int>, pair<int, string>>> v(n);

	for (int i = 0; i < n; i++)
	{
		cin >> v[i].second.second >> v[i].second.first >> v[i].first.second >> v[i].first.first;
	}

	sort(v.begin(), v.end());

	cout << v[v.size()-1].second.second << endl;
	cout << v[0].second.second << endl;

	return 0;
}