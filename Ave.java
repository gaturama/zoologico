import java.util.ArrayList;

public class Ave extends Animal{
    
    private String penugem;

    public static ArrayList<Ave> aves = new ArrayList<Ave>();

    public Ave(int id, String nome, String especie, String penugem){
        super(id, nome, especie);
        this.penugem = penugem;

        aves.add(this);
    }

    p
}
