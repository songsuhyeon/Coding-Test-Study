#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(void)
{
	string s;
	cin >> s;

	vector<string> v;

	// substr(시작위치, 문자열길이) : 개수만큼 문자열 가져오기
	// 문자열의 i~l까지를 vector에 복사
	for (int i = 0; i < s.length(); i++)
	{
		v.push_back(s.substr(i, s.length()));
	}

	sort(v.begin(), v.end());

	for (int i = 0; i < v.size(); i++)
	{
		cout << v[i] << "\n";
	}

	return 0;
}