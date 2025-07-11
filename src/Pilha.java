import java.util.Arrays;

public class Pilha {

    static final int CAPACIDADE_INICIAL_PADRAO = 4;

    ClientePilha[] elementos = new ClientePilha[CAPACIDADE_INICIAL_PADRAO];
    int tamanho =0;

    void adicionar(ClientePilha elemento){
        garantirCapacidade();
        elementos[tamanho++] = elemento;
    }

    ClientePilha retirar(){
        if (tamanho == 0){
            return null;
        }

        ClientePilha elemento = elementos[--tamanho];
        elementos[tamanho] = null;
        return elemento;

        //return elementos[--tamanho];
    }

    void imprimirEstatisticas(){
        System.out.printf("Tamanho atual: %d%n", tamanho);
        System.out.printf("Capacidade: %d%n", elementos.length);
    }

    private void garantirCapacidade(){
        if(elementos.length == tamanho){
            elementos = Arrays.copyOf(elementos, tamanho +10);
        }
    }
}
