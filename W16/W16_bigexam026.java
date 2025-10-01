import java.util.Scanner;

public class W16_bigexam026 {
    public static void main(String[] args) {
    int start_l,end_l;
    int odd=0;
    int even=0;
    Scanner kb = new Scanner(System.in);
    do{
    System.out.print("Enter start number: ");
    start_l = kb.nextInt();
    System.out.print("Enter end number: ");
    end_l = kb.nextInt();
    if(start_l<end_l){
        System.out.println("--------------------------");
        System.out.print("Show All Number: ");
        for (int i=start_l;i<=end_l;i++){
            System.out.print(" "+i);
            if(i%2 == 0)
            even++;
            if(i%2 != 0)
            odd++;
        }
        System.out.println("");
        System.out.println("Amount of Even Numbers = "+even);
        System.out.println("Amount of Odd Numbers = "+odd);
    }else{
        System.out.println("----------warning----------");
        System.out.println("Start number must be less than end number");
        System.out.println("Plase enter again");
        System.out.println("--------------------------");
        }
        }while(start_l>=end_l);
    }
}

