package arvore;
public class Elemento {
    private Elemento r, dir, esq;
    private int n;

    public Elemento(int n) {
        this.n = n;
    }

    public int GetN() {
        return n;
    }

    public Elemento setN (int n) {
        this.n = n;
        return null;
    }

    public Elemento getR() {
        return r;
    }

    public Elemento setR (Elemento r) {
        this.r = r;
        return null;
    }

    public Elemento getDir() {
        return dir;
    }

    public Elemento setDir (Elemento dir) {
        this.dir = dir;
        return null;
    }

    public Elemento getEsq() {
        return esq;
    }

    public Elemento setEsq (Elemento esq) {
        this.esq = esq;
        return null;
    }

}
