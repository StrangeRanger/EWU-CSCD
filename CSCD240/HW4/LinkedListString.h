/* Link list node */
struct node {
  char data[40];
  struct node *next;
};

void push(struct node **head_ref, char *new_data);
void printList(struct node *head);
int listCount(struct node *head);
void reverseList(struct node **head_ref);
void listAllDelete(struct node **head_ref);
void deleteElement(struct node **head_ref, char *value);
