import java.util.Scanner;
public class W12_sumnumber {
        public static void main(String[] args) {
        int sum = 0,round = 1,start,stop;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter start number: ");
        start = kb.nextInt();
        System.out.print("Enter stop number: ");
        stop = kb.nextInt();
        while(start>=stop){
        System.out.println("Enter number again");
        System.out.print("Enter start number: ");
        start = kb.nextInt();
        System.out.print("Enter stop number: ");
        stop = kb.nextInt();
        } 
        if (start<=stop){
                for (int i = start;i<=stop ;i++) {
                System.out.println("round "+round+": "+sum+" + "+i+" = "+ (sum+i));
                sum+=i; round++; 
                }
        }
    kb.close();
    }
}