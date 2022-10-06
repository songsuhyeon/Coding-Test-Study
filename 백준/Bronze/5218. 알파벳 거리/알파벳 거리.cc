#include<iostream>

using namespace std;

int main()
{
	int t;
	cin >> t;

	while(t--)
	{
		string s1, s2;
		cin >> s1 >> s2;

		int tmp = 0;

		int size = s1.size();
		int i = 0;

		cout << "Distances: ";
		while(size--)
		{
			if (s1[i] <= s2[i])
			{
				tmp = s2[i] - s1[i];
			}
			else
			{
				tmp = (s2[i] + 26) - s1[i];
			}
			i = i + 1;
			cout << tmp << " ";
		}
		cout << endl;
	}

	

    return 0;
}
