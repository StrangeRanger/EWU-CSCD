
import java.util.*;

public class HashTableDemo2 {
    public static void main(String args[]) {
        // Create a hash map
        Hashtable<Integer, String> ssnNameTable = new Hashtable<Integer, String>();
        Enumeration<Integer>       ssns;
        int                        ssn;
        String                     name;

        ssnNameTable.put(123456789, "Zara");
        ssnNameTable.put(123456790, "Mahnaz");
        ssnNameTable.put(123456791, "Ayan");
        // Show all balances in hash table.
        ssns = ssnNameTable.keys();
        while (ssns.hasMoreElements()) {
            ssn = (Integer) ssns.nextElement();
            System.out.println(ssn + ": " + ssnNameTable.get(ssn));
        }
        System.out.println();
        // change the name for the person with a ssn=123456789
        name = ssnNameTable.get(123456789);
        ssnNameTable.put(123456789, "Zara2");
        System.out.println("123456789 's new name: " + ssnNameTable.get(123456789));
    }
}

// To successfully store and retrieve objects from a hashtable, the objects used as
// keys must implement the hashCode method and the equals method.
//  information is
//  here:http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#hashCode()
/*
 For example,
 You like to map each Employee(Key) to their Address(Value), in your Employee
 implementation you have to override hashCode() and equals() method in Employee class.

 public class Employee {
    private int age;
    private int departmentCode;
    private int salaryRate;
    ...........
    // if you like to use Employee object as a key in hashTable,
    // you have to implement a hash function, that is, override the hashCode method
     public int hashCode() {
         return (this.age + this.departmentCode) / this.salaryRate;
     }
     //If object A equals B, they hashCode method has to returns a same integer.

 }

 */
