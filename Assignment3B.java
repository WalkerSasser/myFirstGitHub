import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.Label;


public class Assignment3B extends Application {
	
   @Override
   public void start(Stage primaryStage) {
   	
      primaryStage.setTitle("Calculator");
   	
      GridPane grid = new GridPane();
      grid.setPadding(new Insets(0,0,0,5));
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setAlignment(Pos.CENTER);
   	
      Scene myScene = new Scene(grid, 300, 200 );  
   	
      Button one = new Button("1");
      grid.add(one, 1, 1, 1, 1);
   	
      Button two = new Button("2");
      grid.add(two, 1, 2, 1, 1);
   	
      Button three = new Button("3");
      grid.add(three, 1, 3, 1, 1);
   	
      Button four = new Button("4");
      grid.add(four, 2, 1, 1, 1);
   	
      Button five = new Button("5");
      grid.add(five, 2, 2, 1, 1);
   	
      Button six = new Button("6");
      grid.add(six, 2, 3, 1, 1);
   	
      Button seven = new Button("7");
      grid.add(seven, 3, 1, 1, 1);
   	
      Button eight = new Button ("8");
      grid.add(eight, 3, 2, 1, 1);
   	
      Button nine = new Button ("9");
      grid.add(nine, 3, 3, 1, 1);
      
      Button zero = new Button ("0");
      grid.add(zero, 3, 4, 1, 1);
      
      Button multiply = new Button("*");
      grid.add(multiply, 4, 1, 1, 1);
      
      Button add = new Button("+");
      grid.add(add, 4, 2, 1, 1);
      
      Button divide = new Button("/");
      grid.add(divide, 4, 3, 1, 1);
      
      Button subtract = new Button("-");
      grid.add(subtract, 4, 4, 1, 1);
      
      Button equals = new Button("=");
      grid.add(equals, 2, 4, 1, 1);
     // equalsHandler handler = new equalsHandler(equals);
      
      Button reset = new Button("C");
      grid.add(reset, 1, 4, 1, 1);
      
      TextField display = new TextField();
      display.setEditable(false);
    
     grid.add(display, 0, 6, 1, 5); 
     
   	
      
      
      one.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "1";
            display.setText(input);      
         
         });
         
      two.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "2";
            display.setText(input);   
            
         });
         
      three.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "3";
            display.setText(input);      
            
         });
         
      four.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "4";
            display.setText(input);      
            
         });
         
      five.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "5";
            display.setText(input);      
            
         });
         
      six.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "6";
            display.setText(input);      
            
         });
         
      seven.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "7";
            display.setText(input);      
            
         });
         
      eight.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "8";
            display.setText(input);      
            
         });
         
      nine.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "9";
            display.setText(input);      
            
         });
         
         zero.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "0";
            display.setText(input);      
            
         });
         
               
      multiply.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "*";
            display.setText(input);      
            
         });
         
      add.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "+";
            display.setText(input);      
            
         });
         
      subtract.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "-";
            display.setText(input);      
            
         });
         
      divide.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + "/";
            display.setText(input);      
            
         });
         
      multiply.setOnAction(
         e -> {
         
            String input = display.getText();
            input = input + " * ";
            display.setText(input);      
            
         });
         
          reset.setOnAction(
         e -> {
            String input = "";
            display.setText(input);      
            
         });
         
      equals.setOnAction(
         e -> {
         
         
         
            String input = display.getText(); 
            display.setText(input);  
            String value1 = "";
            String value2 = "";
            boolean secondValue = false;
            int operator = 0;
         
            for(int x = 0; x < input.length(); x++) {
            
               if (input.charAt(x) == '1' || input.charAt(x) == '2' ||input.charAt(x) == '3' || input.charAt(x) == '4' 
               ||input.charAt(x) == '5' ||input.charAt(x) == '6' ||input.charAt(x) == '7' ||     
               input.charAt(x) == '8' || input.charAt(x) == '9'){
               
                  if(secondValue != true)
                     value1 = value1 + input.charAt(x);
                  else
                     value2 = value2 + input.charAt(x);
               
               }
               
               else if (input.charAt(x) == '*' || input.charAt(x) == '/' ||input.charAt(x) == '-' || input.charAt(x) == '+') {
               
                  if (input.charAt(x) == '*')
                     operator = 0;
                  else if (input.charAt(x) == '/')
                     operator = 1;
                  else if (input.charAt(x) == '-')
                     operator = 2;
                  else
                     operator = 3;
               
                  secondValue = true;
               
               }
            
            
            }
         
            double val1 = Double.parseDouble(value1);
            double val2 = Double.parseDouble(value2);
         
         
         
            switch (operator) {
            
               case 0:
                  display.setText("" + (val1 * val2));
                  break;
            
               case 1:
                  display.setText("" + (val1 / val2));
                  break;
            
               case 2: 
                  display.setText("" + (val1 - val2));
                  break;
            
               case 3:
                  display.setText("" + (val1 + val2));
                  break;
            
               default:
                  display.setText("The program has failed");
            
            }
         
            
            
         });
         
      
         
      primaryStage.setScene(myScene);
      primaryStage.show();
   	
   	
   }
	
   /*
     class equalsHandler implements EventHandler<ActionEvent>{
         
         
            String input = display.getText(); 
            display.setText(input);  
            String value1 = "";
            String value2 = "";
            boolean secondValue = false;
            int operator = 0;
         
            for(int x = 0; x < input.length(); x++) {
            
               if (input.charAt(x) == 1 || input.charAt(x) == 2 ||input.charAt(x) == 3 || input.charAt(x) == 4 
               ||input.charAt(x) == 5 ||input.charAt(x) == 6 ||input.charAt(x) == 7 ||     
               input.charAt(x) == 8 || input.charAt(x) == 9){
               
                  if(secondValue != true)
                     value1 = value1 + input.charAt(x);
                  else
                     value2 = value2 + input.charAt(x);
               
               }
               
               else if (input.charAt(x) == '*' || input.charAt(x) == '/' ||input.charAt(x) == '-' || input.charAt(x) == '+') {
               
                  if (input.charAt(x) == '*')
                     operator = 0;
                  else if (input.charAt(x) == '/')
                     operator = 1;
                  else if (input.charAt(x) == '-')
                     operator = 2;
                  else
                     operator = 3;
               
                  secondValue = true;
               
               }
            
            
            }
         
            double val1 = Double.parseDouble(value1);
            double val2 = Double.parseDouble(value2);
         
         
         
            switch (operator) {
            
               case 0:
                  display.setText("" + (val1 * val2));
                  break;
            
               case 1:
                  display.setText("" + (val1 / val2));
                  break;
            
               case 2: 
                  display.setText("" + (val1 - val2));
                  break;
            
               case 3:
                  display.setText("" + (val1 + val2));
                  break;
            
               default:
                  display.setText("The program has failed");
            
            }
         
            
            
         }*/


}