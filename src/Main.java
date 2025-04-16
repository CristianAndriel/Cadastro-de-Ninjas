import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] ninjas = new String[5];
        int contador = 0;
while(true) {
    System.out.println("\n===== Menu Ninja =====");
    System.out.println("1. Cadastrar Ninja");
    System.out.println("2. Listar Ninjas");
    System.out.println("3. Sair");
    System.out.print("Escolha uma opção: ");

    Scanner entradaDeDados = new Scanner(System.in);


    int escolha = entradaDeDados.nextInt();
    entradaDeDados.nextLine();

    switch (escolha) {
        case 1:
            if (contador < ninjas.length) {
                System.out.println("Digite o nome do Ninja: ");
                String nomeNinja = entradaDeDados.next();
                ninjas[contador] = nomeNinja;
                contador++;
                System.out.println("Ninja cadastrado com sucesso!");
            } else {
                System.out.println("Limite de ninjas atingido!");
            }
            break;
        case 2:
            if (contador == 0 ) {
                System.out.println("Nenhum Ninja cadastrado ainda!");
            } else {
                for (int i = 0; i < contador; i++) {
                    System.out.println((i + 1) + ". " + ninjas[i]);
                }
            }
            break;
        case 3:
            System.out.println("Saindo...");
            entradaDeDados.close();
            return;

        default:
            System.out.println("Opção inválida!");
            break;
           }
         }
       }
      }


