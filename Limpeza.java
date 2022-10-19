import java.util.ArrayList;

public class Limpeza{

    private int id;
    private String data;
    private String descricao;

    public static ArrayList<Limpeza> limpeza = new ArrayList<>();
    
    public Limpeza(
        int id, 
        String data,
        String descricao
    ){
        this.id = id;
        this.data = data;
        this.descricao = descricao;

        limpeza.add(this);

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