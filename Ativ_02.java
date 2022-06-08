package EXERCÍCIOS.ATIV_02;
import java.util.Scanner;
public class Ativ_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Float b, H, B, Area;
        System.out.println(" Digite o primeiro valor: ");
        b = ler.nextFloat();
        System.out.println(" Digite o segundo valor: ");
        B = ler.nextFloat();    
        System.out.println(" Digite o terceiro valor: ");
        H = ler.nextFloat();
        Area = (H * (b + B))/2;
        System.out.println("Valor exato da área: " + Area);
        System.out.println("Valor exato da área: " + Math.roun3d(Area));
        }
    }
    
