package excecao.personalizadaB;

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
		
		try {
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			e.printStackTrace();
		} catch (NumeroForaDoIntervaloException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim S2");
	}
}
