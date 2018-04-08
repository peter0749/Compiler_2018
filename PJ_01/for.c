#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int x, y;
} points;

int main(void) {
    const int N=10;
    points _2d_points[N];
    for (int i=0; i<N; ++i) _2d_points[i].x=i, _2d_points[i].y=i+1;
    for (int i=0; i<N; ++i) printf("%d %d\n", _2d_points[i].x, _2d_points[i].y);
    return 0;
}
