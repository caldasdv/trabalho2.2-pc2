public class CadastroAnimal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex");
        cachorro.pernas = 4;
        cachorro.come();
        cachorro.caminha();
        cachorro.brinca();
        System.out.println("Nome do cachorro: " + cachorro.getNome());


        Peixe peixe = new Peixe("Nemo");
        peixe.pernas = 0;
        peixe.come();
        peixe.caminha();
        peixe.brinca();
        System.out.println("Nome do peixe: " + peixe.getNome());
    }
}