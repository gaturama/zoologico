import java.util.ArrayList;

public class Jaula {
    
    private int id;
    private String nome;
    private String tipo;

    private int idLimpeza;
    private Limpeza limpeza;

    public static ArrayList<Jaula> jaulas = new ArrayList<Jaula>();

    public Jaula(
        int id,
        String nome,
        String tipo,
        Limpeza limpeza
    ){
        this.id =id;
        this.nome = nome;
        this.tipo = tipo;
        this.limpeza = limpeza;
        this.idLimpeza = limpeza.id;
    
        jaulas.add(this);

    }

    @Override 
    public String toString() {
        return "\nId: " + this.idLimpeza
        + "Nome: " + this.nome
        + "\nTipo: " + this.tipo
        + "\nLimpeza: " + this.idLimpeza;
        
    }

    public int getLimpeza() {
        return idLimpeza;
    }

    public void setLimpeza(int idLimpeza) {
        this.idLimpeza = idLimpeza;
    }
}
    

