import java.util.ArrayList;

public class Bank {
    //todo: add attributes as per the class diagram
    private String name;
    private ArrayList<Customer> customerList;
    private ArrayList<String> listOfActions;
    private Customer currentCustomer;


    public Bank(String name){
        customerList = new ArrayList<>();
        listOfActions = new ArrayList<>();
        // 2) add the following actions to the list of actions
        // - Opret kunde
        // - Se Kontooversigt
        // - Se Kontoposteringer
        // - Indsæt/hæv penge
        // - Opret ny konto
        // - Vælg eksisterende kunde
        // - Afslut
    }
    private void createCustomer(String name){
        this.name = name;

        currentCustomer = new Customer(name);
        customerList.add(currentCustomer);


    }
    public void userDialog() {
        // todo:
        //  1) display a welcome message using the displayMsg method of the ui object in Main
        System.out.println(displayMsg);
        //  2) initialize an int variable 'action' with the value of 0 (will hold the user's choice of action)
        int actions = 0;
        //  3) create a while loop that will run until action is equal to the value of 7 (the quit action).
        while(actions <=7){
            int i = actions++;
        }
        //  4) inside the while loop, ask the user to choose an action using the promptChoice method of the ui object in Main
        //  5) create a switch-case statement that looks at the action variable and has a case for each of the 6 first actions in the list of actions

        // todo:
        //  6) case 1 :
        //  a. prompt the user for a customer name
        //  b create an instance of the Customer class with the name retrieved from the user

        // todo:
        //  7) case 2 :
        //  a. display the state of the current customer (defined in the Customer toString method)

        // todo:
        //  8) case 3 :
        //  a. ask the user to choose one of the accounts associated with the current customer
        //  b. use the user input as an argument in a call to the current customer's getAccountDetails account

        // todo:
        //  9) case 4 :
        //  a. ask the user to choose one of the accounts associated with the current customer
        //  b. ask the user to type the amount
        //  c. call the deposit method on the current customer instance with the amount as an argument

        // todo:
        //  10) case 5 :
        //  a. ask the user to type the name of the new account
        //  b. call the createAccount method on the current customer instance with the name as an argument

        // todo:
        //  11) case 6 :
        //  a. ask the user to type the id (index number) of the customer
        //  b. retrieve the customer object from the list of customers and assign it to the currentCustomer attribute of this class

    }



}
