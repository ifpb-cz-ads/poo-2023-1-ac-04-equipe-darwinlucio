import java.util.Scanner;
class exercicio04{
	
	public static void main(String[] args){
		
		Scanner ler=new Scanner(System.in);
		int dia;
		System.out.println("diga qual eh o dia da semana:");
		dia=ler.nextInt();
		
		switch(dia){
		case 1: System.out.println("Segunda-feira");
		break;
		case 2: System.out.println("terça-feira");
		break;
		case 3: System.out.println("quarta-feira");
		break;
		case 4: System.out.println("quinta-feira");
		break;
		case 5: System.out.println("Sexta-feira");
		break;
		case 6: System.out.println("Sabado-feira");
		break;
		case 7: System.out.println("domingo-feira");
		break;
		default: System.out.println("dia da semana inválido!");
}
}
}
