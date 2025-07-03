public class Teste2 {
    public static void main(String[] args) {
        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria(){
        System.out.printf("Maximo: %s%n", converterEmMegabytes(Runtime.getRuntime().maxMemory()));


    }

    static String converterEmMegabytes(long bytes){
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }

}
