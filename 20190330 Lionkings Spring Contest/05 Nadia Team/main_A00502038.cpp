#include <iostream>
#include <string.h>

using namespace std;

int main() {
    int T;
    char nadia[] = "nadia";
    cin >> T;
    for (int t = 0; t < T; t++) {
        char line[101];
        cin >> line;
        int i = 0;
        int j = 0;
        while (j < strlen(line) && (i < 5)) {
            if (line[j] == nadia[i]) {
                i++;
            }
            j++;
        }
        if (i == 5) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }
    return 0;
}