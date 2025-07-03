public class Teste2 {
    public static void main(String[] args) {
        imprimirUsoMemoria();

        byte[] x = new byte[500 * 1024 * 1024];

        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria(){
        System.out.printf("Maximo: %s%n", converterEmMegabytes(Runtime.getRuntime().maxMemory()));

        System.out.printf("Total empenhada: %s%n", converterEmMegabytes(Runtime.getRuntime().totalMemory()));

        System.out.printf("Disponivel: %s%n", converterEmMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.printf("Memoria usada: %s%n", converterEmMegabytes(memoriaUsada));

        System.out.println("----------------");
    }

    static String converterEmMegabytes(long bytes){
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }

}
