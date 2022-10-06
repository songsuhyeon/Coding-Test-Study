#include <iostream>

using namespace std;

int main()
{
    int check = 0;
    int play[8] = { 0 };

    for (int i = 0; i < 8; i++)
    {
        cin >> play[i];
    }

    for (int i = 0; i < 7; i++)
    {
        if (play[i] <= play[i + 1])
        {
            check++;
        }
        else if (play[i] >= play[i + 1])
        {
            check--;
        }
    }

    if (check == 7)
        cout << "ascending";
    else if (check == -7)
        cout << "descending";
    else
        cout << "mixed";

    return 0;
}
