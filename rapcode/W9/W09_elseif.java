import java.util.Scanner;

public class W09_elseif {
        public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Your Student id = ");
        int id = kb.nextInt();
        int year = (id/10000000);
            if(year == 68){
                System.out.println("Freshmen");
            }
            else if(year == 67){
                System.out.println("Sophomore");
            }
            else if(year == 66){
                System.out.println("Junior");
            }
            else if(year == 65){
                System.out.println("Senior");
            }
            else{
                System.out.println("only year 68,67,66,65");
            }
    kb.close();    
    }
}

