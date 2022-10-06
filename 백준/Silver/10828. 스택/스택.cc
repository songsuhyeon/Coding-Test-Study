#include <iostream>
#include <vector>
#include <stack>

using namespace std;

int main()
{
    stack<int, vector<int>> mystack;

    // 명령의 수 N (1 ≤ N ≤ 10,000)
    int n;
    cin >> n;

    string s;   // 명령

    for (int i = 0; i < n; i++)
    {
        cin >> s;

        //push X: 정수 X를 스택에 넣는 연산
        if (s == "push")
        {
            int num;    // 입력될 숫자
            cin >> num;
            mystack.push(num);
        }
        // top: 스택의 가장 위에 있는 정수를 출력
        else if (s == "top")
        {
            if (mystack.empty())
            {
                cout << -1 << "\n";
            }
            // 스택에 들어있는 정수가 없는 경우에는 -1을 출력
            else
            {
                cout << mystack.top() << "\n";
            }
        }
        // size: 스택에 들어있는 정수의 개수를 출력
        else if (s == "size")
        {
            cout << mystack.size() << "\n";
        }
        // empty: 스택이 비어있으면 1, 아니면 0을 출력
        else if (s == "empty")
        {
            if (!mystack.empty())
            {
                cout << 0 << "\n";
            }
            else
            {
                cout << 1 << "\n";
            }
        }
        // pop: 스택에서 가장 위에 있는 정수를 빼고 그 수를 출력
        else if (s == "pop")
        {
            if (!mystack.empty())
            {
                cout << mystack.top() << "\n";
                mystack.pop();
            }
            // 스택에 들어있는 정수가 없는 경우 -1을 출력
            else
            {
                cout << -1 << "\n";
            }
        }
    }

    return 0;
}