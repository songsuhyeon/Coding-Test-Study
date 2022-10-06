#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(void) 
{
	int n;
	cin >> n;

	while (n--)
	{
		string s;
		cin >> s;

		//문자열 대소문자 변환 : toupper, tolower
		// transform(복사할 문자열의 시작점, 복사할 문자열의 종료점, 복사할 문자열의 시작점, toupper of tolower)
		transform(s.begin(), s.end(), s.begin(), ::tolower);

		cout << s << "\n";
	}

	return 0;
}
