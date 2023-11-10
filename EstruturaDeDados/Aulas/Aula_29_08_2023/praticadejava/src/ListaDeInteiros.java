public class ListaDeInteiros {
    public static void main(String[] args) {

        ListaDeInteiros lista1 = new ListaDeInteiros();

        private int dados[];
        private int tamanho;
 
        public ListaDeInteiros(int capMax){
            dados = new int[capMax];

            /*O Java pré-inicializa os atributos, do tipo inteiro com o valor 0 e 
            * do tipo real com o valor 0.0.
            * Portanto, o tamanho recebeu o valor 0.
            * Os atributos com tipo abstrato de dados, são inicializados com null.
            */
        }

        // Inclua este método na classe ListaDeInteiros

        public void adicionaFinal (int e) throws Exception{
            if (dados.length != tamanho) {
                // Não está cheia
                dados[tamanho] = e;
                tamanho = tamanho + 1;
            } 
            else {
                // Está cheia
                throw new Exception("ERRO! Lista Cheia");
            }
        }

    }
}
