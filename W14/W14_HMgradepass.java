import java.util.Scanner;

public class W14_HMgradepass {
    public static void main(String[] args) {
    int num_std,pas=0,fai=0,score;
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    num_std = kb.nextInt();
    System.out.println("===========================");
    for (int i=1;i <= num_std;i++) {
        System.out.print("Enter score of students: ");
        score = kb.nextInt();
        if(score>=50){
            System.out.println("Students "+i+" Passed");
            System.out.println("===========================");
            pas++;
        }
        else{
            System.out.println("Students "+i+" Failed");
            System.out.println("===========================");
            fai++;
        }
        }
        System.out.println("Students Passed = "+pas+" persons");
        System.out.println("Students Failed = "+fai+" persons");
    kb.close();
    }
}

