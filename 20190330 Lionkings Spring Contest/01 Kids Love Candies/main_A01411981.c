#include <stdio.h>

int main(void) {

  int t, n, k, r;
  scanf("%i", &t);

  while (t--) {
    r = 0;
    fflush(stdin);
    scanf("%i %i", &n, &k);
    for (int i = 0; i < n; i++) {
      fflush(stdin);
      int a;
      scanf("%i", &a);
      r += a / k;
    }
    printf("%i\n", r);
  }

  return 0;
}