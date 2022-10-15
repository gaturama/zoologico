import java.util.ArrayList;

public class Animais {
 
        public int id;
        public String nome;
        public String especie;
    
        public static ArrayList<Animais> animais = new ArrayList<>();
    
        protected Animais(
            int id,
            String nome,
            String especie
        ){
            this.id = id;
            this.nome = nome;
            this.especie = especie;
            
        }
    
        @Override
        public String toString(){
            return "Nome: " + this.nome
            + "\nEspecie: " + this.especie;
        }
    }
