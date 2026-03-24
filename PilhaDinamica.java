public class PilhaDinamica {
    No inicio;

    public PilhaDinamica(){
        System.out.println("Pilha dinamica criada!!");
        inicio = new No(null);
    }
    public void empilhar(String elemento){
        if(estaVazio()){
            inicio.setConteudo(elemento);
        } else {
            No aux = inicio;
            No novoNo = new No(elemento);
            while(aux.getProx() != null){
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    public boolean estaVazio(){
        if(inicio.getConteudo() == null){
            return true;
        }
        return false;
    }

    public void exibir(){
        if(estaVazio()){
            System.out.println("A lista está vazia");
        } else {
            No aux = inicio;
            while(aux != null){
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    public void desempilhar(){
        if(estaVazio()){
            System.out.println("Não há elementos a serem desempilhados");
        } else {
            if(inicio.getProx() == null){
                inicio.setConteudo(null);
            } else {
                No aux = inicio;
                while(aux.getProx().getProx() != null){
                    aux = aux.getProx();
                }
                aux.setProx(null);
            }
        }
    }
}
