import java.util.Random;
import java.util.Scanner;

public class W13_random_num_loop {
    public static void main(String[] args) {
    int rand,guess,loser=0; 
    Scanner kb = new Scanner(System.in);
    Random ran = new Random();
    rand = ran.nextInt(10)+1;
    for (int i=0;i<3;i++) {
        System.out.print("guess number 1-10: ");
        guess = kb.nextInt();
        if(guess == rand){
            System.out.println("you guess right!!!!!!");
            System.out.println("=============WIN==============");
        break;
        }
        else if(guess>10){
            System.out.println("please Enter only number 1-10");
            System.out.println("=============================");
            i--; loser--;
        }
        else if (i<2){
            System.out.println("Incorrect try again"+(" ")+("your try left ")+(2-i));
            System.out.println("=============LOSE=============");
        }
        else{
            System.out.println("Incorrect you LOSE");
            System.out.println("==============================");
        }
        loser++;
    }
    if (loser == 3)
        System.out.println("number is "+rand);
    // int i=0;
    // while(i<3){
    //     System.out.print("guess number (1-10): ");
    //     guess = kb.nextInt();
    //     if(guess == rand){
    //         System.out.println("you guess right!!!!!!");
    //         System.out.println("=============WIN=============");
    //         break;
    //     }
    //     else{
    //         System.out.println("Incorrect try again");
    //         System.out.println("=============LOSE=============");
    //         loser++;
    //     }
    //     i++;
    // }
    // if (loser == 3)
    //     System.out.println("Game Over. number is "+rand);
    kb.close();
    }
}

