
package restaurantordergui;


public class OrderedCustomer extends Customer {

/*----------------------------------Necessary variable declaration----------------------------------------- */ 
   
    private String selected_food;
    private String selected_beverage;
/*--------------------------------------------------------------------------------------------------------- */ 
 
    Customer customer=new Customer();
/*----------------------------------Constructors----------------------------------------------------------- */ 
  
OrderedCustomer()
    {
        //default constructor
    }

OrderedCustomer(String data1,String data2)
    {
        selected_food=data1;
        selected_beverage=data2;
    }
/*-----------------------------------ToString method-------------------------------------------------------- */ 
   
public String toString() // display customer name and table number
    {
        return String.format("%s=> %s\n%s=> %d","Customer Name",customer.getCustomerName(),"Table Number",customer.getTableNumber());
        
    }
/*--------------------------------------------------------------------------------------------------------- */ 

       
    
    
}
