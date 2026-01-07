import java.util.Scanner;
 
 
/*
    Week 1 Comprehensive Program: Account Class
    Covers: Classes, Objects, Instance Variables, Constructors,
    Set/Get Methods, Reference Types, Constants, Methods,
    Abstract Class, Interface
*/
 
 
// ACCOUNT CLASS
 
class Account {
    // Instance variables (private for encapsulation)
   
 
    // Constant: minimum balance
     
    /**
     * Constructor to initialize Account object
     * @param name Account holder's name
     * @param balance Initial balance (must be >= 0)
     */
   
 
    
    // Set Methods (Mutators)
    void setName(String name) {
        this.name = name;
       
    }
    void setBalance(double balance) {
        if (balance >= MIN_Balance) 
            this.balance = balance;
    }
  
    // Get Methods (Accessors)
    String getName() {
        return name;
    }
    
    // Display Info
    void displayInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: $" + balance);
    }
    
    // Method with parameter and return
    double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }
    
  
 
// ABSTRACT CLASS EXAMPLE
 
abstract class AccountBase {
    // abstract method
    abstract double calculateInterest();

 //normal method
    void displayInfo() {
        System.out.println("This is a base account.");
    }
    
}
 
 
class SavingsAccount extends AccountBase {

    private double balance;
    private double rate;
   
 
    SavingsAccount(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
 
 
    @Override
    double calculateInterest() {
        return balance * rate;
    }
    
}
 
 
// INTERFACE EXAMPLE
 
interface Printable {
    void print();
}
 
 
class AccountReport implements Printable {
    private Account account;
 
 
    AccountReport(Account account) {
        this.account = account;
    }
 
 
    @Override
    public void print() {
        System.out.println("\n--- Account Report ---");
        account.displayInfo();
    }
}
 
 
// -------------------------
// MAIN CLASS
// -------------------------
public class Main {
    public static void main(String[] args) {
 
 
        System.out.println("==== Week 1: Account Class Demo ====");
 
 
       
        // 1. Creating Account Objects
        Account acc1 = new Account(name: "Michael", balance: 1000);
        Account acc2 = new Account (name: "Ajayi", balance: 2000);
        acc1.displayInfo();
        acc2.displayInfo();
        
               
        // 2. Using Set/Get Methods
        acc1.setName(name: "Michael Ajayi");
        System.out.printIn(acc1.getName);
      
        // 3. Primitive vs Reference Types
        
        
        // 4. Constants
      
        // 5. Methods with Parameters & Return Values
        
        // 6. Abstract Class
       
        // 7. Interface
        
        // 8. Scanner Example (Optional User Input)
       
    }
}