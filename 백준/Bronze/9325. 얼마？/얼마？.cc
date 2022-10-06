#include <iostream>
#include <vector>
using namespace std;

int main(void)
{
    int t;    // 테스트 케이스의 개수
    cin >> t;
    vector<int> v;

    int q;  //특정 옵션의 개수
    int p;  // 해당 옵션의 가격

    for (int k = 0; k < t; k++)
    {
        int tmp = 0;

        int s;  // 자동차의 가격
        cin >> s;

        int n;  // 옵션의 개수
        cin >> n;

        for (int i = 0; i < n; i++)
        {
            cin >> q >> p;
            tmp += q * p;
        }
        v.push_back(tmp + s);
    }
  
    for (int i = 0; i <v.size() ; i++)
    {
        cout << v[i] << endl;
    }
    return 0;
}
