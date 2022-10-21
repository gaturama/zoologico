import java.util.ArrayList;

public class Limpeza{

    private int id;
    private String data;
    private String descricao;
    private Jaula jaula;
    private ArrayList<Jaula> jaulas = new ArrayList<Jaula>();

    public static ArrayList<Limpeza> limpeza = new ArrayList<>();
    
    public Limpeza(
        int id, 
        String data,
        String descricao,
        Jaula jaula
    ){
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.jaula = jaula;

        jaula.setLimpeza(this);

        limpeza.add(this);

    }
    @Override
    public String toString() {
        return "Id: " + id + "\n"
        +  "Data: " + data + "\n"
        + "Descrição: " + descricao + "\n"
        + "Jaula: " + jaula + "\n";
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
    public String getJaula(){
        return jaula.getNome();
    } 
    public void setJaula(Jaula jaula){
        this.jaulas.add(jaula);
    }

    public static Limpeza verificaId(int id) throws Exception{
        for (Limpeza limpeza : limpeza) {
            if (limpeza.id == id) {
                return limpeza;
            }
        }
        throw new Exception("Limpeza não encontrado");
    }
}