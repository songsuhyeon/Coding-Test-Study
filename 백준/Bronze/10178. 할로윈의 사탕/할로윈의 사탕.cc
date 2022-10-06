#include <iostream>
#include <vector>
using namespace std;

int main(void)
{
    vector<pair<int, int>> candy;

    int t;
    cin >> t;

    int c, v;
    for (int i = 0; i < t; i++)
    {
        cin >> c >> v;
        candy.push_back(pair<int, int>(c, v));
    }
    for (int i = 0; i < t; i++)
    {
        cout << "You get " << candy[i].first / candy[i].second << " piece(s) and your dad gets " << candy[i].first % candy[i].second << " piece(s)." << endl;
    }

    return 0;
}
