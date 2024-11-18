import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    printNTimes("code", 3);
    System.out.println();
    printNums();
    System.out.println();
    System.out.println("Input a number: ");
    int triangleHeight = sc.nextInt();
    uprightNumberTriangle(triangleHeight);
    System.out.println();
    System.out.println("Input a number: ");
    int starTreeHeight = sc.nextInt();
    starTree(starTreeHeight);
    System.out.println();
    multTable();

  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(word.substring(i, i + 1));
      }
    }
  }

  public static void printNums()
  {
    for (int i = 10; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void starTree(int N)
  {
   for (int i = 0; i < N; i++) {
    for (int j = 0; j < i; j++) {
      System.out.print(" ");
    }

    for (int k = i; k < N; k++) {
      System.out.print("* ");
    }
    System.out.println();
   }
  }

  public static void multTable()
  {
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}
