#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main() 
{
    int t;
    cin >> t;

    int sum = 0;
    int score;
    vector<int> v;
    vector<pair<int, string>> w;   // 총점 출력
    for (int i = 0; i < t; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            cin >> score;
            v.push_back(score);
        }
        sort(v.begin(), v.end());

        if (v[3] - v[1] >= 4)
        {
            w.push_back(pair<int,string> (0,"KIN"));
        }
        else
        {
            sum = v[1] + v[2] + v[3];
            w.push_back(pair<int, string>(sum, "KIN"));
        }

        v.clear();
    }

    for (int i = 0; i < t; i++)
    {
        if (w[i].first == 0)
        {
            cout << w[i].second << endl;
        }
        else
        {
            cout << w[i].first << endl;
        }
    }

    return 0;
}
