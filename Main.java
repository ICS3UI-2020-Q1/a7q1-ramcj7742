import java.util.Scanner;
/**
 * puts letter grade to number grade
 * @author Jaden Ramcharan
 */
public class Main {

  //calcuates letter grade
  public static void examGrade(int examPercentage){
    if(examPercentage >= 80){
      System.out.println("A");
    }else if(examPercentage >= 70){
      System.out.println("B");
    }else if(examPercentage >= 60){
      System.out.println("C");
    }else if(examPercentage >= 50){
      System.out.println("D");
    }else if(examPercentage < 50){
      System.out.println("F");
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets user examPercentage
    System.out.println("Please enter a percentage to be converted to a letter");
    int examPercentage = input.nextInt();

    //displays grade
    examGrade(examPercentage);
    
  }
}
