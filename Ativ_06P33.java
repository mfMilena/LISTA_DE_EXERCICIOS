package EXERCÍCIOS.ATIV_06;

import java.util.Scanner;
public class Ativ_08 {
   public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Float Valor, Conversao;
    int Opc;
    System.out.println(" Digite 1 para converter Libras e 10 para converter Quilos: ");
    Opc = ler.nextInt();
    System.out.println(" Digite uma valor para converter: ");
    Valor = ler.nextFloat();
    if (Opc == 1)
    {
        Conversao = Valor * 2.205f;
        System.out.println("Valor convertido para Libras sera de:" + Conversao + "aproximadamente");
    } else
    if (Opc == 10)
    {
        Conversao = Valor / 2.205f;
        System.out.println("Valor convertido para Quilos sera de: " + Conversao + " aproximadamente");  
    }
    }
}
