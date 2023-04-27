package projetoAlysson;

import java.util.Comparator;

public class QuantComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
    	return Integer.compare(p1.getQuantidade_estoque(), p2.getQuantidade_estoque());
    }
}
