#include <iostream>

using namespace std;

int main() {
    int T;

    cin >> T;
    for (int t = 0; t < T; t++) {
        int min;
        int N;
        int maxKids = 0;
        cin >> N >> min;

        for (int n = 0; n < N; n++) {
            int candie;
            cin >> candie;
            maxKids += candie / min;
        }

        cout << maxKids << "\n";
    }
}