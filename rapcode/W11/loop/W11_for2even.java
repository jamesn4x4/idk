package loop;
public class W11_for2even {
    public static void main(String[] args) {
    int sum = 0;
        for (int i=2;i<=20;i++) {
            if(i%2 == 0 && i<20){
            System.out.print(i+" + ");
            sum+=i;
            }
            if (i%2 == 0 && i==20){
                System.out.print((i)+" = "+ (sum+i));
            }
        }
    }
}
