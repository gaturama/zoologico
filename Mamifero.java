import java.util.ArrayList;

public class Mamifero extends Animal{
    
    private String pelagem;

    public static ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();

    public Mamifero(int id, String nome, String especie, String pelagem) {
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

    @Override
    public String toString() {
        return "ID: " + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n"
        + "Espécie: " + super.getEspecie() + "\n"
        + "Pelagem: " + this.getPelagem() + "\n";
    }
}
