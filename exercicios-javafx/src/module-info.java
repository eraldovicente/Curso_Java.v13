module exerciciosfx {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.controlsfx.controls;
//	exports basico to javafx.graphics;
	
	opens basico;
	opens layout;
	opens fxml;
}