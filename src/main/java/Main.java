import java.util.Scanner;

public class Main { public static void main(String[] args) { Scanner sc = new Scanner(System.in);


    System.out.print("Digite um número para ver a tabuada: ");
    int numero = sc.nextInt();

    System.out.println("Tabuada do " + numero + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }

    sc.close();
}
}