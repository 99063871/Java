import java.security.Principal;
import java.util.Scanner;

class ijs{
    public static void main(String[] args){
        System.out.println("Hoeveel bolletjes wilt u?");;
        Scanner bolletjesIn = new Scanner(System.in);
        String bolletjes = bolletjesIn.nextLine();
        System.out.println("U heeft "+ bolletjes + " bolletje(s) besteld");

        System.out.println("Wilt u meer bestellen?");
        Scanner meerIn = new Scanner(System.in);
        String meer = bolletjesIn.nextLine();
        if(meer.equalsIgnoreCase("ja") || meer.equalsIgnoreCase("j") || meer.equalsIgnoreCase("yes") || meer.equalsIgnoreCase("y")){
            //bonnetje
            System.out.println("succes man");
            
        } else{
            //bestelling herhalen
            System.out.println("");
        } 
    }
}