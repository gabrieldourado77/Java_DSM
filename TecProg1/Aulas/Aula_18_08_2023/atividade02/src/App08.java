public class App08 {
    public static void main(String[] args) {

        int somaInteiros = 0;
        
        System.out.println("----------------------------------------------");
        System.out.println("Soma dos 100 primeiros números inteiros");
        System.out.println("----------------------------------------------");

        for(int i = 1; i <= 100; i++){
            somaInteiros += i;
        }

        System.out.println("Resultado: "+somaInteiros);
        System.out.println("----------------------------------------------");

    }
}
