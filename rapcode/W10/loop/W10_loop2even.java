package loop;
public class W10_loop2even {
    public static void main(String[] args) {
    int i = 2;
    int sum = 0;
        while (i<=20) {
            if(i%2 == 0 && i<20){
            System.out.print(i+" + ");
            sum+=i;
            }
            else if (i%2 == 0 && i==20){
                System.out.print((i)+" = "+ (sum+i));
            }
            i++;
        }
    }
}
