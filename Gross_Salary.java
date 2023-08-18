import java.util.Scanner;
public class Gross {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int BS;
        Double GS,DA,HRA;
        BS=sc.nextInt();
        if(BS<=10000) {
            DA=0.8*BS;
            HRA=0.2*BS;
        }
        else if(BS>10000 && BS<=20000) {
            DA=0.9*BS;
            HRA=0.25*BS;
        }
        else
        {
            DA=0.95*BS;
            HRA=0.3*BS;
        }
        GS=BS+DA+HRA;
        System.out.printf("%.2f",GS);
        
    }
}