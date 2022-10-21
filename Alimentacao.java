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

   public static void removeAlimentacao(int id) throws Exception {
    alimentacao.remove(id);

   }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    
    
    @Override
    public String toString() {
        return "Id: " + id + "\n"
        + "Data: " + data + "\n"
        + "\nDescrição: " + descricao + "\n";
    }
}