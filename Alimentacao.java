import java.util.ArrayList;

public class Alimentacao {
    
    private int idAlimentacao;
    private String data;
    private String descricao;

    public static ArrayList<Alimentacao> alimentacoes = new ArrayList<>();

    public Alimentacao(
        int idAlimentacao,
        String data,
        String descricao
   ){
        this.idAlimentacao = idAlimentacao;
        this.data = data;
        this.descricao = descricao;

        alimentacoes.add(this);
   }
    public int getIdAlimentacao(){
        return idAlimentacao;
    }
    public void setId(int idAlimentacao){
        this.idAlimentacao = idAlimentacao;
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
    
    public static void removeAlimentacao(int idAlimentacao) throws Exception{
        Alimentacao alimentacao = getAlimentacao(idAlimentacao);
        alimentacao.remove(alimentacao);
   }

    
    @Override
    public String toString() {
        return "Id: " + idAlimentacao + "\n"
        + "Data: " + data + "\n"
        + "Descrição: " + descricao + "\n";
    }
}
