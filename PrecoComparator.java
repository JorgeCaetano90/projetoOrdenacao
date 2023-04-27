package projetoAlysson;

import java.util.Comparator;

public class PrecoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
    	return Float.compare(p1.getPreco(), p2.getPreco());
    }
}
