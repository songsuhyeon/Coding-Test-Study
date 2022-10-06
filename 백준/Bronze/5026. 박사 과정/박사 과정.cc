#include <iostream>
#include <string>

using namespace std;

int main(void) 
{
	int n;
	cin >> n;
	cin.ignore();

	while (n--)
	{
		string t;
		string s;
		getline(cin, s);

		if (s == "P=NP")
		{
			cout << "skipped\n";
		}
		else
		{
			int sum = 0;
			for (int i = 0; i < s.size(); i++)
			{
				if (s[i] == '+')
				{
					sum += stoi(t);
					t = "";
				}
				else
				{
					t += s[i];
				}
			}
			cout << sum + stoi(t) << "\n";
			t.clear();
		}
	}

	return 0;
}
