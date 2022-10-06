#include <iostream>

using namespace std;

int main(void)
{
    int h, m, s, now, start, result;
    char t;

    cin >> h >> t >> m >> t >> s;
    now = s + (m * 60) + (h * 60 * 60);

    cin >> h >> t >> m >> t >> s;
    start = s + (m * 60) + (h * 60 * 60);

    if (start > now)
    {
        result = start - now;
        
        h = result / 3600;
        m = (result - (h * 3600)) / 60;
        s = (result - (h * 3600)) % 60;
    }
    else
    {
        result = 24 * 3600 - (now - start);

        h = result / 3600;
        m = (result - (h * 3600)) / 60;
        s = (result - (h * 3600)) % 60;
    }

    printf("%02d:%02d:%02d", h, m, s);

    return 0;
}
