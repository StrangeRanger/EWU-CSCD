package lab7.cscd211lab7;

// *****************************************************************************
//
// Name:        Hunter T.
// Date:        February 26, 2021
// Class:       CSCD 211
// Description: ....................................
//
// *****************************************************************************

import java.io.*;
import java.util.*;
import lab7.cscd211comparators.*;
import lab7.cscd211inheritance.*;

public class CSCD211Lab7 {
   public static void main(String [] args) {
      ArrayList<Employee>myList = new ArrayList<>();
      myList.add(new Programmer("Mr. Ima Nerd", 40000, 20000, true));
      myList.add(new Programmer("Mrs. Ima Nerd", 45000, 20000, false));
      myList.add(new Accountant("Mr. Bean Counter", 100000, 0, 50.00));
      myList.add(new Accountant("Mrs. Bean Counter", 75000, 0, 150.00));
      myList.add(new Lawyer("Mr. Lawyer", 150000, 30000, 25));
      myList.add(new Lawyer("Mrs. Lawyer", 170000, 20000, 125));

      // Display Employee List
      System.out.println("Employee List");
      for (Employee e : myList) { System.out.println(e); }
      System.out.println();

      // Display Employee Reports
      System.out.println("Employee Report");         
      for (Employee e : myList) { e.report(); }
      System.out.println();

      // Display Employee List by Natural Order
      Collections.sort(myList);
      System.out.println("Employee List: Natural Order");
      for (Employee e : myList)
      { System.out.println(e.getType() + " - " + e.getName() + " - " + e.getSalary()); }
      System.out.println();

      // Display Employee List by Salary
      Collections.sort(myList, new SalaryComparator());
      System.out.println("Employee List by Salary");
      for (Employee e : myList)
      { System.out.println(e.getType() + " - " + e.getName() + " - " + e.getSalary()); }
      System.out.println();

      // Display Employee List by Name
      Collections.sort(myList, new NameComparator());
      System.out.println("Employee List by Name");
      for (Employee e : myList)
      { System.out.println(e.getType() + " - " + e.getName() + " - " + e.getSalary()); }
      System.out.println();
   }  // End main
}  // End class