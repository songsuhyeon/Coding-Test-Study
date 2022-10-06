#include <iostream>

using namespace std;

int main(void) 
{
	string s;
	cin >> s;

	int cnt1 = 0, cnt2 = 0;
	for (int i = 0; i < s.size(); i++)
	{
		if (s[i]=='J'&&s[i+1]=='O'&&s[i+2]=='I')
			cnt1++;
		else if (s[i] == 'I' && s[i + 1] == 'O' && s[i + 2] == 'I')
			cnt2++;
	}

	cout << cnt1 << "\n";
	cout << cnt2 << "\n";

	return 0;
}
