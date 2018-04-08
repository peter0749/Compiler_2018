#include <stdio.h>
#define MACRO_TEST
int main(void) {
    // Single line comment test.
    /* Multiple lines comment test 1
     * Multiple lines comment test 2
     * Multiple lines comment test 3
     */
    int x=3;
    x ^= 5;
    x |= 6;
    x %= 7;
    x += 7;
    x -= 7;
    x *= 7;
    x /= 7;
    x &= 7;
    char a='b'; // character test
    unsigned int test=0;
    long int testl=0L;
    long long int testll=0LL;
    const char *s="const string test";
    printf("Hello, World!\n");
    if (0)
        printf("FOO\n");
    else
        printf("BAR\n");
    printf(x>0?"HI\n":"THERE\n");
    return 0;
}
