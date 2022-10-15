public class alimentacao {
    
    public int id;
    public String data;
    public String descricao;

    public alimentacao(
        int id,
        String data,
        String descricao
   ){
        this.id =id;
        this.data = data;
        this.descricao = descricao;

   }

   @Override
    public String toString() {
        return  "Data: " + this.data
        + "\nDescrição: " + this.descricao;
    }
}
