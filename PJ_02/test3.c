#include <stdio.h>
int main(void) {
    int foo=0, hi=0, ok1=0, ok2=0;
    for (foo=0; foo<10; ++foo) {
        // comment1
        /* comment2 */
		ok1 = 1;
		for (hi=0; hi<100; ++hi) {
			// comment 3
			ok2 = 1;
		}
    }
    return 0;
}
