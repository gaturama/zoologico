import java.util.ArrayList;

public class Limpeza{

    public int id;
    public String data;
    public String descricao;

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