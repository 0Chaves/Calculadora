package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	Integer valor1;
	Integer valor2;
	@Override
	public void start(Stage primaryStage) {
		try {
			
			TextField visor = new TextField("");
			Button num1 = new Button("1");
			Button num2 = new Button("2");
			Button num3 = new Button("3");
			Button num4 = new Button("4");
			Button num5 = new Button("5");
			Button num6 = new Button("6");
			Button num7 = new Button("7");
			Button num8 = new Button("8");
			Button num9 = new Button("9");
			Button num0 = new Button("0");
			Button C = new Button("C");
			Button plus = new Button("+");
			Button equals = new Button("=");
			
			
			//Funcionalidade dos botoes
			C.setOnAction(e ->{
				visor.setText("");
				valor1 = 0;
				valor2 = 0;
			});
			
			num1.setOnAction(e->{
				visor.setText(visor.getText()+num1.getText());
			});
			num2.setOnAction(e->{
				visor.setText(visor.getText()+num2.getText());
			});
			num3.setOnAction(e->{
				visor.setText(visor.getText()+num3.getText());
			});
			num4.setOnAction(e->{
				visor.setText(visor.getText()+num4.getText());
			});
			num5.setOnAction(e->{
				visor.setText(visor.getText()+num5.getText());
			});
			num6.setOnAction(e->{
				visor.setText(visor.getText()+num6.getText());
			});
			num7.setOnAction(e->{
				visor.setText(visor.getText()+num7.getText());
			});
			num8.setOnAction(e->{
				visor.setText(visor.getText()+num8.getText());
			});
			num9.setOnAction(e->{
				visor.setText(visor.getText()+num9.getText());
			});
			num0.setOnAction(e->{
				visor.setText(visor.getText()+num0.getText());
			});
			
			plus.setOnAction(e->{
				valor1 = Integer.parseInt(visor.getText());
				visor.setText("");
			});
			equals.setOnAction(e->{
				valor2 = Integer.parseInt(visor.getText());
				Integer result = valor1 + valor2;
				visor.setText(result.toString());
			});
			
			visor.setEditable(false);
			visor.setMaxWidth(200);
			
			//Criação de panes
			BorderPane root = new BorderPane();
			VBox numeros = new VBox();
			HBox linha1 = new HBox();
			HBox linha2 = new HBox();
			HBox linha3 = new HBox();
			HBox linha4 = new HBox();
			
			root.setCenter(numeros);
			root.setTop(visor);
			//Adicionar botoes ao box
			
			numeros.getChildren().addAll(linha1, linha2, linha3, linha4);
			linha1.getChildren().addAll(num1,num2,num3);
			linha2.getChildren().addAll(num4,num5,num6);
			linha3.getChildren().addAll(num7,num8,num9);
			linha4.getChildren().addAll(C,num0, plus, equals);
			
			
			//Cria e mostra a cena
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}