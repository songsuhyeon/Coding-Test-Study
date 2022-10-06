#include<iostream>

using namespace std;

int main() 
{
    int div[42] = { 0 };
    int cnt = 0;
    int num;

    // 나머지에 해당하는 인덱스를 찾아 저장
    for (int i = 0; i < 10; i++)
    {
        cin >> num;
        div[num % 42]++;
    }

    // 나머지 개수가 0이 아니라면 개수 증가
    for (int i = 0; i < 42; i++)
    {
        if (div[i] != 0)
        {
            cnt++;
        }
    }

    cout << cnt;

    return 0;
}