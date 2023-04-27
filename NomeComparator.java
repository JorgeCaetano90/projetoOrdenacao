package projetoAlysson;

import java.util.Comparator;

public class NomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        String nomeP1 = p1.getNome();
        String nomeP2 = p2.getNome();
        return nomeP1.compareTo(nomeP2);
    }
}
