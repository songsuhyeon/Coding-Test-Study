#include <iostream>

using namespace std;

int main()
{
    string s;
    cin >> s;

    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] >= 'D' && s[i] <= 'Z')
        {
            s[i] = s[i] - 3;
        }
        else if (s[i] >= 'A' && s[i] <= 'C')
        {
            s[i] = s[i] + 23;
        }
    }

    cout << s;

    return 0;
}
