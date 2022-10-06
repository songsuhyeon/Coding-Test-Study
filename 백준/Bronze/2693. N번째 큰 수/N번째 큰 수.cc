#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main() 
{
    int t;
    cin >> t;
    vector<int> v;

    for (int i = 0; i < t; i++)
    {
        int arr[10] = { 0 };

        for (int j = 0; j < 10; j++)
        {
            cin >> arr[j];
        }
        sort(arr, arr + 10);

        v.push_back(arr[7]);
    }

    for (int i = 0; i < t; i++)
    {
        cout << v[i] << endl;
    }

    return 0;
}
