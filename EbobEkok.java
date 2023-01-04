import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int divison=1,num1,num2,val1,waste1=1,waste2=1,a=1;
        boolean x=false;
        System.out.println("Please enter first number : ");
        num1=scanner.nextInt();
        System.out.println("Please enter second number : ");
        num2=scanner.nextInt();

        if (num1>num2) {
            val1=num2;
            
        } else 
        {val1=num1; 
        }
        while (!x) {
            x=true;
            for (int i = 2; i <val1; i++) {
                waste1=num1%i;
                waste2=num2%i;
                if (waste1==0 && waste2==0) {
                    divison=i;
                }
            }
            
            
        }System.out.println("EBOB : "+divison);
        
        int ekok=num1*num2/divison;
        System.out.println("EKOK : "+ekok);
        
        
        /*for (int i = 1; i <=val1; i++) {
            waste1=num1%i;
            waste2=num2%i;
            if(waste1==waste2){
                divison=i;
                
            }
        }System.out.println(divison);*/


        
    }
}
