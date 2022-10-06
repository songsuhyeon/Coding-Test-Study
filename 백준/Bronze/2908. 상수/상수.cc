#include<iostream>

using namespace std;

int main() 
{
    int a, b;
    cin >> a >> b; 

    int x, y;
    x = ((a - (a / 100) * 100) % 10) * 100 + ((a - (a / 100) * 100) / 10) * 10 + a / 100;
    y = ((b - (b / 100) * 100) % 10) * 100 + ((b - (b / 100) * 100) / 10) * 10 + b / 100;

    if (x > y)
        cout << x << endl;
    else 
        cout << y << endl;


    return 0;

}
