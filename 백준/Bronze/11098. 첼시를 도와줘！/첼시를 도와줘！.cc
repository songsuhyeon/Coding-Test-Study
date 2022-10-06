#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int n; // 테스트 케이스 개수
	int p; // 고려해야될 선수의 수 : 선수 정보 표시

	int price;
	string name;

	vector<pair<int, string>> group;
	vector<pair<int, string>> list;

	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> p;
		for (int j = 0; j < p; j++)
		{
			cin >> price >> name;
			group.push_back(pair<int, string>(price, name));
		}

		sort(group.begin(), group.end());

		for (int i = 0; i < group.size(); i++)
		{
			if (i == group.size() - 1)
			{
				list.push_back(group[i]);
			}
		}
		group.clear();

	}

	for (int i = 0; i < list.size(); i++)
	{
		cout << list[i].second << endl;
	}

	return 0;
}