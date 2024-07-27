public class Peixe extends Animal implements AnimalDeEstimacao {
    String nome;

    public Peixe(String nome) {
        this.nome = nome;
    }

    @Override
    public void come() {
        System.out.println(nome + " está comendo flocos.");
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
        System.out.println(nome + " está nadando no aquário.");
    }
}