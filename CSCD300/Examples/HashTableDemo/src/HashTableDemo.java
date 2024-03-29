
import java.util.*;

public class HashTableDemo {
    public static void main(String args[]) {
        // Create a hash map
        Hashtable<String, Double> balance = new Hashtable<String, Double>();
        Enumeration<String>       names;
        String                    str;
        double                    bal;

        balance.put("Zara", new Double(3434.34));
        balance.put("Mahnaz", new Double(123.22));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", new Double(-19.08));

        // Show all balances in hash table.
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();
        // Deposit 1,000 into Zara's account
        bal = ((Double) balance.get("Zara")).doubleValue();
        balance.put("Zara", new Double(bal + 1000));
        System.out.println("Zara's new balance: " + balance.get("Zara"));
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
