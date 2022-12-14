import java.util.ArrayList;

public class Ave extends Animal{
    
    private String penugem;

    public static ArrayList<Ave> aves = new ArrayList<Ave>();

    public Ave(
        int id, 
        String nome, 
        String especie, 
        String penugem
    ){
        super(id, nome, especie);
        this.penugem = penugem;

        aves.add(this);
    }

    public String getPenugem(){
        return penugem;
    }
    
    public void setPenugem(String penugem) {
        this.penugem = penugem;
    }
    
    public static void removeAve(int id) throws Exception{
        Ave ave = getAve(id);
        aves.remove(ave);
    }

    @Override 
    public String toString() {
        return "ID: " + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n"
        + "Espécie: " + super.getEspecie() + "\n"
        + "Penugem: " + this.getPenugem() + "\n";
    }        
}
