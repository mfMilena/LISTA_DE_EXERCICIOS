import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ativ_09 {
public static void main(String[] args) {
    float n1, n2, media;
    Scanner var = new Scanner(System.in);
    System.out.println(" Digite nota 1: ");
    n1= var.nextInt();
    System.out.println(" Digite nota 2: ");
    n2= var.nextFloat();
    media = (n1 + n2)/2;
    JOptionPane.showMessageDialog(null, "Media: " + media);
}
    
}
