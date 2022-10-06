#include<iostream>

using namespace std;

int main()
{
    int cnt[26];

    // 배열을 -1로 초기화
    fill(cnt, cnt + 26, -1);

   
    string s;
    cin >> s;

    for (int i = 0; i < s.size(); i++)
    {
        // 아스키코드 : 'a' = 97 ~ 'z' = 122
        for (int j = 0; j < 26; j++)
        {
            int k = 97;
            while (k <= 122)
            {
                if (s[i] == k)
                {
                    if (s[i] == s[i + 1])
                    {
                        if (cnt[k - 97] == (-1))
                        {
                            cnt[k - 97] = i;
                        }
                    }
                    else
                    {
                        if (cnt[k - 97] == (-1))
                        {
                            cnt[k - 97] = i;
                        }
                    }
                }
                k++;
            }
            
        }
    }

    for (int j = 0; j < 26; j++)
    {
        cout << cnt[j] << " ";
    }

    return 0;
}
