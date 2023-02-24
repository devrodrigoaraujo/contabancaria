package contabancaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("              BANCO DO BRASIL                    ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("          1- Criar Conta                         ");
			System.out.println("          2- Listar Todas as Contas              ");
			System.out.println("          3- Buscar Conta por Numero             ");
			System.out.println("          4- Atualizar Dados da Conta            ");
			System.out.println("          5- Apagar Conta                        ");
			System.out.println("          6- Sacar                               ");
			System.out.println("          7- Depositar                           ");
			System.out.println("          8- Transferir Valores entre Contas     ");
			System.out.println("          9- Sair                                ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("          Entre com a opção desejada:            ");
			System.out.println("                                                 ");
			
			opcao=leia.nextInt();
			
			if ( opcao == 9) {
				System.out.println("\nBanco do Brasil- O seu futuro começa aqui!!!");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar Conta \n\n");
				
				break;
				
			case 2:
				System.out.println("Listar todas as Contas\n\n");
	break;
				
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");
	break;
				
			case 4:
				System.out.println("Atualizar dados da Contas\n\n");
	break;
				
			case 5:
				System.out.println("Apagar Conta\n\n");
	break;
				
			case 6:
				System.out.println("Saque\n\n");
	break;
				
			case 7:
				System.out.println("Depósito\n\n");
				
				break;
				
			case 8:
				System.out.println("Transferência entre contas\n\n");
				
	break;
				
			default:
				System.out.println("\nOpção Inválida!\n\n");
				break;
			}
			
		}
		
			
		
	}

}
