package EXERCÍCIOS.ATIV_05;

import java.util.Scanner;
public class Ativ_07 {
  public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Float Salario;
        int Horas;
        System.out.println(" Digite a quantidade de horas trabalhadas: ");
        Horas = ler.nextInt();
        Salario = (10.25f * Horas);
        System.out.println("O valor do salario é: " + Salario);
        if (Salario < 50f) 
        {
            System.out.println("Atenção, dirija-se à direção do Hotel!");
        }
        }
    }
