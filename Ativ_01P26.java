package EXERCÍCIOS.ATIV_01;

import java.util.Scanner;
public class Ativ_01 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Integer b, H, B, Area;
    System.out.println(" Digite o primeiro valor: ");
    b = ler.nextInt();
    System.out.println(" Digite o segundo valor: ");
    B = ler.nextInt();    
    System.out.println(" Digite o terceiro valor: ");
    H = ler.nextInt();
    Area = (H * (b + B))/2;
    System.out.println("Resultado:" + Area);
    }
}
