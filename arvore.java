package arvore;

public class Arvore {
    private Elemento raiz, atual;

    public Elemento getRaiz() {
        return raiz;
    }

    public void inserir (int n) {
        if(raiz==null) {
            raiz = new Elemento(n);
        } else {
            atual = new Elemento(n);
            inserir(atual,raiz);

        }
    }

    public void inserir(Elemento atual, Elemento e) {
        if(atual.GetN() >=e.GetN()) {
            if (e.getDir() == null) {
                e.setDir(atual);
                atual.setR(e);
            } else {
                inserir(atual, e.getDir());
            }
        } else {
            if (e.getEsq() == null) {
                e.setEsq(atual);
                atual.setR(e);
            } else {
                inserir(atual, e.getEsq());
            }
        }
    }

    public void preOrdem(Elemento e) {
        if (e != null) {
            System.out.println(e.GetN() + ""); // operation root
            preOrdem(e.getEsq());
            preOrdem(e.getDir()); 
        }
    }
}
