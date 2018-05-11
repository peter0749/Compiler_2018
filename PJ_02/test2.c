#include <stdio.h>
int main(void) {
    int foo=0;
    if (foo) {
        foo = 1;
        if (foo>5) {
            foo = 8;
        } else {
            foo = -7;
        }
    } else {
        foo = 2;
        if (foo<3) {
            foo = -1;
        } else {
            foo = 5;
        }
    }
    return 0;
}
