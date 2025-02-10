import java.util.Scanner; 


// Jangan pake tipe data double untuk equality check dalam loop control
public class SentinelValue {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Read an initial data
    System.out.print(
      "Enter an integer (the input ends if it is 99999): ");

    // Setiap variabel dideklarasi dulu tipe data variable
    int data = input.nextInt();

    // Keep reading data until the input is 0
    int sum = 0;
    while (data != 99999) {
      sum += data;

      System.out.println("apakah akan isi data lagi(y/n)");
      String jawab = input.next();
      if (jawab.equals("y")){
        // Read the next data
        System.out.print(
          "Enter an integer (the input ends if it is 99999): ");
        data = input.nextInt();
      }
      else
        data = 99999;
    }

    System.out.println("The sum is " + sum);
  }
}