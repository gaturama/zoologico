import java.util.ArrayList;

public class Alimentacao {
    
    private int id;
    private String data;
    private String descricao;

    public static ArrayList<Alimentacao> alimentacao = new ArrayList<>();

    public Alimentacao(
        int id,
        String data,
        String descricao
   ){
        this.id = id;
        this.data = data;
        this.descricao = descricao;

        alimentacao.add(this);
   }

   @Override
    public String toString() {
        return  "Data: " + this.data
        + "\nDescrição: " + this.descricao;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}