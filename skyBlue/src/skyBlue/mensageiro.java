package skyBlue;
import java.util.Scanner;
public class mensageiro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Seja bem vindo a SkyBlue "+nome+" !!!");
	}
}