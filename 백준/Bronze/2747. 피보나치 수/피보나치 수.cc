#include<iostream>

using namespace std;

int fib(int n)
{
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;
    
    int pp = 0;
    int p = 1;
    int result = 0;

    for (int i = 2; i <= n; i++)
    {
        result = p + pp;
        pp = p;
        p = result;
    }
    return result;
}

int main() 
{
    int n;
    cin >> n;

    cout << fib(n) << endl;
   
    return 0;

}
