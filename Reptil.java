import java.util.ArrayList;

public class Reptil extends Animal{
    
   private String escama;
    
    public static ArrayList<Reptil> repteis = new ArrayList<Reptil>();
    
    public Reptil(int id, String nome, String especie, String escama) {
        super(id, nome, especie);
        this.setEscama(escama);
        
        repteis.add(this);
    }
    
    public String getEscama(){
        return escama;
    }
    public void setEscama(String escama) {
        this.escama = escama;
    }
    
    @Override
    public String toString(){
        return "ID: " + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n" 
        + "Espécie: " + super.getEspecie() + "\n"
        + "Escama: " + this.getEscama() + "\n";
    }
}    
