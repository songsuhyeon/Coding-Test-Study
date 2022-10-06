#include<iostream>

using namespace std;

int main() 
{
    string t;
    cin >> t;

    // 아스키코드
    // 영어 대문자 : 65 ~ 90
    // 영어 소문자 : 97~ 122
    for (int i = 0; i < t.size(); i++)
    {
        if (t[i] > 64 && t[i] < 97)
            t[i] = t[i] + 32;
        else
            t[i] = t[i] - 32;
    }

    cout << t;

    return 0;
}
