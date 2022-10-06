#include<iostream>
#include<vector>

using namespace std;

int main() 
{
    vector<pair<int,int>> v;
    int num;
    int cnt = 1;
    int sum = 0;

    // 데이터 입력
    for (int i = 0; i < 10; i++)
    {
        cin >> num;
        sum += num;  // 평균을 구하기 위해 합을 구한다.
        v.push_back(pair<int, int>(num, cnt));
    }

    // 백터의 값이 같으면 개수 증가
    for (int i = 0; i < 10; i++)
    {
        for (int j = i; j < 10; j++)
        {
            if (v[i].first == v[j].first)
            {
                v[i].second++;
            }
        }
    }
  
    // 최빈값 구하기
    int max = 0;
    for (int i = 0; i < 10; i++)
    {
        if (max < v[i].second)
            max = v[i].second;
    }

    // 평균 출력
    cout << sum / 10 << endl;
    // 최빈값 출력
    for (int i = 0; i < 10; i++)
    {
        if (v[i].second == max)
            cout << v[i].first << endl;
    }

    return 0;

}
