// *****************************************************************************
//
// Name:        Hunter T.
// Date:        February 3, 2021
// Class:       CSCD 211
// Description: Uses LinkedLists to add and remove elements from a list, then
//              display the remaining elements in the list
//
// *****************************************************************************

import java.util.*;

public class LinkListAddRemoveTemplate {

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Nancy");
        list.add("Cindy");
        list.add("Kona");
        list.add("LeAnn");
        list.add("Larry");
        list.add("Jerry");

        //Removing First elements
        list.removeFirst();

        //Same as list.remove(1) 2nd element
        list.remove(1);

        //Removing Last element
        list.removeLast();

        //Iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");

        //removing 2nd element, index starts with 0
        list.remove(1);

        //Iterating LinkedList again
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println("");
    }
}
