import java.util.*;
public class sk1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.println("enter your number;");
                int n = sc.nextInt();
                if(n%10==0){
                    continue;
                }
                System.out.println(n);
            } while(true);
        }
    }
}
