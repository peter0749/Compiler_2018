#include <stdio.h>
#include <stdlib.h>

typedef struct {int x; int y;} _2d;
typedef struct _node {
    _2d point;
    struct _node *next;
} node;

int main(void) {
    node *head = (node*)malloc(sizeof(node));
    head->next = NULL;
    node *ptr = head;
    head->point.x = head->point.y = 0;
    for (int i=1; i<10; ++i) {
        node *newnode = (node*)malloc(sizeof(node)); 
        newnode->next = NULL;
        newnode->point.x = i;
        newnode->point.y = -i;
        ptr->next = newnode;
        ptr = newnode;
    }
    ptr = head;
    while(ptr!=NULL) {
        printf("%d %d\n", ptr->point.x, ptr->point.y);
        head = ptr->next;
        free(ptr);
        ptr = head;
    }
    return 0;
}
