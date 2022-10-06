#include<iostream>

using namespace std;

int main()
{
    int a[26] = { 0 };

    string s;
    cin >> s;

    // 아스키코드
    // 영어 대문자 : 65 ~ 90
    // 영어 소문자 : 97~ 122

    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] >= 'a' && s[i] <= 'z')
        {
            a[s[i] - 32 - 65]++;
        }
        else
        {
            a[s[i] - 65]++;
        }
    }
    
    int max = 0;
    int cnt = 0, ans = 0;
    for (int i = 0; i < 26; i++)
    {        
        if (max < a[i])
        {
            max = a[i];
            ans = i;
        }
    }

    for (int j = 0; j < 26; j++)
    {
        // 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력
        for (int i = j+1; i < 26; i++)
        {
            if (max == a[j] && max == a[i])
                cnt++;
        }
    }

    if (cnt != 0)
    {
        cout << "?";
    }
    else
    {
        // 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력
        cout << (char)(ans + 65);
    }

    return 0;
}
