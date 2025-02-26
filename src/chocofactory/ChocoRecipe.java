package chocofactory;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 * ChocoFactory application for making choco in a dialog
 * Practice: declaring a class with constructor and instance fields and methods
 * declaring and invoking methods with parameters
 * random number generation
 * looping and branching
 * user interaction with JOptionPane
 * @author ypchui
 * CSCI1130 Java Assignment 3 ChocoFactory
 *
 * Remark: Name your class, variables, methods, etc. properly. 
 * You should write comment for your work and follow good styles.
 *
 * I declare that the assignment here submitted is original except for source
 * material explicitly acknowledged, and that the same or closely related
 * material has not been previously submitted for another course. I also
 * acknowledge that I am aware of University policy and regulations on honesty
 * in academic work, and of the disciplinary guidelines and procedures
 * applicable to breaches of such policy and regulations, as contained in the
 * website.
 *
 * University Guideline on Academic Honesty:
 *     http://www.cuhk.edu.hk/policy/academichonesty
 * Faculty of Engineering Guidelines to Academic Honesty:
 *     https://www.erg.cuhk.edu.hk/erg/AcademicHonesty
 *
 * Student Name: chau long ki <fill in yourself>
 * Student ID  : 1155212137 <fill in yourself>
 * Date        : 8-10-2024 <fill in yourself>
 */
public class ChocoRecipe {

  // Do not MODIFY the two given private fields
  private String name = "";
  private int cocoaPercent;
  
  // Define more date fields as needed
  
  // Do not MODIFY the default constructor which is for the example run
  ChocoRecipe() {
      this.name = "100% Noir";
      this.cocoaPercent = 100;
  }
  
  // STUDENT WORK HERE to modify and add related methods
  public ChocoRecipe(String name , int cocoaPercent){
      this.name = name;
      this.cocoaPercent = cocoaPercent;
  }
  
  public ChocoRecipe(String name_suffix){
        if(name_suffix.equals("Candied")){
            int x = getRandomCocoaPercent(40,54);
            this.name = x+"% "+name_suffix;
        }else if(name_suffix.equals("Delish")){
            int x = getRandomCocoaPercent(55,69);
            this.name = x+"% "+name_suffix;
        }
        
  }
  // Do not MODIFY the method signature which is for CoffeeMaker to call
  public String getName() {
    return name;  // TODO: update the method body as the value returned is Hardcoded now
  }
  
  // Do not MODIFY the method signature which is for CoffeeMaker to call
  public int getCocoaPercent() {
    return cocoaPercent;  // TODO: update the method body as the value returned is Hardcoded now
  }
  
  private int getRandomCocoaPercent(int a,int b){
      Random rand = new Random();
      cocoaPercent = rand.nextInt(b-a+1)+a;
      return cocoaPercent;
  }

  // Do not MODIFY the method signature which is for CoffeeMaker to call
  public void printToConsole() {
      String str = name.toLowerCase();
      System.out.println("This "+str+" recipe has "+cocoaPercent+"% cocoa.");   // TODO: update the method body as needed
  }

  // STUDENT may define extra helper methods here
  
}
