module exerciciosfx {
	requires javafx.controls;
	requires javafx.fxml;
//	exports basico to javafx.graphics;
	
	opens basico;
	opens layout;
	opens fxml;
}