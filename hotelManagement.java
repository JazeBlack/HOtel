// First thing, please make good variable names
// Now here, I will be creating a class for a Customer
// It is a good convention to follow if you name your classes starting with a capital letter
public class Customer {
    // These will be the common attributes for each customer
    String customerName;
    String roomType;
    
    // Here we will set the values for the customer
    public Customer(String name, String type) {
        customerName = name;
        roomType = type;
    }
}

// This will be the main class where you define all your functions. Try and continue coding in this template itself if possible.
public class Main{
    // This function is to add a new customer to the list of customers
    public static Customer[] addCustomer(Customer[] oldCustomerList, Customer newCustomer){
        int n = oldCustomerList.length;
        // Creating an array with length 1 greater than the previous array to accomodate the new customer
        Customer[] newCustomerList = new Customer[n+1];
        
        // Adding the old customers to the array
        for(int i = 0; i < n; i++){
            newCustomerList[i] = oldCustomerList[i];
        }
        
        // Adding the new customer to the array
        newCustomerList[n] = newCustomer;
        
        return newCustomerList;
    }
    public static void main(String[] args) {
        // Here I am creating a new Customer object with the name Sunil, and room type of Deluxe
        Customer myCustomer1 = new Customer("Sunil", "Deluxe");
        
        // Defining some more customers to add into the array
        Customer myCustomer2 = new Customer("Anand", "Presidential");
        Customer myCustomer3 = new Customer("Charles", "Regular");
        Customer myCustomer4 = new Customer("Medha", "Presidential");
        
        // If you want to store a list of customers, you can maybe try something like this
        
        // Setting an empty customer array
        Customer[] customerArray = {};
        
        // Adding new customers to the array
        customerArray = addCustomer(customerArray, myCustomer1);
        customerArray = addCustomer(customerArray, myCustomer2);
        customerArray = addCustomer(customerArray, myCustomer3);
        customerArray = addCustomer(customerArray, myCustomer4);
        
        for(int i = 0; i < customerArray.length; i++){
            System.out.println(customerArray[i].customerName + " lives in the " + customerArray[i].roomType + " Suite");
        }
    }
}
