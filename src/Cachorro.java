public class Cachorro extends Animal implements AnimalDeEstimacao {
    String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    @Override
    public void come() {
        System.out.println(nome + " está comendo ração.");
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
        System.out.println(nome + " está brincando com uma bola.");
    }
}
