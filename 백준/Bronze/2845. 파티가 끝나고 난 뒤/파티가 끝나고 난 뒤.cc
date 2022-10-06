#include <iostream>

using namespace std;

int main()
{
    int l, p; // 1m^2 당사람의 수, 파티가 열린 곳의 넓이
    int num[5] = { 0 };   // 참가자 수

    cin >> l >> p;
    for (int i = 0; i < 5; i++)
    {
        cin >> num[i];
    }

    for (int i = 0; i < 5; i++)
    {
        cout << num[i] - (p * l) << " ";

    }

    return 0;
}
