import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        float r1;
        float r2;
        float r3;
        float rt;
        do{
            System.out.println("Ingresa la resistencia 1");
            r1 = sc.nextFloat();
            if(r1<=0){
                System.out.println("Debes ingresar una resistencia positiva");
            }
        }
            while (r1<=0);

        do{
            System.out.println("Ingresa la resistencia 2");
            r2 = sc.nextFloat();
            if(r2<=0){
                System.out.println("Debes ingresar una resistencia positiva");
            }
        }
        while (r2<=0);

        do{
            System.out.println("Ingresa la resistencia 3");
            r3 = sc.nextFloat();
            if(r3<=0){
                System.out.println("Debes ingresar una resistencia positiva");
            }
        }
        while (r3<=0);

        rt=(1/(1/r1+1/r2+1/r3));
        String salida= String.format("La resistencia total es de %.2f",rt);
        System.out.println(salida);



    }
}