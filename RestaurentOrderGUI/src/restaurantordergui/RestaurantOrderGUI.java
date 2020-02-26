package restaurantordergui;


import java.awt.*;  
import javax.swing.*;  
import javax.swing.border.TitledBorder;
import java.awt.event.*; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RestaurantOrderGUI implements ActionListener  {
      
  /*----------------------------------Necessary variable declaration------------------------------------------------- */       
   
  private JLabel label1, label2, label3, label4, label5, label6;
  private JTextField textfield1,textfield2;  
  private JComboBox combobox1,combobox2;
  private JTextArea area;
  private JButton button1,button2,button3,button4,button5;
  private JScrollPane jsp;
 
  static String string1="",string2="",string3="",selectedfooddata="",selectedbeveragedata="";
  private String selectedFood, selectedBeverage;
       
 
  JFrame frame= new JFrame();    //create a object of frame 

  MenuItem menuitem=new MenuItem();  //create a object of MenuItem class
          
           
          
  private String food[]=menuitem.getfood();
  private String beverage[]=menuitem.getbeverage();
 
 /*--------------------------------------------------------------------------------------------------- */       

    RestaurantOrderGUI () throws FileNotFoundException
    {
       
        frame.setLayout(null);
/*----------------------------------PANEL 1 DESIGN------------------------------------------------- */       
      JPanel panel1=new JPanel();          // create a object of panel 1
      panel1.setBounds(10, 10, 900, 150);   // set panel 1 in main frame
      panel1.setBackground(Color.PINK);      //panel 1 background color 
      panel1.setLayout(null);


      label1=new JLabel("Customer Details");  // create a label 1 
      label1.setBounds(130,10,100,30);
      
      label2=new JLabel("Name");              // create a label 2
      label2.setBounds(280,10,100,30);
      
      textfield1=new JTextField(25);          // create a textfield 1 to enter customer name
      textfield1.setBounds(330,10,170,30); 
      
      label3=new JLabel("Table Number");      // create a label 4 
      label3.setBounds(520,10,100,30); 
      
      textfield2=new JTextField("1",10);      // create a textfield 2 to enter tabel number
      textfield2.setBounds(610,10,100,30); 
      
      label4=new JLabel("Manu Choices");      // create a label 4
      label4.setBounds(380,50, 100,30);
      
      label5=new JLabel("Food");              // create a label 5 
      label5.setBounds(60,90, 100,30); 
          
      combobox1=new JComboBox(food);          // create a combobox 1 to display food items
      combobox1.setBounds(100,90,300,30);
      
      label6=new JLabel("Beverage");          // create label 6 
      label6.setBounds(420,90, 100,30); 
      
      combobox2=new JComboBox(beverage);      // create a combobox 2 to display beverage items
      combobox2.setBounds(490,90,320,30);
      
      panel1.add(label1);           // add label 1 to panel 1
      panel1.add(label2);           // add label 2 to panel 1
      panel1.add(textfield1);       // add textfield 1 to panel 1
      panel1.add(label3);           // add label 3 to panel 1
      panel1.add(textfield2);       // add textfeild 2 to panel 1
      panel1.add(label4);           // add label 4 to panel 1
      panel1.add(label5);           // add label 5 to panel 1
      panel1.add(combobox1);        // add combobox 1 to panel 1
      panel1.add(label6);           // add label 6 to panel 1
      panel1.add(combobox2);        // add combobox 2 to panel 1
     
/*------------------------------------------------------------------------------------------------- */       
/*----------------------------------PANEL 2 DESIGN------------------------------------------------- */ 

      JPanel panel2=new JPanel();             // create panel 2 object
      panel2.setBackground(Color.CYAN);       // set color for panel 2
     

      TitledBorder title1 = new TitledBorder("Your Menu choices and Nutrition Information");  // create object of title border class  
      panel2.setBounds(10,160,900,300);
      panel2.setBorder(title1);               // set title border to panel 2
      
      area=new JTextArea(16,70);              // create a object of textfield 
      area.setBounds(50,30,500,250);
      
      jsp=new JScrollPane(area);             // create a object of scroll pane
       
      jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); // set scroll pane for text area when the display information is not fix in text area
      panel2.add(jsp); 
      area.setEditable(false);   

/*------------------------------------------------------------------------------------------------- */ 

/*----------------------------------PANEL 3 DESIGN------------------------------------------------- */ 

      JPanel panel3=new JPanel();           // create object of panel 3
      panel3.setBackground(Color.YELLOW);   // set panel 3 colour   
      panel3.setLayout(null);

      TitledBorder title2 = new TitledBorder("Command Buttons");  // create object of title border class
      panel3.setBounds(10,460,900,100);
      panel3.setBorder(title2);               // set title border to panel 3
      
      button1=new JButton("Enter Data");       // create object for button 1
      button1.setBounds(60,30,120,30); 
      
      button2=new JButton("Display Choices");  // create object for button 2
      button2.setBounds(205,30,150,30); 
      
      button3=new JButton("Display Order");    // create object for button 3
      button3.setBounds(380,30,120,30); 
      
      button4=new JButton("Clear Data");       // create object for button 4
      button4.setBounds(525,30,120,30); 
      
      button5=new JButton("Quit");             // create object for button 5
      button5.setBounds(670,30,120,30);
      
      panel3.add(button1);                    // add button 1 in panel 3
      button1.addActionListener(this);
      
      panel3.add(button2);                    // add button 2 in panel 3
      button2.setEnabled(false);
      button2.addActionListener(this);

      panel3.add(button3);                    // add button 3 in panel 3
      button3.addActionListener(this);
      button3.setEnabled(false);

      panel3.add(button4);                     // add button 4 in panel 3
      button4.addActionListener(this);

      panel3.add(button5);                     // add button 5 in panel 3
      button5.addActionListener(this);
 
/*------------------------------------------------------------------------------------------------- */       
 
      frame.add(panel1);                // add panel 1 to frame 
      frame.add(panel2);                // add panel 2 to frame 
      frame.add(panel3);                // add panel 3 to frame 
      frame.setSize(940,610);           // set frame size
      frame.setVisible(true); 
   
    }
/*----------------------------------EVENT HANDLING METHODS----------------------------------------- */ 

    
  public void actionPerformed(ActionEvent e) 
  {   
        if(e.getSource()==button1)   // action performed when button 1 clicked
         {
             
            Customer customer=new Customer();      // create customer class object 

            customer.setCustomerName(textfield1.getText());         // set customer name by passing it into customer class
            customer.setTableNumber(Integer.parseInt(textfield2.getText()));  // set table number by passing into to customer class
             
            selectedFood = (String) combobox1.getItemAt(combobox1.getSelectedIndex());    // selected food item from combobox 1 strored in selectedFood variable   
            selectedBeverage = (String) combobox2.getItemAt(combobox2.getSelectedIndex());  // selected beverage item from combobox 2 strored in selectedBeverage variable   
               
            menuitem.setselectedfood(selectedFood);         // passing selected food item to menuitem class
            menuitem.setselectedbeverage(selectedBeverage); // passing selected beverage item to menuitem class

            if(customer.b == false)         // validation for wrong data entry
            {
                area.setText("Please enter valid inputs");
            }
             
            else
             {
                selectedfooddata=selectedfooddata+"\n"+selectedFood;           // all the selected food data for different customer added in selectedfooddata variable
                selectedbeveragedata=selectedbeveragedata+"\n"+selectedBeverage;   // all the selected beverage data for different customer added in selectedbeveragedata variable
                  
                Nutrient nutrient;  
                
                try {
                      nutrient = new Nutrient();  //create object of Nutrient class
                        
                      string1=string1+"\n"+nutrient.toString();   // string1 variable store all the information about selected food and beverage item's nutriention information
                      
                    }
                catch (FileNotFoundException ex)    // exception handling for file not finding
                    {
                      Logger.getLogger(RestaurantOrderGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 
                 
              OrderedCustomer order= new OrderedCustomer ();    // create object of orderedCustomer class
              
              string2=string2+"\n"+order.toString();           // string2 variable stored the all data of different customer that is come from toString function of customer class
              
              area.setText(string2);     // display all the cutomer name and table number in text area which is added by enter button.
             
              button2.setEnabled(true);
              button3.setEnabled(true);
              
              
              
              string3=string3+"\n"+("Customer Name=> "+customer.getCustomerName()+"\n"+"table number=> "+customer.getTableNumber()+"\n"+"selected foods=>"+menuitem.getselectedfood()+"\n"+"selected beverages=>"+menuitem.getselectedbeverage()+"\n");
               // string3 stored all the information like customer name, table number, selected food and selected beverage
             }
            
              textfield1.setText("");  // after entering data customer name is set clear
              textfield2.setText("1"); // after entering data table number is set clear
              combobox1.setSelectedItem(food[0]);  // after entering data food combobox 1 is set default value
              combobox2.setSelectedItem(beverage[0]);   // after entering data beverage combobox 2 is set default value
             
          }
           
          else if(e.getSource()==button2)    // action performed when button 2 clicked
           {
              
            area.setText(string1);    // displayin all selected food and beverage items's nutrition values
          
           }
          
          else if(e.getSource()==button3)   // action performed when button 3 clicked
           {
              OrderedCustomer o1= new OrderedCustomer (selectedFood,selectedBeverage);  // create object and calling parameterized constructor
              area.setText(string3);    // displying all the customer's data, table number, selected food and selected beverage
           }
          
          else if(e.getSource()==button4)  // action performed when button 4 clicked
           {
              textfield1.setText("");    // set customer name clear
              textfield2.setText("1");    // set table number default value 1 
              combobox1.setSelectedItem(food[0]);   // set default food item in combobox 1
              combobox2.setSelectedItem(beverage[0]);  // set default beverage item in combobox 2
              area.setText("");      // set textarea clear
          }
           
          else if(e.getSource()==button5) // action performed when button 5 clicked
           {
             System.exit(0);    // GUI closed when button 5 clicked
           }
        
     }
     
/*------------------------------------------------------------------------------------------------- */       


    public static void main(String[] args) throws FileNotFoundException 
    {
       
      new RestaurantOrderGUI();  // create object od RestaurentOrderGUI
      
    }

    
}
