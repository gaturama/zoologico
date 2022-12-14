import java.util.Scanner;

public class zoologico{

    public static void main(String[]args){
        System.out.println("Zoológico");
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("=============================");
            System.out.println("1 - Cadastrar Mamifero: ");
            System.out.println("2 - Listar Mamifero: ");
            System.out.println("3 - Remover Mamifero: ");
            System.out.println("4 - Cadastrar Reptil: ");
            System.out.println("5 - Listar Reptil: ");
            System.out.println("6 - Remover Reptil: ");
            System.out.println("7 - Cadastrar Ave: ");
            System.out.println("8 - Listar Ave: ");
            System.out.println("9 - Remover Ave: ");
            System.out.println("10 - Cadastrar Jaula: ");
            System.out.println("11 - Listar Jaula: ");
            System.out.println("12 - Remover Jaula ");
            System.out.println("13 - Cadastrar Alimentação: ");
            System.out.println("14 - Listar Alimentação: ");
            System.out.println("15 - Remover Alimentação: ");
            System.out.println("16 - Cadastrar Limpeza: ");
            System.out.println("17 - Listar Limpeza: ");
            System.out.println("18 - Remover Limpeza: ");
            System.out.println("0 - Sair");
            System.out.println("=============================");
            System.out.println("Opção:");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    cadastrarMamifero(scanner);
                    break;
                case 2:
                    listarMamifero();
                    break;
                case 3: 
                    removerMamifero(scanner);
                    break;
                case 4:
                    cadastrarReptil(scanner);
                    break;    
                case 5:
                    listarReptil();
                    break;
                case 6:
                    removerReptil(scanner);
                    break;
                case 7: 
                    cadastrarAve(scanner);
                    break;    
                case 8: 
                    listarAve();
                    break;
                case 9: 
                    removerAve(scanner);
                    break;
                case 10: 
                    cadastrarJaula(scanner);
                    break;
                case 11:
                    listarJaula();
                    break;    
                case 12: 
                    removerJaula(scanner);
                    break;
                case 13: 
                    cadastrarAlimentacao(scanner);
                    break;
                case 14: 
                    listarAlimentacao();
                    break;
                case 15: 
                    removerAlimentacao(scanner);
                    break;
                case 16: 
                    cadastrarLimpeza(scanner); 
                    break;
                case 17:
                    listarLimpeza();
                    break;
                case 18:
                    removerLimpeza(scanner);
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

    public static void cadastrarMamifero(Scanner scanner){
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

    public static void removerMamifero (Scanner scanner) {
        System.out.println("Remover Mamifero");
        System.out.println("Informe a espécie: ");
        String especie = scanner.next();
        System.out.println("Digite o Id do Mamifero: ");
        int idMamifero = scanner.nextInt();
        try{
            Mamifero.removerMamifero(idMamifero);
        }catch (Exception e ){
            System.out.println(e.getMessage());
    }
    }

    public static void cadastrarReptil(Scanner scanner){
        try{
        System.out.println("Cadastro de Réptil");
        System.out.println("Digite o ID do Réptil: ");
        int id = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Espécie: ");
        String especie = scanner.next();
        System.out.println("Digite a escama: ");
        String escama = scanner.next();

        new Reptil(id, nome, especie, escama);
        }catch (Exception e ){
            System.out.println("Erro ao cadastrar o Reptil");
        }
    }
    public static void listarReptil(){
        for(Reptil reptil : Reptil.repteis){
            System.out.println("Reptil");
            System.out.println(reptil);
        }

    }
    public static void removerReptil (Scanner scanner) {
        System.out.println("Remover Reptil");
        System.out.println("Informe a espécie: ");
        String especie = scanner.next();
        System.out.println("Digite o Id do Mamifero: ");
        int idReptil = scanner.nextInt();
        try{
            Reptil.removerReptil(idReptil);
        }catch (Exception e ){
            System.out.println(e.getMessage());
    }
    }

    public static void cadastrarAve(Scanner scanner){
        try{
        System.out.println("Cadastro de Ave");
        System.out.println("Digite o ID do Ave: ");
        int id = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Espécie: ");
        String especie = scanner.next();
        System.out.println("Digite a penugem: ");
        String penugem = scanner.next();

        new Ave(id, nome, especie, penugem);
        }catch (Exception e ){
            System.out.println("Erro ao cadastrar o Ave");       
        }    
    }
        public static void listarAve(){
            for(Ave ave : Ave.aves){
                System.out.println("Ave");
                System.out.println(ave);
            }
        }

        public static void removerAve (Scanner scanner) {
            System.out.println("Remover Ave");
            System.out.println("Informe a espécie: ");
            String especie = scanner.next();
            System.out.println("Digite o Id do Mamifero: ");
            int idAve = scanner.nextInt();
            try{
                Ave.removerAve(idAve);
            }catch (Exception e ){
                System.out.println(e.getMessage());
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


        new Jaula(id, nome, tipo, idLimpezaVerificada);
        }catch (Exception e ){
            System.out.println("Erro ao cadastrar a Jaula");
        }
    }

    public static void listarJaula(){
        for(Jaula jaula : Jaula.jaulas){
            System.out.println("Jaula");
            System.out.println(jaula);
               
        }
    }
    public static void removerJaula(Scanner scanner) {
            System.out.println("Remover Jaula");
            System.out.println("Informe o nome: ");
            String nome = scanner.next();
            System.out.println("Digite o Id do Jaula: ");
            int idJaula = scanner.nextInt();
            try{
                Jaula.removerAve(idJaula);
            }catch (Exception e ){
                System.out.println(e.getMessage());
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

        new Alimentacao(id, data, descricao);
        }catch (Exception e){
            System.out.println("Erro ao cadastrar a Alimentacao");
        }
    }

    public static void listarAlimentacao(){
        for(Alimentacao alimentacao : Alimentacao.alimentacao){
            System.out.println("Alimentação");
            System.out.println(alimentacao);
        }
    }
    public static void removerAlimentacao (Scanner scanner) {
            System.out.println("Remover Alimentação");
            System.out.println("Informe a data: ");
            String especie = scanner.next();
            System.out.println("Digite o Id da Alimentação: ");
            int idAlimentacao = scanner.nextInt();
            try{
                Alimentacao.removerAlimentacao(idAlimentacao);
            }catch (Exception e ){
                System.out.println(e.getMessage());
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

       new Limpeza(id, data, descricao, null);
        }catch (Exception e ){
            System.out.println("Erro ao cadastrar a Limpeza");
    }
}

    public static void listarLimpeza(){
        for(Limpeza limpeza : Limpeza.limpeza){
            System.out.println("Limpeza");
            System.out.println(limpeza);
  
        }    
    }
    public static void removerLimpeza (Scanner scanner) {
            System.out.println("Remover Limpeza");
            System.out.println("Informe a data: ");
            String data = scanner.next();
            System.out.println("Digite o Id da limpeza: ");
            int idLimpeza = scanner.nextInt();
            try{
                Limpeza.removerLimpeza(idLimpeza);
            }catch (Exception e ){
                System.out.println(e.getMessage());
        }
        }
}
