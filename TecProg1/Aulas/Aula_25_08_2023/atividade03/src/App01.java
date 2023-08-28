public class App01 {
    public static void main(String[] args) {

        int[] elementos = new int[10];
        elementos[0] = 1;
        elementos[1] = 2;
        elementos[2] = 3;
        elementos[3] = 4;
        elementos[4] = 5;
        elementos[5] = 6;
        elementos[6] = 7;
        elementos[7] = 8;
        elementos[8] = 9;
        elementos[9] = 10;

        System.out.println("------------------------------------");
        System.out.print("Vetor elementos\nNúmeros: ");

        for(int i = 0; i < elementos.length; i++){
            System.out.print(elementos[i]+" ");
        }
        
        System.out.println("\n------------------------------------");

    }
}
