import java.util.Scanner;

public class Zoologico{

    public static void main(String[]args){
        System.out.println("Zoológico");
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("=============================");
            System.out.println("1 - Cadastrar Animais: ");
            System.out.println("2 - Cadastrar Jaula: ");
            System.out.println("3 - Cadastrar Alimentação: ");
            System.out.println("4 - Cadastrar Limpeza: ");
            System.out.println("0 - Sair");
            System.out.println("=============================");
            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    cadastrarAnimais(scanner);
                    break;
                case 2: 
                    cadastrarJaula(scanner);
                    break;
                case 3: 
                    cadastrarAlimentacao(scanner);
                    break;
                case 4: 
                    cadastrarLimpeza(scanner); 
                    break;
                    
                case 0: 
                    System.out.println("Sair");
                    break;
                default:
                System.out.println("Opção Inválida!");
            }
        }while (opcao !=0);
        scanner.close();
    }

    public static void cadastrarAnimais(Scanner scanner){
        System.out.println("Cadastro de Animais");
        System.out.println("Digite o ID do Animal: ");
        int id = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Espécie: ");
        String especie = scanner.next();

        Animais animais = new Animais(id, nome, especie);
        System.out.println(
            "ID: " + animais.id + "\n"
            + "Nome: " + animais.nome + "\n"
            + "Espécie: " + animais.especie + "\n"
        );
    }

    public static void cadastrarJaula(Scanner scanner){
        System.out.println("Cadastro de Jaula");
        System.out.println("Digite o ID da Jaula: ");
        int id = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Tipo: ");
        String tipo = scanner.next();

        Jaula jaula = new Jaula(id, nome, tipo);
        System.out.println(
            "ID: " + jaula.id + "\n"
            +"Nome: " + jaula.nome + "\n"
            +"Tipo: " + jaula.tipo + "\n"
        );
    }

    public static void cadastrarAlimentacao(Scanner scanner){
        System.out.println("Cadastro de Alimentação");
        System.out.println("Digite o ID da Alimentação: "); 
        int id = scanner.nextInt();
        System.out.println("Digite a Data da Alimentação: ");
        String data = scanner.next();
        System.out.println("Digite a Descrição da Alimentação: ");
        String descricao = scanner.next();

        Alimentacao alimentacao = new Alimentacao(id, data, descricao);
            System.out.println(
                "ID: " + alimentacao.id + "\n"
                + "Data: " + alimentacao.data + "\n"
                + "Descrição: " + alimentacao.descricao + "\n"

            );

         
    }

    public static void cadastrarLimpeza(Scanner scanner){
        System.out.println("Cadastro da Limpeza");
        System.out.println("Digite o ID da Limpeza");
        int id = scanner.nextInt();
        System.out.println("Digite a Data da Limpeza: ");
        String data = scanner.next();
        System.out.println("Digite a Descrição da Limpeza: ");
        String descricao = scanner.next();

        Limpeza limpeza = new Limpeza(id, data, descricao);
        System.out.println(
            "ID: " + limpeza.id + "\n"
            + "Data: " + limpeza.data + "\n"
            + "Descrição: " + limpeza.descricao + "\n"
        );

        
    }
}
    

