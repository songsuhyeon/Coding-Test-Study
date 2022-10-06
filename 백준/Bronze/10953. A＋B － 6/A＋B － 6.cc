#include<iostream>
#include<vector>

using namespace std;

int main()
{
    int a, b;
    char c;

    int t;
    cin >> t;

    int tmp = 0;
    vector<int> sum;

    for (int i = 0; i < t; i++)
    {
        cin >> a >> c >> b;
        tmp = a + b;
        sum.push_back(tmp);
    }

    for (int i = 0; i < t; i++)
    {
        cout << sum[i] << endl;
    }

    return 0;
}
