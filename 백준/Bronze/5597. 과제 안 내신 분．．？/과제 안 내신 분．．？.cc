#include <iostream>

using namespace std;

int main()
{
    int student[31] = { 0 };

    int num;
    for (int i = 0; i < 28; i++)
    {
        cin >> num;
        student[num] = num;
    }

    for (int i = 1; i <= 30; i++)
    {
        if (student[i] == 0)
            cout << i << endl;
    }


    return 0;
}
