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

import java.util.Random;
import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {        

        Random r = new Random();

        // Untuk random di bawah ini ada banyak caranya. Random menghasilkan nilai desimal
        // 0 dan 1 dikali 10 jadinya range random antara 0 dan 9. 10 tdidak masuk
        int number1 = (int) (Math.random() * 10);

        // Pake nextInt() juga bisa
        int randomInt = r.nextInt(100) + 1;
        System.out.println(randomInt);

        Scanner input = new Scanner(System.in);
        boolean stillPlay = true;
        while (stillPlay) {
            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();
            
            if (decimal < randomInt) {
                System.out.println("Too low");
            } else if (decimal > randomInt) {
                System.out.println("Too High");
            } else if (decimal == randomInt) {
                System.out.println("Right!");
                stillPlay = false;
            }
        }
    }
}