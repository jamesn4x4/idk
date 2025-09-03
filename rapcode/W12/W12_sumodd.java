public class W12_sumodd {
        public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i<=20 ;i+=2) {
        System.out.println(sum+" + "+i+" = "+ (sum+i));
        sum+=i;
        }
    }
}

