import java.util.ArrayList;

public class Mamifero extends Animal{
    
    private String pelagem;

    public static ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();

    public Mamifero(
        int id, 
        String nome, 
        String especie, 
        String pelagem
    ){
        super(id, nome, especie);
        this.setPelagem(pelagem);

        mamiferos.add(this);
    }

    public String getPelagem() {
        return pelagem;
    }
    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    public static void removeMamifero(int id) throws Exception{
        Mamifero mamifero = getMamifero(id);
        mamiferos.remove(mamifero);
    }


    @Override
    public String toString() {
        return "ID: " + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n"
        + "Espécie: " + super.getEspecie() + "\n"
        + "Pelagem: " + this.getPelagem() + "\n";
    }
}
