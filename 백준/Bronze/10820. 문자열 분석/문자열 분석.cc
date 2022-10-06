#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
    vector<int> cnt[4];

    while (1)
    {
        string s;
        getline(cin, s);

        if (s.length() == 0)
            break;

        int upper = 0, lower = 0, number = 0, space = 0;

        for (int j = 0; j < s.length(); j++)

            if (s[j] >= 'A' && s[j] <= 'Z')

                upper++;

            else if (s[j] >= 'a' && s[j] <= 'z')

                lower++;

            else if (s[j] >= '0' && s[j] <= '9')

                number++;

            else if (s[j] == ' ')

                space++;



        cout << lower << " " << upper << " " << number << " " << space << "\n";

    }


    
    return 0;
}