/*3.15 (Removing Duplicated Code in Method main) In the AccountTest class of Fig. 3.9, method
main contains six statements (lines 11–12, 13–14, 26–27, 28–29, 38–39 and 40–41) that each
display an Account object’s name and balance. Study these statements and you’ll notice that they differ
only in the Account object being manipulated—account1 or account2. In this exercise, you’ll define
a new displayAccount method that contains one copy of that output statement. The method’s
parameter will be an Account object and the method will output the object’s name and balance. You’ll
then replace the six duplicated statements in main with calls to displayAccount, passing as an
argument the specific Account object to output.
Modify class AccountTest of Fig. 3.9 to declare method displayAccount (Fig. 3.20) after the
closing right brace of main and before the closing right brace of class AccountTest. Replace the
comment in the method’s body with a statement that displays accountToDisplay’s name and balance.
Recall that main is a static method, so it can be called without first creating an object of the
class in which main is declared. We also declared method displayAccount as a static method.
When main needs to call another method in the same class without first creating an object of that
class, the other method also must be declared static.
Once you’ve completed displayAccount’s declaration, modify main to replace the statements
that display each Account’s name and balance with calls to displayAccount—each receiving as its
argument the account1 or account2 object, as appropriate. Then, test the updated AccountTest
class to ensure that it produces the same output as shown in Fig. 3.9.
 */
package Chapter_3_Exercises;

public class Account {
    private String name; // instance variable
    private double balance; // instance variable

    // Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
        }
    }

    public void withdraw(double withdrawal) {
        if (withdrawal > balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
            return;
        }

        balance = balance - withdrawal;
    }

    // method returns the account balance
    public double getBalance() {
        return balance;
    }

    // method that returns the name
    public String getName() {
        return name;
    }

    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }


}
