public class TestePilha {
    public static void main(String[] args) {
        ClientePilha cliente1 = new ClientePilha();
        ClientePilha cliente2 = new ClientePilha();

        cliente1.nome = "João";
        cliente2.nome = "Maria";

        Pilha pilha = new Pilha();
        pilha.adicionar(cliente1);
        pilha.adicionar(cliente2);

        //pilha.imprimirEstatisticas();

        ClientePilha clientePilhaRetirado = pilha.retirar();
        System.out.println(clientePilhaRetirado.nome);



    }
}
