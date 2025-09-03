import java.util.Scanner;

public class W09_ScoreGrade{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Score: ");
        byte score = kb.nextByte();
        if(score>100 || score<0){
            System.out.println("ERROR Score need to be in 0-100");
        }
        else if(score>79){
            System.out.println("Grade = A");
        }
        else if(score>69){
            System.out.println("Grade = B");
        }
        else if(score>59){
            System.out.println("Grade = C");
        }
        else if(score>49){
            System.out.println("Grade = D");
        }
        else{
            System.out.println("Grade = F");
        }
        kb.close();
    }
}