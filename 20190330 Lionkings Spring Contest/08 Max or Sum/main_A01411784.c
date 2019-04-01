#include <stdio.h>

int a=0;
int b=0;
int c=0;
int d=0;
int e=0;
int f=0;
int g=0;
int h=0;
int i=0;
int eq=0;

int main(void) {
  scanf("%i" "%i" "%i", &a, &b, &c);

  if (a==b || b==c || a==c)
  {
    if (a==b)
    {
      eq=a*2;
      if (eq>c)
      {
        printf("%i", eq);
      }
      else
      {
        printf("%i", c);
      }
    }
    if (b==c)
    {
      eq=b*2;
      if (eq>a)
      {
        printf("%i", eq);
      }
      else
      {
        printf("%i", a);
      }
    }
    if (a==c)
    {
      eq=a*2;
      if (eq>b)
      {
        printf("%i", eq);
      }
      else
      {
        printf("%i", b);
      }
    }
  }

  else
  {
    if (a<b && a<c)
    {
      d=a;
      e=b;
      f=c;
    }
    if (b<a && b<c)
    {
      d=b;
      e=a;
      f=c;
    }
    if (c<a && c<b)
    {
      d=c;
      e=a;
      f=b;
    }
    if (e<f)
    {
      g=e;
      h=f;
    }
    if (f<e)
    {
      g=f;
      h=e;
    }
    if ((d+g)>h)
    {
      i=d+g;
      printf("%i", i);
    }
    if ((d+g)<h)
    {
      printf("%i", h);
    }
    if ((d+g)==h)
    {
      printf("%i", h);
    }
  }

  return 0;
}