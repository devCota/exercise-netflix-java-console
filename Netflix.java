import java.util.Scanner;

public class Netflix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int plano = 0;
        int idade = -1;
        String regiao;

        while (true) {
            System.out.print("Digite o código do plano (1, 2 ou 3): ");

            if (scanner.hasNextInt()) {
                plano = scanner.nextInt();

                if (plano >= 1 && plano <= 3) {
                    break;
                } else {
                    System.out.println("Código inválido. Digite apenas 1, 2 ou 3.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Digite a idade do usuário: ");

            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();

                if (idade >= 0 && idade <= 120) {
                    break;
                } else {
                    System.out.println("Idade inválida. Digite um valor entre 0 e 120.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }

        scanner.nextLine();

        while (true) {
            System.out.print("Digite a região do usuário: ");
            regiao = scanner.nextLine().trim();

            if (!regiao.isEmpty()) {
                break;
            } else {
                System.out.println("A região não pode ficar vazia.");
            }
        }

        System.out.println("\n--- Resultado ---");

        switch (plano) {
            case 1:
                System.out.println("Resolução 720p - 1 tela disponível.");
                break;
            case 2:
                System.out.println("Resolução 1080p (Full HD) - 2 telas disponíveis.");
                break;
            case 3:
                System.out.println("Resolução 4K + HDR - 4 telas disponíveis.");
                break;
            default:
                System.out.println("Código de plano inválido.");
        }

        if (idade < 12) {
            System.out.println("Categoria: Infantil (Desenhos e Animações).");
        } else if (idade <= 17) {
            System.out.println("Categoria: Adolescente (Séries Teen e Aventura).");
        } else {
            System.out.println("Categoria: Adulto (Filmes de Ação e Documentários).");
        }

        if (regiao.equalsIgnoreCase("Brasil")) {
            System.out.println("Destaque: Assista agora produções originais brasileiras!");
        }

        scanner.close();
    }
}
