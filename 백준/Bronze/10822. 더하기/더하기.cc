#include <iostream>
#include <string>

using namespace std;

int main(void) 
{
	string s;
	cin >> s;
	string t;
	int sum = 0;

	for (int i = 0; i < s.size(); i++)
	{
		if (s[i] == ',')
		{
			sum += stoi(t);
			t="";
		}
		else
		{
			t += s[i];
		}
	}

	cout << sum + stoi(t);

	return 0;
}
