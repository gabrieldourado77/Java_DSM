public class App09 {
    public static void main(String[] args) {

        float grausFah = 0;
        
        System.out.println("---------------------------------------------------");
        System.out.println("Conversão de Graus Celsius para Fahrenheit");
        System.out.println("---------------------------------------------------");

        for(int grausCelsius = 10; grausCelsius <= 100; grausCelsius += 10){
            grausFah = grausCelsius * 1.8f + 32;
            System.out.println(grausCelsius + " graus Celsius = " + grausFah + " graus Fahrenheit");
        }

        System.out.println("---------------------------------------------------");

    }
}
