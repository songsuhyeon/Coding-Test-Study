#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main() 
{
    string n;
    cin >> n;

    // greater<char>(): 내림차순 정렬
    sort(n.begin(), n.end(), greater<char>());

    cout << n;

    return 0;
}
