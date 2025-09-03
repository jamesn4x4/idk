import java.util.Scanner;
public class W12_suminput {
        public static void main(String[] args) {
        int sum = 0,round = 1,start,stop;
        Scanner kb = new Scanner(System.in);
        do{
        System.out.print("Enter start number: ");
        start = kb.nextInt();
        System.out.print("Enter stop number: ");
        stop = kb.nextInt();
            if (start<=stop){
                for (int i = start;i<=stop ;i++) {
                System.out.println("round "+round+": "+sum+" + "+i+" = "+ (sum+i));
                sum+=i; round++; 
                }
            }else{
            System.out.println("Enter number again");
            }
        }while(start>=stop);
    kb.close();
    }
}