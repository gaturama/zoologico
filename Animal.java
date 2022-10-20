import java.util.ArrayList;

public abstract class Animal {
 
        private int id;
        private String nome;
        private String especie;
    
        public static ArrayList<Animal> animais = new ArrayList<>();
    
        public Animal(
            int id,
            String nome,
            String especie
        ){
            this.setId(id);
            this.setNome(nome);
            this.setEspecie(especie);   
        }

        
        protected void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }
        protected void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return nome;
        }
        protected void setEspecie(String especie) {
            this.especie = especie;
        }
        public String getEspecie() {
            return especie;
        }


    
        @Override
        public String toString(){
            return "Nome: " + this.nome
            + "\nEspecie: " + this.especie;
        }
    }
