import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    System.out.println("Enter in a number");
    double target = 12.345;
    double user_input = scan.nextDouble();

    if (user_input == target)
    {
      System.out.println("Yes!");
    }

    System.out.println("Enter in another number");
    int target2 = 48;
    int user_input2 = scan.nextInt();

    if (target2 == user_input2)
    {
      System.out.println("Yes!");
    }

    System.out.println("Enter in two numbers");
    int user_input3 = scan.nextInt();
    int user_input4 = scan.nextInt();
    int double3 = user_input3 * 2; 
    
    if (user_input4 == double3)
    {
      System.out.println("Yes!");
    }

    System.out.println("Please enter an integer");
    int user_input5 = scan.nextInt();
    int divisible2 = user_input5 % 2;
    int divisible3 = user_input5 % 3;

    if (divisible2 == 0)
    {
      System.out.println("Divisible by 2!");
    }

    if (divisible3 == 0)
    {
      System.out.println("Divisible by 3!");
    }

    System.out.println("Please enter an integer");
    



    


    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
