public class Formiga extends Animal implements AnimalDeEstimacao{
    String nome;
    public Formiga(String nome) {
        this.nome = nome;
    }
    @Override
    public void come(){
        System.out.println(nome + " está comendo");
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void brinca() {

    }
}
