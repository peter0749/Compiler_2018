#include <stdio.h>
int a;
int main() {
    a = 0;
    if (a) printf("line5: a==0\n");
    a = 1;
    if (a) printf("line7: a==1\n");
    a = 0;
    if (a) printf("line7: a==0\n");
}
