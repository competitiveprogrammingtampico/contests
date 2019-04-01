#include <iostream>
#include <string.h>
#include <limits.h>

using namespace std;

int main() {
    char winner[11];
    int topScore;
    int T;

    cin >> T;
    for (int t = 0; t < T; t++) {
        int N;
        cin >> N;
        char team[11];
        int score;
        topScore = INT_MIN;
        for (int n = 0; n < N; n ++) {
            cin >> team >> score;
            if (score > topScore) {
                topScore = score;
                strcpy(winner, team);
            }
        }
        cout << winner << "\n";
    }
    return 0;
}