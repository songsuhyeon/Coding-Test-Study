#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main() 
{
    vector<pair<int, int>> v;
    int score;
    
    for (int i = 0; i < 8; i++)
    {
        cin >> score;
        v.push_back(pair<int, int>(score, i + 1));
    }

    vector<int> w;
    sort(v.begin(), v.end());
    int sum = 0;
    for (int i = 7; i > 2; i--)
    {
        sum += v[i].first;
        w.push_back(v[i].second);
    }

    cout << sum << endl;

    sort(w.begin(), w.end());
    for (int i = 0; i < 5; i++)
    {
        cout << w[i] << " ";
    }

    return 0;
}