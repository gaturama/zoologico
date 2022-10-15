import java.util.ArrayList;

public class Jaula {
    
    public int id;
    public String nome;
    public String tipo;

    public static ArrayList<Jaula> jaulas = new ArrayList<Jaula>();

    public Jaula(
        int id,
        String nome,
        String tipo
    ){
        this.id =id;
        this.nome = nome;
        this.tipo = tipo;
    
        jaulas.add(this);

    }

    @Override 
    public String toString() {
        return "Nome: " + this.nome
        + "\nTipo: " + this.tipo;
    }
}
    

