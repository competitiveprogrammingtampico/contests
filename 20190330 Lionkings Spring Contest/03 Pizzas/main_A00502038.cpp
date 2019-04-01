#include <iostream>

using namespace std;

int main() {
    int T;
    cin >> T;
    for (int t = 0; t < T; t++) {
        int N;
        cin >> N;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int ni;
            cin >> ni;
            sum += ni;
        }
        cout << "Case " << t+1 << ": " << sum << "\n";
    }
    return 0;
}