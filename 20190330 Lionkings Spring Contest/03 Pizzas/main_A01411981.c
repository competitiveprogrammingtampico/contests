#include <stdio.h>

int main(void) {

  int t;
  scanf("%i", &t);
  int c = 1;

  while (t--) {

    int N, sum = 0;
    scanf("%i", &N);
    for (int i = 0; i < N; i++) {
      int a;
      fflush(stdin);
      scanf("%i", &a);
      sum += a;
    }

    printf("Case %i: %i\n", c, sum);
    c++;

  }

  return 0;
}