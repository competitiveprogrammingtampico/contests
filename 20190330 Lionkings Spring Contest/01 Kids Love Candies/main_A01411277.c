#include <stdio.h>

int main() {
    int numCases;
    int diffCandyNum;
    int candyQty[100];
    int maxNumKids[numCases];
    int happyNum;
    int j = 0;
    char temp;

    scanf("%d", &numCases);

    for (int i = 0; i < numCases; i++) {
        scanf("%d %d", &diffCandyNum, &happyNum);

        maxNumKids[i] = 0;
        do {
            scanf("%d%c", &candyQty[j], &temp);
            maxNumKids[i] += candyQty[j] / happyNum;
            j++;

        } while (temp != '\n');
        j = 0;

    }

    for (int i = 0; i < numCases; i++) {
        printf("%d\n", maxNumKids[i]);
    }

    return 0;
}