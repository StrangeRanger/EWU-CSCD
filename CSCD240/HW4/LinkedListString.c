#include "LinkedListString.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* Function to push a node. */
void push(struct node **head_ref, char *new_data) {
  // Allocate node.
  struct node *new_node = malloc(sizeof(struct node));

  // Put in the data.
  strcpy(new_node->data, new_data);

  new_node->next = (*head_ref); // Link the old list off the new node.
  (*head_ref) = new_node;       // Move the head to point to the new node.
}

/* Function to print linked list. */
void printList(struct node *head) {
  struct node *temp = head;

  while (temp != NULL) {
    printf("%s  ", temp->data);
    temp = temp->next;
  }
}

/* Function to count the number of elements in the linked list. */
int listCount(struct node *head) {
  struct node *temp = head;
  int count = 0;

  while (temp != NULL) {
    temp = temp->next;
    count++;
  }

  return count;
}

/* Function to reverse the linked list. */
void reverseList(struct node **head) {}

/* Function to delete all elements in a Linked List. */
void listAllDelete(struct node **head) {
  struct node *tmp;

  if ((*head) == NULL) {
    printf("Linked list is empty.\n");
    return;
  }

  if ((*head)->next == NULL) {
    free((*head));
    (*head) = NULL;
    return;
  }

  while ((*head) != NULL) {
    tmp = (*head)->next;
    free((*head));
    (*head) = tmp;
  }
}

/* Function to delete a particular element or elements in a linked list. */
void deleteElement(struct node **head, char *value) {
  struct node *current = (*head), *tmp;

  if ((*head) == NULL) {
    printf("Linked list is empty.\n");
    return;
  }

  if ((*head)->next == NULL) {
    free((*head));
    (*head) = NULL;
    return;
  }

  if (strcmp((const char *)(*head), value) == 0) {
    tmp = (*head)->next;
    free((*head));
    (*head) = tmp;
  }

  while (current->next != NULL) {
    if (strcmp((const char *)current->next, value) == 0) {
      tmp = current->next;
      current->next = current->next->next;
      free(tmp);
      continue;
    }
    current = current->next;
  }
}
