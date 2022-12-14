import java.util.ArrayList;

public class Jaula {
    
    private int idJaula;
    private String nome;
    private String tipo;

    private int idLimpeza;

    public static ArrayList<Jaula> jaulas = new ArrayList<Jaula>();

    public Jaula(
        int idJaula,
        String nome,
        String tipo,
        int idLimpeza
    ){
        this.idJaula =idJaula;
        this.nome = nome;
        this.tipo = tipo;
        this.idLimpeza = idLimpeza;
    
        jaulas.add(this);

    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLimpeza() {
        return idLimpeza;
    }

    public void setLimpeza(int idLmpeza) {
        this.idLimpeza = idLimpeza
    }
      @Override 
    public String toString() {
        return "\nId: " + this.idJaula
        + "Nome: " + this.nome
        + "\nTipo: " + this.tipo
        + "\nLimpeza: " + this.idLimpeza;
        
    }
}
    

