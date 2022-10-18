import java.util.ArrayList;

public class Alimentacao {
    
    public int id;
    public String data;
    public String descricao;

    public static ArrayList<Alimentacao> alimentacao = new ArrayList<>();

    public Alimentacao(
        int id,
        String data,
        String descricao
   ){
        this.id =id;
        this.data = data;
        this.descricao = descricao;

        alimentacao.add(this);
   }

   @Override
    public String toString() {
        return  "Data: " + this.data
        + "\nDescrição: " + this.descricao;
    }
}