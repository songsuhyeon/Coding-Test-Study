#include <iostream>

using namespace std;

int main(void) 
{
	int i = 1;

	while (1)
	{
		int a, b;
		string c;

		cin >> a >> c >> b;

		if (c == "E")
			break;

		cout << "Case " << i << ": ";
		if (c == "!=")
		{
			if (a != b)
				cout << "true\n";
			else
				cout << "false\n";
		}
		else if (c == "<")
		{
			if (a < b)
				cout << "true\n";
			else
				cout << "false\n";
		}
		else if (c == ">")
		{
			if (a > b)
				cout << "true\n";
			else
				cout << "false\n";
		}
		else if (c == "<=")
		{
			if (a <= b)
				cout << "true\n";
			else
				cout << "false\n";
		}
		else if (c == ">=")
		{
			if (a >= b)
				cout << "true\n";
			else
				cout << "false\n";
		}
		else if (c == "==")
		{
			if (a == b)
				cout << "true\n";
			else
				cout << "false\n";
		}
		i++;
	}

	return 0;
}
