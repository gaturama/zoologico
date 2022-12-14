import java.util.ArrayList;

public class Limpeza{

    private int id;
    private String data;
    private String descricao;
    private int idJaula;

    public static ArrayList<Limpeza> limpeza = new ArrayList<>();
    
    public Limpeza(
        int id, 
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
 
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
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

    public static Limpeza verificaId(int id) throws Exception{
        for (Limpeza limpeza : limpeza) {
            if (limpeza.id == id) {
                return limpeza;
            }
        }
        throw new Exception("Limpeza não encontrado");
    }
    
    public static removeLimpeza(int id) throws Exception{
        Limpeza limpeza = getLimpeza(id);
        limpezas.remove(limpeza);
    }
        
    @Override
    public String toString() {
        return "Id: " + id + "\n"
        +  "Data: " + data + "\n"
        + "Descrição: " + descricao + "\n"
        + "Jaula: " + this.getIdJaula + "\n";
    }
}
