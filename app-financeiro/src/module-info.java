module app.financeiro {
	
	requires java.base; // Por padr�o
//	requires app.calculo;
	
	requires app.api;
	uses br.com.cod3r.app.Calculadora;
}