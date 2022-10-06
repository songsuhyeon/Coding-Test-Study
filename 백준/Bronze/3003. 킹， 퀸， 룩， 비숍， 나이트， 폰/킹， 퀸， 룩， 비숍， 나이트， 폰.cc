#include <iostream>

using namespace std;

int main()
{
    int cnt[6] = { 0 };
    int num[6] = { 1,1,2,2,2,8 };
    for (int i = 0; i < 6; i++)
    {
        cin >> cnt[i];
    }

    for (int i = 0; i < 6; i++)
    {
        if (cnt[i] != num[i])
        {
            cout << num[i] - cnt[i] << " ";
        }
        else
        {
            cout << 0 << " ";
        }

    }

    return 0;
}
