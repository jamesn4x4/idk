import java.util.Scanner;

public class arrayScanner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a[] = new double[5]; 
        double sumal=0;
        double sumod=0;
        double sumev=0;
        double avg=0;
            for (int i=0;i <5 ;i++){
                System.out.print("Enter number "+(i+1) +": ");
                a[i] = kb.nextDouble();
                sumal = sumal+a[i];
        }
        double max=a[0],min=a[0];
        avg = sumal/5;
        System.out.println("show all number");
        for (int i=0;i<a.length ;i++){
        System.out.println("index "+i +": "+a[i]);
            if(a[i]%2!=0) sumod = sumod+a[i];
            if(a[i]%2==0) sumev = sumev+a[i];
            if(max<a[i]) max = a[i];
            if(min>a[i]) min = a[i];
        }
        System.out.println("sum all number = "+sumal);
        System.out.println("sum all odd = "+sumod);
        System.out.println("sum all even = "+sumev);
        System.out.println("average all number = "+avg);
        System.out.println("min number = "+min);
        System.out.println("max number = "+max);
    kb.close();
    }
}

