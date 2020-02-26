
package restaurantordergui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class MenuItem {
    
/*----------------------------------Necessary variable declaration----------------------------------------- */ 
  
      private String[] r=new String[50];
      private String[] food=new String[13];
      private String[] beverage=new String[13];
      private String [] energy=new String[26]; 
      private String [] protein=new String[26]; 
      private String [] carbohydrates=new String[26]; 
      private String [] totalfat=new String[26]; 
      private String [] dietaryfibre=new String[26]; 
      
      static int indexFood,indexBeverage,counterFood=0,counterBeverage=0;
      static String selectedfood,selectedbeverage;
      
      static String selectedF[]=new String[10];
      static String selectedB[]=new String[10];
             
      private  int i=0,k=0,q=0;
/*--------------------------------------------------------------------------------------------------------- */ 
    
      private String filename="src\\RestaurantOrderGUI\\Ass1Data.csv";  
      /*
        Ass1Data.csv file path is set acording to my computer. If run it in different pc must change this path other 
        wise it will not get tha data.
        */
      
/*--------------------------------------------------------------------------------------------------------- */ 

      File file=new File(filename);     // create object of file class
      Scanner inputStream = new Scanner(file);   // create object of scanner
        
/*-------------------------------------MenuItem constructor------------------------------------------------- */ 
       
      
    MenuItem() throws FileNotFoundException       // Menuitem class constructor
    {
        
        while(inputStream.hasNext())    // reading data from .csv file
         {
            String data=inputStream.nextLine();  // reading one line data
            String[] rowdata=data.split(",");   // split one line data into one word and storing into rowdata array
            
            r[i]=rowdata[1];               // storing column one all data(item names) from .csv file into array
            energy[i]=rowdata[2];          // storing column two all data(energy) from .csv file into energy array
            protein[i]=rowdata[3];         // storing column three all data(protein) from .csv file into protein array  
            carbohydrates[i]=rowdata[4];   // storing column four all data(carbohydrates) from .csv file into carbohydrates array
            totalfat[i]=rowdata[5];        // storing column five all data(totalfat) from .csv file into totalfat array
            dietaryfibre[i]=rowdata[6];    // storing column six all data(dietaryfibre) from .csv file into dietaryfibre array
            
            i++;
         }
           

        for(int j=1;j<13;j++)  // storing food item names into food array
         {
            food[q]=r[j];
            q++;
         }
           

        for(int j=13;j<26;j++) // storing beverage item names into beverage array
         {
            beverage[k]=r[j];
            k++;
         }
            
              
    }
/*--------------------------------------------------------------------------------------------------------- */ 

/*-------------------------------------Set and Get methods------------------------------------------------- */ 
    
    public void setselectedfood(String f)  // method for setting selected food item from combobox
    {
        this.selectedfood=f;  // store selected food name into selectedfood variable
        
        if(counterFood>=0)
         {
             selectedF[counterFood]=selectedfood; // store all selected food items into selectedF array
             
         }
        for(i=0;i<13;i++)  // condition for getting selected food index
         {
             if(r[i].equals(selectedfood)) //checking the selected food from item name array
             {
                  this.indexFood=i;  //store selected food index into indexFood variable
             } 
         }
        counterFood++; // counterFood variable count how many food item enterd
    }
    
    public void setselectedbeverage(String b) // method for set selected beverage item
    {
        this.selectedbeverage=b;   // store selected beverage name into selectedbeverage variable
        
        if(counterBeverage>=0)
         {
             selectedB[counterBeverage]=selectedfood;  // store all selected beverage items into selectedF array
         }
        for(i=13;i<26;i++)   // condition for getting selected beverage index
         {
             if(r[i].equals(selectedbeverage)) //checking the selected beverage from item name array
             {
                 indexBeverage=i; // store selected beverage name into selectedbeverage variable
             } 
         }
       counterBeverage++;  // counterFood variable count how many beverage item enterd
    }
      
      
    public String[] getfood() //method for return food array
    {
          return food;
    }
    public String[] getbeverage() //method for return beverage array
    {
          return beverage;
    }
    public String getselectedfood() //method for return selectedfood variable
    {
          return selectedfood;
    }
    public String getselectedbeverage() //method for return selectedbeverage variable
    {
          return selectedbeverage;
    }
    public int getindexf()  //method for return indexFood variable
    {
          return indexFood;
    }
    public int getindexb()  //method for return indexBeverage variable
    {
       return indexBeverage;
    }
    public String[] getenergy() //method for return energy array
    {
          return energy;
    }
    public String[] getprotein() //method for return protein array
    {
          return  protein;
    }
    public String[] getcarbohydrates() //method for return carbohydrates array
    {
          return  carbohydrates;
    }
    public String[] gettotalfat() //method for return totalfat array
    {
          return totalfat;
    }
    public String[] getdietaryfibre() //method for return dietaryfibre array
    {
          return dietaryfibre;
    }

/*--------------------------------------------------------------------------------------------------------- */ 
/*--------------------------------------ToString method---------------------------------------------------- */ 

    public String toString()  //method to display all selected foods and beverages
    {   
         String cN[]=new String[counterFood];
         String cT[]=new String[counterBeverage];
         String display="";
         for(int i=0;i<counterFood;i++)
         {
             cN[i]=selectedF[i];
             cT[i]=selectedB[i];
             
             display=display+"selected Food==> "+ String.format(cN[i].toString()+"   \n  selected beverage==>"+String.format(cT[i].toString())+"\n"+"");
         }
           
           return display;
       
     }
      
/*--------------------------------------------------------------------------------------------------------- */ 
      
}
