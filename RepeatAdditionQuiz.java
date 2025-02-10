// This is a single-line comment

/*
$ git remote add origin https://github.com/OWNER/REPOSITORY.git
# Set a new remote

1. Set remote dulu. List remote dengan "git remote -v", untuk munculin list remote github
2. "git remote set-url origin <url-baru>" untuk pindah remote
3. "git add ." untuk add semua file yang ada di directory local kita
4. "git commit -m <message>" untuk ngasih tahu perubahan di dalam github
5. "git push -u origin main" untuk push/masukin perubahan baru ke github link
 */

/* "git branch" untuk ngasih tahu branch dan linknya
* "git switch <nama-branch> untuk pindah branch"
*/

import java.util.Scanner;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " + " + number2 + "? ");
    int answer = input.nextInt();
    
    while (answer != number1 + number2 ) {
      System.out.print("Wrong answer. Try again. What is " 
        + number1 + " + " + number2 + "? ");
      answer = input.nextInt();
    }

    System.out.println("You got it!");
  }
}