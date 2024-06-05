package projetoJavaCurso;

public class HelloWorld {

	public void encontrarNumeroNoVetor(int num) {
		int vetor[] = { 1, 2, 3, 3, 4, 5, 6, 7, 3,7,7,9,0,4};
		int encontrado = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (num == vetor[i]) {
				encontrado++;
			}
			
		}
		
		if (encontrado==0) {
			System.out.println("Número selecionado não está no vetor");
		}else {
			System.out.println("foram encontrados : " + encontrado + " ocorrências desse numero no vetor");
		}
		
	}

	public static void main(String[] args) {

		HelloWorld hello = new HelloWorld();

		hello.encontrarNumeroNoVetor(10);
	}
}
