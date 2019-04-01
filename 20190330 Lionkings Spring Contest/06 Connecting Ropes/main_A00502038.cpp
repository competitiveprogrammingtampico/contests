#include <iostream>

using namespace std;

int main() {
    int T;
    cin >> T;

    for (int t = 0; t < T; t++) {
        int N;
        int sum = 0;
        cin >> N;
        for (int n = 0; n < N; n++) {
            int i;
            cin >> i;
            sum += i;
        }

        sum -= (2 + (N-2)*2);
        cout << sum << "\n";
    }
    return 0;
}