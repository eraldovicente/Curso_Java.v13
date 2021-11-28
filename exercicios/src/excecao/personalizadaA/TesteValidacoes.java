package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("", -7);		
			Validar.aluno(aluno);
		} catch (StringVaziaException 
				| NumeroForaDoIntervaloException 
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim S2");
	}
}
