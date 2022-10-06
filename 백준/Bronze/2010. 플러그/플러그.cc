#include<iostream>
#include<vector>


using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<int> v;
    int x;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        v.push_back(x);
    }

    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        if (i == n - 1)
            sum = sum + v[i];
        else
            sum = sum + v[i] - 1;
    }

    cout << sum << endl;

    return 0;

}

