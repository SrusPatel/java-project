
package restaurantordergui;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Customer {
    
/*----------------------------------Necessary variable declaration----------------------------------------- */ 

    private static int counter=0,counterN=0,counterT=0;
    private static String customerName[]=new String [10];
    private static int[] tableNumber=new int[10];
    boolean b=true;
    private static int hitNcounter=1,hitTcounter=1;
    private static String custName;
    private static int tabNumber;
  
/*--------------------------------------------------------------------------------------------------------- */ 

    Customer()
    {
       //default construcor
    }
   
/*----------------------------------Set and Get methods------------------------------------------------------- */ 

    public void setCustomerName(String name)  // this method set the customer name and do validation for customer name
       {
        if(hitNcounter!=3)     // validation for customer name for 3 times, hitNcounter variable count how many times cutomer entered wrone customer name
        {
           int length=name.length();
           
        
           if(20 <= length)    // condition for checking customer name length
           {
               JOptionPane.showMessageDialog(null,"Please enter Name between 1 to 20 characters");
               b=false;
               hitNcounter++;
           }
           else if(name.isEmpty()) // condition for checking customer name is empty or not
           {
              JOptionPane.showMessageDialog(null, "Please enter Name");
               b=false;
               hitNcounter++;
           }      
           else  // condition for correct customer name
           {
               counter++;
               if(counterN>=0)
               {
                  
                 custName=name;   // set customer name into custName variable
                 this.customerName[counterN]=name;  // store all customer name in customerName array
                
                 b=true;//set the value of name into itemName array  
                 counterN++;   // counterN count the number of customer name entered 
                }
              
            }
           
        }
        else
          {
               JOptionPane.showMessageDialog(null,"Sorry, You cannot use this service as you have entered wrong data 3 times");
               // if customer enter 3 time wrong data the application is closed
               System.exit(0);
           }
       }
  public void setTableNumber(int num)
  {
        if(hitTcounter!=0)  // validation for table number for 3 times, hitTcounter variable count how many times cutomer entered wrong table number
        {
            if(num>8 || num<1) // check condition if table number grater than 8 or less than 1
            {
                    JOptionPane.showMessageDialog(null, "Please enter table number between 1 to 8");
                    hitTcounter++;
            }
            else
            {
                if(counterT>=0)   //condition for right table number 
                {
                    tabNumber=num;   // table number stored in tabNumber variable
                    this.tableNumber[counterT]=num;    // stored all table number in tableNumber array
                            
                    counterT++;
                }
                
            }
        }
        else
        {
                JOptionPane.showMessageDialog(null,"Sorry, You cannot use this service as you have entered wrong data 3 times");
                // if customer enter 3 time wrong data the application is closed
                System.exit(0);
             
        }
  }
  
  public String getCustomerName()
  {
        return custName;      //return custName
  }
  public int getTableNumber()
  {
        return tabNumber;      //return tabNumber
  }
         
/*--------------------------------------------------------------------------------------------------------- */ 
/*------------------------------------ToString method------------------------------------------------------ */ 
       
     @Override
  public String toString()
  {   
         String custName[]=new String[counter]; 
         String tabNum[]=new String[counter];
         String display="";
  
         for(int i=0;i<counter;i++)
         {
             custName[i]=customerName[i]; // storing customer Names from customerName array into custName array for diaplay all the name
             tabNum[i]=String.valueOf(tableNumber[i]); //storing table Numers from tableNumber array into custName array for diaplay all the name
             
             display=display+"customer name==> "+ String.format(custName[i].toString()+"     table number==>"+String.format(tabNum[i].toString())+"\n"+"");
         }
           
           return display; // return all the customer names and table numbers
        
     }
/*--------------------------------------------------------------------------------------------------------- */ 

}
