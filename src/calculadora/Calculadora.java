package calculadora;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Calculadora extends Application {

	@Override
    public void start(Stage stage) throws Exception {
		
		
        TextField textfield = new TextField ();
        Button um =new Button("1");
        Button dois =new Button("2");
        Button tres =new Button("3");
        Button quatro =new Button("4");
        Button cinco =new Button("5");
        Button seis =new Button("6");
        Button sete =new Button("7");
        Button oito =new Button("8");
        Button nove =new Button("9");
        Button zero =new Button("0");
        Button ce =new Button("CE");
        Button mais =new Button("+");
        Button menos =new Button("-");
        Button mult =new Button("*");
        Button ponto =new Button(".");
        Button igual =new Button("=");
        Button barra =new Button("/");
        
        GridPane pane = new GridPane();
        //ajustando espaçamento vertical e horizontal dos botões
        pane.setVgap(2);
        pane.setHgap(2);
        pane.setPadding(new Insets(6));
        Scene scene = new Scene (pane, 150,160);
       
        // ajustando espaçamento embaixo do textfield
        pane.add(textfield,0, 0, 4, 1); // Coluna 0, Linha 0, 4 colunas de largura
        pane.add(ce,4, 0); // Coluna 4, Linha 0
        pane.addRow(4, um, dois, tres, mais);
        pane.addRow(5, quatro, cinco, seis, menos);   
        pane.addRow(6, sete, oito, nove, mult);
        pane.addRow(7, ponto, zero,igual , barra); 
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
	}
	
	
	
	 public static void main(String[] args) {
	       launch(args);
	    }
}
