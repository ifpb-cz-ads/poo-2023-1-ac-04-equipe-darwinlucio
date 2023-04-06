import java.util.Scanner;

public class Atividade04Questao01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a sua Idade: ");
		int idade = sc.nextInt();
		
		if(idade < 16) {
			System.out.println("Não pode votar");
		} else if(idade > 65 || idade == 16 || idade == 17) {
			System.out.println("Voto Facultativo!");
		} else if(idade >= 18 && idade <= 65) {
			System.out.println("Voto Obrigatório");
		}
		
		sc.close();
	}
}
