public class App02 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;
        a[9] = 10;

        b[0] = a[0] * 2;
        b[1] = a[1] * 2;
        b[2] = a[2] * 2;
        b[3] = a[3] * 2;
        b[4] = a[4] * 2;
        b[5] = a[5] * 2;
        b[6] = a[6] * 2;
        b[7] = a[7] * 2;
        b[8] = a[8] * 2;
        b[9] = a[9] * 2;

        System.out.println("-----------------------------------------");
        System.out.print("Vetor A\nNúmeros: ");

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("\n-----------------------------------------");
        System.out.print("Vetor B\nNúmeros: ");

        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]+" ");
        }
        
        System.out.println("\n-----------------------------------------");

    }
}
