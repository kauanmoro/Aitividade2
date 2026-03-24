public class MainDinamica {
    public static void main(String [] args){
        PilhaDinamica pilhaDinamica = new PilhaDinamica();
        pilhaDinamica.empilhar("teste1");
        pilhaDinamica.empilhar("teste2");
        pilhaDinamica.empilhar("teste3");
        pilhaDinamica.empilhar("teste4");
        pilhaDinamica.exibir();
        System.out.println("Removendo");
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibir();
    }
}
