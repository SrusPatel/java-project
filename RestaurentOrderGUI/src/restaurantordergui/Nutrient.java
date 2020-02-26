
package restaurantordergui;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Nutrient{
   
   
    MenuItem menuitem=new MenuItem();
  
/*----------------------------------Necessary variable declaration----------------------------------------- */ 
    
    private double foodEnergy,foodProtein,foodCarbohydrates,foodTotalfat,foodDietaryfibre,beverageEnergy,beverageProtein,beverageCarbohydrates,beverageTotalfat,beverageDietaryfibre;
    private double totalFoodNutrition,totalBeverageNutrition,totalNutrient=0;
    private int selectedfoodIndex,selectedBeverageIndex;
    private String selectedFood,selectedBeverage;
    
/*--------------------------------------------------------------------------------------------------------- */ 
/*----------------------------------Nutrient constructor--------------------------------------------------- */ 

    public Nutrient() throws FileNotFoundException {
              
         
   
    selectedFood=menuitem.selectedfood;         // store selected food item into selectedFood variable
    selectedBeverage=menuitem.selectedbeverage;  // store selected beverage item into selectedBeverage variable
    selectedfoodIndex=menuitem.getindexf();      // store selected food index into selectedfoodIndex variable
    selectedBeverageIndex = menuitem.getindexb();  // store selected bevarage index into selectedbeverageIndex variable
    String energy[]=menuitem.getenergy();          // store values of energy into energy array
    String protein[]=menuitem.getprotein();     // store values of protein into protein array
    String [] carbohydrates=menuitem.getcarbohydrates();  // store values of carbohydrates into carbohydrates array
    String [] totalfat=menuitem.gettotalfat();          // store values of totalfat into totalfat array
    String [] dietaryfibre=menuitem.getdietaryfibre();   // store values of dietaryfibre into dietaryfibre array

    
      foodEnergy=Double.parseDouble(energy[selectedfoodIndex]);  //get selected food energy value 
      foodProtein=Double.parseDouble(protein[selectedfoodIndex]);  //get selected food protein value
      foodCarbohydrates=Double.parseDouble(carbohydrates[selectedfoodIndex]);  //get selected food carbohydrates value
      foodTotalfat=Double.parseDouble(totalfat[selectedfoodIndex]);   //get selected food totalfat value
      foodDietaryfibre=Double.parseDouble(dietaryfibre[selectedfoodIndex]);  //get selected food dietaryfibre value

      totalFoodNutrition = foodEnergy+foodProtein+foodCarbohydrates+foodTotalfat+foodDietaryfibre;  //total all food nutrition value
                        


      beverageEnergy=Double.parseDouble(energy[selectedBeverageIndex]); //get selected beverage energy value 
      beverageProtein=Double.parseDouble(protein[selectedBeverageIndex]);   //get selected beverage protein value 
      beverageCarbohydrates=Double.parseDouble(carbohydrates[selectedBeverageIndex]);   //get selected beverage carbohydrates value 
      beverageTotalfat=Double.parseDouble(totalfat[selectedBeverageIndex]);       //get selected beverage totalfat value 
      beverageDietaryfibre=Double.parseDouble(dietaryfibre[selectedBeverageIndex]);   //get selected beverage dietaryfibre value 

      totalBeverageNutrition = beverageEnergy+beverageProtein+beverageCarbohydrates+beverageTotalfat+beverageDietaryfibre;  //total all beverage nutrition value
          
      totalNutrient=totalFoodNutrition+totalBeverageNutrition; //total whole meal nutrition value
    }
    
/*--------------------------------------------------------------------------------------------------------- */ 
/*---------------------------------Get method-------------------------------------------------------------- */ 

    public double gettotalnutrient() //return totalNutrient 
    {
        return totalNutrient; 
    }
/*--------------------------------------------------------------------------------------------------------- */ 
    
/*-----------------------------------ToString method------------------------------------------------------- */ 
   
      @Override
     public String toString()  //display all nutrition data
     {
         return String.format("%s                   %s\n%s=>%.2f\n%s=>%.2f\n%s=>%.2f\n%s=>%.2f\n%s=>%.2f\n%s=>%.2f\n\n"
                 
                 +            "%s                   %s\n%s=>%.2f\n%s=>%.2f\n%s=>%.2f\n%s=>%.2f\n%s=>%.2f\n%s=>%.2f\n\n "
                
                 +            "%s=>%.2f\n"
                 +"--------------------------------------------------------------------------------------------------------\n",
                               selectedFood,"Nutrition values",
                               "energy",foodEnergy,
                               "Protein",foodProtein,
                               "carbohydrates",foodCarbohydrates,
                               "totalfat",foodTotalfat,
                               "dietaryfibre",foodDietaryfibre,
                               "Total Nutrition in selected food",totalFoodNutrition,
                               
                              
                               selectedBeverage,"Nutrition values",
                               "energy",beverageEnergy,
                               "Protein",beverageProtein,
                               "carbohydrates",beverageCarbohydrates,
                               "totalfat",beverageTotalfat,
                               "dietaryfibre",beverageDietaryfibre,
                               "Total Nutrition in selected food",totalBeverageNutrition,
                               "Whole meal nutrition value",totalNutrient
                               
                               );
     }   
        
/*--------------------------------------------------------------------------------------------------------- */ 
  
    
     
        
        
        
}
