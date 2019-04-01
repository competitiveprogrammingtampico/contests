#include <iostream>
#include <string.h>

#define MAXSIZE 100000

using namespace std;

int main() {
    int t;

    cin>>t;
    while (t--) {
        int x = 0;
        int y = 0;
        int unk = 0;
        char testcase[MAXSIZE];

        cin>>testcase;
        for (int i = 0; i < strlen(testcase); i++) {
            switch (testcase[i]) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case '?':
                    unk++;
                    break;
                default:
                    break;
            }
        }

        cout<<x-unk<<" "<<y-unk<<" "<<x+unk<<" "<<y+unk<<endl;
    }
    return 0;
}