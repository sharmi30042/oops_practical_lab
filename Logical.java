package CSE;
import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println((5 > 3) && (8 > 5));  
        System.out.println((5 > 3) && (8 < 5));  
        System.out.println((5 < 3) || (8 > 5));  
        System.out.println((5 > 3) || (8 < 5)); 
        System.out.println((5 < 3) || (8 < 5));  
        System.out.println(!(5 == 3));  
        System.out.println(!(5 > 3));  
    }
    }