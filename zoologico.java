import java.util.Scanner;

public class Zoologico{

    public static void main(String[]args){
        System.out.println("Zoológico");
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("=============================");
            System.out.println("1 - Cadastrar Animais: ");
            System.out.println("2 - Listar Animais: ");
            System.out.println("3 - Cadastrar Jaula: ");
            System.out.println("4 - Listar Jaula: ");
            System.out.println("5 - Cadastrar Alimentação: ");
            System.out.println("6 - Listar Alimentação: ");
            System.out.println("7 - Cadastrar Limpeza: ");
            System.out.println("8 - Listar Limpeza: ");
            System.out.println("0 - Sair");
            System.out.println("=============================");
            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    cadastrarAnimais(scanner);
                    break;
                case 2:
                    listarMamifero();
                    break;    
                case 3: 
                    cadastrarJaula(scanner);
                    break;
                case 4:
                    listarJaula();
                    break;    
                case 5: 
                    cadastrarAlimentacao(scanner);
                    break;
                case 6: 
                    listarAlimentacao();
                    break;    
                case 7: 
                    cadastrarLimpeza(scanner); 
                    break;
                case 8:
                    listarLimpeza();
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
        try{
        System.out.println("Cadastro de Mamifero");
        System.out.println("Digite o ID do Animal: ");
        int id = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Espécie: ");
        String especie = scanner.next();
        System.out.println("Digite a pelagem: ");
        String pelagem = scanner.next();

        new Mamifero(id, nome, especie, pelagem);
        }catch (Exception e ){
            System.out.println("Erro ao cadastrar o Animal");
        }
    }

    public static void listarMamifero(){
        for(Mamifero mamifero : Mamifero.mamiferos){
            System.out.println("Mamiferos");
            System.out.println(mamifero);
        }
    }

    public static void cadastrarJaula(Scanner scanner){
        try{
        System.out.println("Cadastro de Jaula");
        System.out.println("Digite o ID da Jaula: ");
        int id = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Tipo: ");
        String tipo = scanner.next();
        System.out.println("Digite o id da limpeza:");
        int idLimpeza = scanner.nextInt();
        Limpeza idLimpezaVerificada = Limpeza.verificaId(idLimpeza);


        Jaula jaula = new Jaula(idLimpeza, nome, tipo, idLimpezaVerificada);
        }catch (Exception e ){
            System.out.println("Erro ao cadastrar a Jaula");
        }
    }

    public static void listarJaula(){
        for(Jaula jaula : Jaula.jaulas){
            System.out.println("Jaula");
            System.out.println(
                "ID: " + jaula.id + "\n"
                + "Nome: " + jaula.nome + "\n"
                + "Tipo: " + jaula.tipo + "\n"
                + "Id da limpeza: " + jaula.getLimpeza()
            );
        }
    }

    public static void cadastrarAlimentacao(Scanner scanner){
        try{
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

        }catch (Exception e){
            System.out.println("Erro ao cadastrar a Alimentacao");
        }
    }

    public static void listarAlimentacao(){
        for(Alimentacao alimentacao : Alimentacao.alimentacao){
            System.out.println("Alimentação");
            System.out.println(
                "ID: " + alimentacao.id + "\n"
                + "Data: " + alimentacao.data + "\n"
                + "Descrição: " + alimentacao.descricao + "\n"
            );
        }
    }

    public static void cadastrarLimpeza(Scanner scanner){
        try{
        System.out.println("Cadastro da Limpeza");
        System.out.println("Digite o ID da Limpeza: ");
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

        }catch (Exception e ){
            System.out.println("Erro ao cadastrar a Limpeza");
    }
}

    public static void listarLimpeza(){
        for(Limpeza limpeza : Limpeza.limpeza){
            System.out.println("Limpeza");
            System.out.println(
                "ID: " + limpeza.id + "\n"
                + "Data: " + limpeza.data + "\n"
                + "Descrição: " + limpeza.descricao + "\n"
            );
        }    
    }
}