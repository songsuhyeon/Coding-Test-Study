#include <iostream>

using namespace std;

int main()
{
    int t;
    cin >> t;

    int num;
    while(t--)
    {
        cin >> num;

        int cnt[10] = { 0 };
        int c = 0;
        while (num > 0)
        {
            cnt[num % 10]++;
            num /= 10;
        }
        
        for (int i = 0; i < 10; i++)
        {
            if (cnt[i] > 0)
                c++;
        }

        cout << c << "\n";
    }
  
    return 0;
}
