import java.util.Scanner;

public class W07_ifsqroot {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number = ");
        double x = kb.nextDouble();
    if(x>0){
        System.out.println("Square root of "+ x +(" is ")+(Math.sqrt(x)));
    }
    else 
        System.out.println("Error:number must be more than zero");
    kb.close();
    }
}
