#include <iostream>
#include <string>

using namespace std;

int main(void) 
{
	int t;
	cin >> t;
	cin.ignore();

	while(t--)
	{
		int sum = 0;

		string tmp;
		string num;
		getline(cin, num);

		for (int i = 0; i < num.length(); i++)
		{
			if (num[i] == ' ')
			{
				sum += stoi(tmp);
				tmp = "";
			}
			else
			{
				tmp += num[i];
			}
		}

		cout << sum + stoi(tmp) << "\n";

	}
	

	return 0;
}
