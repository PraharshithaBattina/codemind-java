import java.util.Scanner;
public class grades{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p,m,b,c,com;
        Double per;
        p = sc.nextInt();
        m = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        com = sc.nextInt();
        int n=p+m+b+c+com;
        int t=n*100/500;
        if(t>=90){
            System.out.println("Grade A");
        }
        else if(t>=80){
            System.out.println("Grade B");
        }
        else if(t>=70){
            System.out.println("Grade C");
        }
        else if(t>=60){
            System.out.println("Grade D");
        }
        else if(t>=40){
            System.out.println("Grade E");
        }
        else if(t<40){
            System.out.println("Grade F");
        }
    }
}