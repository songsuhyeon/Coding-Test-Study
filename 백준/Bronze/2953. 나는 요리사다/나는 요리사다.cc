#include<iostream>

using namespace std;

int main() 
{
    // 5명의 참가자, 4개의 평가 점수 + 합
    int s[5][4] = { 0 };   
    int sum[5] = { 0 };

    int score = 0;
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            cin >> score;
            s[i][j] = score;
            sum[i] += s[i][j];
        }
    }

    int max = 0;
    int num = 0;
    for (int i = 0; i < 5; i++)
    {
        if (max < sum[i])
        {
            max = sum[i];
            num = i;
        }
    }

    cout << num + 1 << " " << max;

    return 0;
}