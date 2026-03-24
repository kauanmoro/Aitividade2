public class PilhaSimples {
    String [] pilha;

    public PilhaSimples(int tamanho){
        if(tamanho < 0){
            System.out.println("TAMANHO INVÁLIDO, insira um número > 0");
        }
        pilha = new String[tamanho];
    }

    public boolean estaCheia(){
        for(int i = 0; i < pilha.length; i++){
            if(pilha[i] == null){
                return false;
            }
        }
        return true;
    }

    public boolean estaVazia(){
        for(int i = 0; i < pilha.length; i++){
            if(pilha[i] != null){
                return false;
            }
        }
        return true;
    }

    public void exibir(){
        if(estaVazia()){
            System.out.println("A pilha está vazia");
            return;
        }
        for(int i = 0; i < pilha.length; i++){
            System.out.println(pilha[i]);
        }
    }

    public void empilhar(String elemento){
        if(estaCheia()){
            System.out.println("A pilha está cheia");
        } else {
            for (int i = 0; i < pilha.length; i++) {
                if(pilha[i] == null){
                    pilha[i] = elemento;
                    return;
                }
            }
        }
    }

    public void desempilhar(){
        if(estaVazia()){
            System.out.println("A pilha está vazia");
        } else {
            for(int i = pilha.length - 1; i >= 0; i--){
                if(pilha[i] != null){
                    pilha[i] = null;
                    return;
                }
            }
        }
    }
}
