package chocofactory;

// imports for JOptionPane, Random, etc.
import javax.swing.JOptionPane;
import java.util.Random;

/**
 * ChocoTime application for making choco in a dialog
 * Practice: declaring a class with constructor and instance fields and methods
 * declaring and invoking methods with parameters
 * random number generation
 * looping and branching
 * user interaction with JOptionPane
 * @author ypchui
 * CSCI1130 Java Assignment 3 ChocoTime
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
public class ChocoFactory {

  private static String[] chocoNames;
  private static int[] cocoaPercents;
  private static ChocoMaker chocoMaker;

  /**
   * Show a menu of choices and get user's input, given method
   * @return a String of user input: "1","2",��,"4", null means Cancel/Close
   */
   public static String showChocoMenu() {
   /*** student's work to display choco menu items ***/
 
   
      return JOptionPane.showInputDialog("Make your choco: Input your choice\n"+"1. 100% Noir\n"+"2. 70% Dark\n"+"3. [40%~69%] Candied or Delish\n"+"4. Quit\n");
   }
   
   public String candied_delish(){
      int yes_no =JOptionPane.showConfirmDialog(null,"Candied?","Candied or Delish?",JOptionPane.YES_NO_OPTION);
      if(yes_no==0){
        return "Candied";
      }
        return "Delish";
      
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Example use of ChocoMaker with a ChocoRecipe, you should replace them with your own logic
    //*
    chocoMaker = new ChocoMaker();
   
    /*for(int i=0; i<3; i++) {
        ChocoRecipe choco = new ChocoRecipe();
        chocoMaker.makeChoco(choco);
    }*/
    //chocoMaker.makeChoco(new ChocoRecipe("70% Dark", 70));  // this fails initially
    //*/
    // End of the exmample
    
    // initialize choco names & milk percent

    /*** student's work here to initialize values, call getChoiceFromChocoMenu()of the ChocoTimeHelper class,            where Number-Format Exceptions are handled for you.
       Modify the following sample code fragment to start processing user requests in a loop ***/
    
   int chocoMenuChoice=0;
    while(chocoMenuChoice!=4){
    chocoMenuChoice = ChocoMaker.getChoiceFromChocoMenu();
    if (chocoMenuChoice == -1) {
        System.out.println("User closed or cancelled dialog box\n");
        JOptionPane.showMessageDialog(null,"Input again\n");
        //System.exit(0);
    }
    else if (chocoMenuChoice == -2) {
        JOptionPane.showMessageDialog(null,"Input again\n");// optionally printed for debugging purposes
        
        // STUDENT WORK HERE
    }else if(chocoMenuChoice == 1){
        System.out.printf("User picked %d\n",chocoMenuChoice);
        ChocoRecipe choco = new ChocoRecipe();
        if(chocoMaker.makeChoco(choco)==-1){
        JOptionPane.showMessageDialog(null,"Bye!");
        System.exit(0);
        }
        JOptionPane.showMessageDialog(null,"A new 100% Nior is made!");

    }else if(chocoMenuChoice == 2){
        System.out.printf("User picked %d\n",chocoMenuChoice);
        ChocoRecipe choco = new ChocoRecipe("70% Dark",70);
        if(chocoMaker.makeChoco(choco)==-1){
        JOptionPane.showMessageDialog(null,"Bye!");
        System.exit(0);
        }
        JOptionPane.showMessageDialog(null,"A new 70% Dark is made!");
        
    }else if(chocoMenuChoice == 3){
        System.out.printf("User picked %d\n",chocoMenuChoice);
        ChocoFactory x = new ChocoFactory();
        String type = x.candied_delish();
        ChocoRecipe choco = new ChocoRecipe(type);
       if(chocoMaker.makeChoco(choco)==-1){
        JOptionPane.showMessageDialog(null,"Bye!");
        System.exit(0);
        }
        JOptionPane.showMessageDialog(null,"A new "+choco.getName()+" is made!");
    }else {
        JOptionPane.showMessageDialog(null,"Bye!");
        System.out.println("User picked 4 to quit.");
        System.out.println("Bye!");
        System.exit(0); 
    }
    
    }
    
    
                
    // STUDENT WORK HERE

          
  }
}