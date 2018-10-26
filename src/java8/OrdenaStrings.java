package java8;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		//List<String> palavras = Arrays.asList("", "", ...)
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		//Collections.sort(palavras, comparador);
		//Collections.sort(palavras);

//		Trabalhando com classe
//		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		
//		Trabalhando com classe anonima		
//		palavras.sort(new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				if(s1.length() < s2.length()) 
//		            return -1;
//		        if(s1.length() > s2.length()) 
//		            return 1;
//		        return 0;
//			}
//		});
		
//		Trabalhando com lambda
//		palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
//		palavras.sort((s1, s2) -> s1.length() - s2.length());
//		palavras.sort(Comparator.comparing(s -> s.length()));
		
//		Trabalhando com Method reference
		palavras.sort(comparing(String::length));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(palavras);
		
//		Trabalhando com classe
//		Consumer<String> consumidor = new ConsumidorDeString();
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
//		Trabalhando com classe anonima
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});
		
//		Trabalhando com lambda
//		palavras.forEach(s -> System.out.println(s));
		
//		Trabalhando com Method reference		
		palavras.forEach(System.out::println);
		
		
	}
	
}