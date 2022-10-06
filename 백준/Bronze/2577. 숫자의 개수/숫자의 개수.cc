#include<iostream>

using namespace std;

int main() 
{
    int a, b, c;
    int mul;
    int x[10] = { 0 };

    cin >> a >> b >> c;
    mul = a * b * c;

    while (mul > 0)
    {
        x[mul % 10]++;
        mul /= 10;
    }

    for (int i = 0; i < 10; i++)
    {
        cout << x[i] << endl;
    }

    return 0;

}
