#include<iostream>

using namespace std;

int main() 
{
    int t;
    cin >> t;

    int tmp[100];
    int v, e;
    for (int i = 0; i < t; i++)
    {
        cin >> v >> e;
        tmp[i] = 2 - v + e;
    }

    for (int i = 0; i < t; i++)
    {
        cout << tmp[i] << endl;
    }

    return 0;

}