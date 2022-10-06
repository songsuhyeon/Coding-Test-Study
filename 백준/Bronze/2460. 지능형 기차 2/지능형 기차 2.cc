#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main() 
{
    vector<pair<int, int>> v;
    int x, y;
    for (int i = 0; i < 10; i++)
    {
        cin >> x >> y;
        v.push_back(pair<int, int>(x, y));
    }
   
    int tmp = 0;
    vector<int> w;
    for (int i = 0; i < v.size(); i++)
    {
        tmp = tmp + v[i].second - v[i].first;
        w.push_back(tmp);
    }

    sort(w.begin(), w.end());
    cout << w[9] << endl;

    return 0;

}
