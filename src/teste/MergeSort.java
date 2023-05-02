package teste;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		
		List<String> livros = new ArrayList<String>();
		livros.add("ccc");
		livros.add("bbb");
		livros.add("aaa");
		livros.add("xxx");
		livros.add("ddd");
		livros.add("zzz");
		livros.add("jjj");
		livros.add("mmm");

		System.out.println(mergeSort(livros));
		
	}
	
	public static List<String> mergeSort(List<String> array) {

		  if(array.size() > 1) {
		    int meio = array.size() / 2;
		    List<String> parte1 = mergeSort(array.subList(0, meio));
		    List<String> parte2 = mergeSort(array.subList(meio, array.size()));
		    array = ordena(parte1, parte2);
		  }

		  return array;
		}
	
	public static List<String> ordena(List<String> parte1, List<String> parte2) {
		  int posicaoAtualParte1 = 0;
		  int posicaoAtualParte2 = 0;
		  List<String> resultado = new ArrayList<String>();

		  while (posicaoAtualParte1 < parte1.size() && posicaoAtualParte2 < parte2.size()) {
		    String produtoAtualParte1 = (String) parte1.get(posicaoAtualParte1);
		    String produtoAtualParte2 = (String) parte2.get(posicaoAtualParte2);

		    if (produtoAtualParte1.compareTo(produtoAtualParte2) < 0) {
		      resultado.add(produtoAtualParte1);
		      posicaoAtualParte1++;
		    } else {
		      resultado.add(produtoAtualParte2);
		      posicaoAtualParte2++;
		    }
		  }
		  
		  resultado.add(posicaoAtualParte1 < parte1.size()
				    ? parte1.get(posicaoAtualParte1)
				    : parte2.get(posicaoAtualParte2));

		  return resultado;
		}

}
