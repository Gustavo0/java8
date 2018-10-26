package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TestaCurso{
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
//		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.map(Curso::getAlunos)
//			.forEach(System.out::println);
		
		int sum = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos)
			.sum();
		
		System.out.println(sum);
		
		OptionalDouble average = cursos.stream()
									    .mapToInt(c -> c.getAlunos())
									    .average();
		System.out.println(average);
		
		List<Curso> cursosFiltrados = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList());
		
		cursosFiltrados.forEach(c -> System.out.println(c.getNome()));
		
		//Strem não tem efeito sobre a collection original
//		cursos.forEach(c -> System.out.println(c.getNome()));
	}
}
