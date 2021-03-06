import java.util.Scanner;

class Exercise6 {

  private Scanner in = new Scanner(System.in);

  void menu(int[] tab) {
    while (true) {
      System.out.println();
      System.out.println("Choose an option:");
      System.out.println("[1] - Max value");
      System.out.println("[2] - Min value");
      System.out.println("[3] - Dispersion of values");
      System.out.println("[4] - Average value of array");
      System.out.println("[5] - Sum of array");
      System.out.println("[6] - Standard deviation");
      System.out.println("[7] - Variance");
      System.out.println("[8] - Get elements divided by 3");
      System.out.println("[9] - Get value of nth element");
      System.out.println("[10] - Back to main menu");

      System.out.print("Your choice: ");

      short response = in.nextShort();

      switch (response) {

        case 1:
          System.out.println("The biggest value in array: " + maxValue(tab));
          break;

        case 2:
          System.out.println("The lowest value in array: " + minValue(tab));
          break;

        case 3:
          dispersion(tab);
          break;

        case 4:
          System.out.println("Average value of array is: " + average(tab));
          break;

        case 5:
          System.out.println(sum(tab));
          break;

        case 6:
          System.out.println("Standard deviation: " + standardDeviation(tab));
          break;

        case 7:
          System.out.println("Variance: " + variance(tab));
          break;

        case 8:
          System.out.println("Number of elements divided by 3: " + getElementsBy3(tab));
          break;

        case 9:
          System.out.println("Enter the item number: ");
          int n = in.nextInt();
          System.out.println("Value of " + n + " element is: " + getValue(tab, n));
          break;

        case 10:
          return;

        default:
          break;

      }
    }

  }

  private int maxValue(int[] tab) {
    int max = 0;
    for (int i1 : tab) {
      if (i1 > max)
        max = i1;
    }
    return max;
  }

  private int minValue(int[] tab) {
    int min = 999999999;
    for (int i = 0; i < 10; i++) {
      if (tab[i] < min)
        min = tab[i];
    }
    return min;
  }

  private void dispersion(int[] tab) {
    int[] t = new int[9];

    for (int i = 0; i < 9; i++) {
      if (tab[i] > tab[i + 1])
        t[i] = (tab[i] - tab[i + 1]);
      else
        t[i] = (tab[i + 1] - tab[i]);
    }

    for (int i = 0; i < 9; i++) {
      System.out.println(t[i]);
    }
  }

  private double average(int[] tab) {
    double result = 0;
    for (int i = 0; i < 10; i++) {
      result += tab[i];
    }
    return result / 10;
  }

  private double sum(int[] tab) {
    double dresult = 0;
    for (int i = 0; i < 10; i++) {
      dresult += tab[i];
    }
    return dresult;
  }


  private double standardDeviation(int[] tab) {
    return Math.sqrt(variance(tab));
  }


  private double variance(int[] tab) {
    double sum = 0;
    double numerator = 0.0;

    for (int i1 : tab) {
      sum += i1;
    }

    for (int i1 : tab) {
      numerator += Exercise4.raiseToPower(i1 - (sum / tab.length), 2);
    }
    return numerator / (tab.length - 1);
  }

  private int getElementsBy3(int[] tab) {

    int counter = 0;

    for (int i1 : tab) {
      if (i1 % 3 == 0) {
        counter++;
      }

    }
    if (counter == 0) {
      System.out.println("There is no elements divided by 3");
    }
    return counter;
  }

  private int getValue(int[] tab, int n) {
    return tab[n];
  }
}
