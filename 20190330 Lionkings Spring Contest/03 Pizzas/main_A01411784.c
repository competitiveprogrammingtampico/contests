#include <stdio.h>

int a=0;
int b=0;
int c=0;
int d=0;
int e=0;

int main(void)
{
  scanf("%i", &a);

  for(a=a; a>0; a--)
  {
    scanf("%i", &b);

    for(b=b; b>0; b--)
    {
      scanf("%i", &c);
      d=d+c;
    }
  }
  return 0;
}