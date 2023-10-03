public class Main {
    
    public static void main(String[] args) throws Exception {

        ListaLigada lista1 = new ListaLigada();

        lista1.adicionaInicio(90);
        lista1.adicionaInicio(10);

        try{
            int valorRemovido = lista1.removeInicio();
            System.out.println("Elemento removido: " + valorRemovido);
            System.out.println("Lista Ligada: " + lista1.toString());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
