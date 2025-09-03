import java.util.Scanner;
public class metocen {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter centimeter:");
        int cen = kb.nextInt();
        int meter = (cen/100);
        int cen2 = (cen%100);
        System.out.println(("centimeter:")+cen+(" = ")+"meter:"+meter+" centimeter:"+(cen2));
        kb.close();
    }
}
