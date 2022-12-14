import java.util.ArrayList;

public class Limpeza{

    private int idLimpeza;
    private String data;
    private String descricao;
    private int idJaula;

    public static ArrayList<Limpeza> limpeza = new ArrayList<>();
    
    public Limpeza(
        int idLimpeza, 
        String data,
        String descricao,
        int idJaula
    ){
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.idJaula = idJaula;

        limpeza.add(this);

    }
 
    public int getIdLimpeza() {
        return this.idLimpeza;
    }
    public void setIdLimpeza(int idLimpeza) {
        this.idLimpeza = idLimpeza;
    }
    public String getData() {
        return this.data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public String getIdJaula(){
        return idJaula;
    } 
    public void setJaula(int idJaula){
        this.idJaula = idJaula
    }

    public static Limpeza verificaId(int idLimpeza) throws Exception{
        for (Limpeza limpeza : limpeza) {
            if (limpeza.idL == idLimpeza) {
                return limpeza;
            }
        }
        throw new Exception("Limpeza não encontrado");
    }
    
    public static removeLimpeza(int idLimpeza) throws Exception{
        Limpeza limpeza = getLimpeza(idLimpeza);
        limpezas.remove(limpeza);
    }
        
    @Override
    public String toString() {
        return "Id: " + idLimpeza + "\n"
        +  "Data: " + data + "\n"
        + "Descrição: " + descricao + "\n"
        + "Jaula: " + this.getIdJaula + "\n";
    }
}
