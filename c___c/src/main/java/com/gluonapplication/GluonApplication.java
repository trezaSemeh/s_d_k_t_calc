package com.gluonapplication;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class GluonApplication extends Application {

    @Override
    public void start(Stage primaryStage) {


    	 BorderPane pane = new BorderPane();

    	 pane.setTop(getHBox());
    	 pane.setBottom(getVBox());
    	 Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();

    	 Scene scene = new Scene(pane,visualBounds.getWidth(),visualBounds.getHeight());
    	 primaryStage.setTitle("Traschenrechner"); 
    	 primaryStage.setScene(scene); 
    	 primaryStage.setResizable(false);
    	 primaryStage.show(); 
    	 }
    	 
    	 
    	 
    	 GenericStack<Double> operandStack ;
    	 GenericStack<Character> operatorStack;
    	 String[] tokens;
    	 private Button btn7;
    	 private Button btn8;
    	 private Button btn9;
    	 private Button btn_division;
    	 private Button btn_clear;
    	 private Button btn_clear_one;
    	 private Button btn4;
    	 private Button btn5;
    	 private Button btn6;
    	 private Button btn_multiply;
    	 private Button btn_c;
    	 private Button btn_d;
    	 private Button btn1;
    	 private Button btn2;
    	 private Button btn3;
    	 private Button btn_sub;
    	 private Button btn_pow;
    	 private Button btn_sqt;
    	 private Button btn0;
    	 private Button btn_dot;
    	 private Button btn_reminder;
    	 private Button btn_plus;
    	 private Button btn_equal;
    	 private TextField txt_field;
    	 String text_of_textfield="";
    	 

    	 
    	 
    	 public GluonApplication()
    	 {
    		 btn7=new Button("7");
    		 btn7.setMinSize(50, 70);
    		 btn8=new Button("8");
    		 btn8.setMinSize(50, 70);
    		 btn9=new Button("9");
    		 btn9.setMinSize(50, 70);
    		 btn_division=new Button("/");
    		 btn_division.setMinSize(50, 70);
    		 btn_clear=new Button("CE");   				//for clear all
    		 btn_clear.setMinSize(50, 70);
    		 btn_clear_one=new Button("C"); 			///for clear one
    		 btn_clear_one.setMinSize(50, 70);
    		 btn4=new Button("4");
    		 btn4.setMinSize(50, 70);
    		 btn5=new Button("5");
    		 btn5.setMinSize(50, 70);
    		 btn6=new Button("6");
    		 btn6.setMinSize(50, 70);
    		 btn_multiply=new Button("*");
    		 btn_multiply.setMinSize(50, 70);
    		 btn_c=new Button("(");  //for first ( symbol
    		 btn_c.setMinSize(50, 70);
    		 btn_d=new Button(")");		//for the second ) symbol
    		 btn_d.setMinSize(50, 70);
    		 btn1=new Button("1");
    		 btn1.setMinSize(50, 70);
    		 btn2=new Button("2");
    		 btn2.setMinSize(50, 70);
    		 btn3=new Button("3");
    		 btn3.setMinSize(50, 70);
    		 btn_sub=new Button("-");
    		 btn_sub.setMinSize(50, 70);
    		 btn_pow=new Button("^");
    		 btn_pow.setMinSize(50, 70);
    		 btn_sqt=new Button("v");
    		 btn_sqt.setMinSize(50, 70);
    		 btn0=new Button("0");
    		 btn0.setMinSize(50, 70);
    		 btn_dot=new Button(".");
    		 btn_dot.setMinSize(50, 70);
    		 btn_reminder=new Button("%");
    		 btn_reminder.setMinSize(50, 70);
    		 btn_plus=new Button("+");
    		 btn_plus.setMinSize(50, 70);
    		 btn_equal=new Button("=");
    		 btn_equal.setMinSize(100,70);
    		 txt_field=new TextField();
    		 txt_field.setMinSize(290, 40);
    		 txt_field.setEditable(false);
    		
    		 
    	 }
    	 
    	 private HBox getHBox() {
    	 HBox hBox = new HBox(15);
    	 hBox.setPadding(new Insets(15, 15, 15, 15));
    	 hBox.getChildren().add(txt_field);
    	 return hBox;
    	 }

    	 private VBox getVBox()
    	 {
    	 VBox vBox = new VBox();
    	vBox.setPadding(new Insets(15, 5, 5, 5));
    	HBox hBox1 = new HBox();
    	HBox hBox2 = new HBox();
    	HBox hBox3 = new HBox();
    	HBox hBox4 = new HBox();



    	btn7.setOnAction(e ->Type(btn7));
    	btn8.setOnAction(e ->Type(btn8));
    	btn9.setOnAction(e ->Type(btn9));
    	btn_division.setOnAction(e ->Type(btn_division));
    	btn_clear_one.setOnAction(e ->ClearOne());
    	btn_clear.setOnAction(e ->ClearAll());

    		
    	hBox1.getChildren().add(btn7);
    	hBox1.getChildren().add(btn8);
    	hBox1.getChildren().add(btn9);
    	hBox1.getChildren().add(btn_division);
    	hBox1.getChildren().add(btn_clear);
    	hBox1.getChildren().add(btn_clear_one);
    	vBox.setMargin(hBox1, new Insets(0, 0, 0, 0));
    	vBox.getChildren().add(hBox1);


    	btn4.setOnAction(e ->Type(btn4));
    	btn5.setOnAction(e ->Type(btn5));
    	btn6.setOnAction(e ->Type(btn6));
    	btn_multiply.setOnAction(e ->Type(btn_multiply));

    	btn_c.setOnAction(e ->Type(btn_c));
    	btn_d.setOnAction(e ->Type(btn_d));
    	hBox2.getChildren().add(btn4);
    	hBox2.getChildren().add(btn5);
    	hBox2.getChildren().add(btn6);
    	hBox2.getChildren().add(btn_multiply);
    	hBox2.getChildren().add(btn_c);
    	hBox2.getChildren().add(btn_d);
    	vBox.setMargin(hBox2, new Insets(0, 0, 0, 0));
    	vBox.getChildren().add(hBox2);



    	btn1.setOnAction(e ->Type(btn1));
    	btn2.setOnAction(e ->Type(btn2));
    	btn3.setOnAction(e ->Type(btn3));
    	btn_sub.setOnAction(e ->Type(btn_sub));
    	btn_pow.setOnAction(e ->Type(btn_pow));
    	btn_sqt.setOnAction(e ->Type(btn_sqt));
    	hBox3.getChildren().add(btn1);
    	hBox3.getChildren().add(btn2);
    	hBox3.getChildren().add(btn3);
    	hBox3.getChildren().add(btn_sub);
    	hBox3.getChildren().add(btn_pow);
    	hBox3.getChildren().add(btn_sqt);
    	vBox.setMargin(hBox3, new Insets(0, 0, 0, 0));
    	vBox.getChildren().add(hBox3);

    	btn0.setOnAction(e ->Type(btn0));
    	btn_dot.setOnAction(e ->Type(btn_dot));
    	btn_plus.setOnAction(e ->Type(btn_plus));
    	btn_reminder.setOnAction(e ->Type(btn_reminder));
    	btn_equal.setOnAction(e ->Get_Expression());
    	hBox4.getChildren().add(btn0);
    	hBox4.getChildren().add(btn_dot);
    	hBox4.getChildren().add(btn_reminder);
    	hBox4.getChildren().add(btn_plus);
    	hBox4.getChildren().add(btn_equal);

    	vBox.setMargin(hBox4, new Insets(0, 0, 0, 0));
    	vBox.getChildren().add(hBox4);
    	 
    	 return vBox;
    	}



    	 
    	 
    	 private void  Type(Button btn)
    	 {
    		
    		 if(btn==btn_clear)
    		 {
    			 txt_field.clear();
    			 text_of_textfield="";
    			 tokens=null;
    			
    		 }
    		 else
    		 {
    			 text_of_textfield+=btn.getText();
    			 txt_field.setText(text_of_textfield);
    			
    		 }
    		 
    	 }
    	 
    	 
    	 private void ClearAll()
    	 {
    		 Type(btn_clear);
    		
    	 }
    	private void ClearOne()
    	{
    		//for read last character in the string and clear it
    		text_of_textfield = text_of_textfield.substring(0, text_of_textfield.length()-1);
    			txt_field.setText(text_of_textfield);

    	}
    	private void Get_Expression()
    	{
    		try {
    			String answer=Double.toString(evaluateExpression(txt_field.getText()));
    			txt_field.setText(answer);
    			 }
    			 catch (Exception ex) 
    				{
    				 text_of_textfield="Wrong expression";
    				 txt_field.setText(text_of_textfield);
    				 ClearAll();
    				}
    		
    		
    	}
    	 
    	 
    	private  double evaluateExpression(String expression) {
    		 // Create operandStack to store operands
    			operandStack=new GenericStack<>();

    		 // Create operatorStack to store operators
    			operatorStack=new GenericStack<>();

    		 // Insert blanks around (, ), +, -, /, and *
    		 expression = insertBlanks(expression);

    		 // Extract operands and operators
    		 tokens = expression.split(" ");
    		 

    		 // Phase 1: Scan tokens
    		 for (String token: tokens)
    		 {
    				 //System.out.println(token);
    			 if (token.length() == 0) // Blank space
    			 { 
    				 continue; 
    			
    			 }// Back to the while loop to extract the next token
    			
    			 else if (token.charAt(0) == '+' || token.charAt(0) == '-') 
    			 {
    				// Process all +, -, *, / in the top of the operator stack
    				 while (!operatorStack.isEmpty() &&
    				( operatorStack.peek() == '+' ||
    				 operatorStack.peek() == '-' ||
    				 operatorStack.peek() == '*' ||
    				 operatorStack.peek() == '/'||
    				 operatorStack.peek() == '^'|| 
    				 operatorStack.peek() == '%'||
    				 operatorStack.peek() == 'v')) 
    				 {
    					 processAnOperator(operandStack, operatorStack);
    				 }
    				 // Push the + or - operator into the operator stack
    				 operatorStack.push(token.charAt(0));
    			 }
    			 
    			 
    			 
    			 else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
    			 // Process all *, / in the top of the operator stack
    			 while (!operatorStack.isEmpty() &&
    			( operatorStack.peek() == '*' ||
    			 operatorStack.peek() == '/'||
    			 operatorStack.peek() == '%'||
    			 operatorStack.peek() == 'v')) {
    			 processAnOperator(operandStack, operatorStack);
    			 }
    			 operatorStack.push(token.charAt(0));
    			 }
    			 
    			 else if (token.charAt(0) == '^')
    			 {
    				 while (!operatorStack.isEmpty() &&operatorStack.peek() == '^')
    				 {
    					 processAnOperator(operandStack, operatorStack);
    				 }
    				 operatorStack.push(token.charAt(0));
    			 }
    			 else if (token.charAt(0) == '%')
    			 {
    				 while (!operatorStack.isEmpty() &&operatorStack.peek() == '%')
    				 {
    					 processAnOperator(operandStack, operatorStack);
    				 }
    				 operatorStack.push(token.charAt(0));
    			 }
    			 else if (token.charAt(0) == 'v')
    			 {
    				 while (!operatorStack.isEmpty() &&operatorStack.peek() == 'v')
    				 {
    					 processAnOperator(operandStack, operatorStack);
    				 }
    				 operatorStack.push(token.charAt(0));
    			 }
    			 
    			
    			  else if (token.trim().charAt(0) == '(') {
    			 operatorStack.push('('); // Push '(' to stack
    			  }
    			  else if (token.trim().charAt(0) == ')') {
    			  // Process all the operators in the stack until seeing '('
    			  while (operatorStack.peek() != '(') {
    			  processAnOperator(operandStack, operatorStack);
    			  }
    			 
    			  operatorStack.pop(); // Pop the '(' symbol from the stack
    			  }
    			  else
    			  { // An operand scanned
    			  // Push an operand to the stack
    			  operandStack.push(new Double(token));
    			  }
    		}
    		 
    		  // Phase 2: Process all the remaining operators in the stack
    		  while (!operatorStack.isEmpty()) {
    			  processAnOperator(operandStack, operatorStack);
    		  }
    		 
    		  // Return the result
    		  return operandStack.pop();
    		  }
    		 


    		/** Process one operator: Take an operator from operatorStack and
    		 89 * apply it on the operands in the operandStack */
    		  public static <E> void  processAnOperator(
    				  GenericStack<Double> operandStack, GenericStack<Character> operatorStack) {
    		  char op = operatorStack.pop();
    		  double op1 = operandStack.pop();
    		  double op2 = operandStack.pop();
    		  	if (op == '+')
    			  operandStack.push(op2 + op1);
    		  	else if (op == '-')
    			  operandStack.push(op2 - op1);
    		  	else if (op == '*')
    			  operandStack.push(op2 * op1);
    		  	else if (op == '/')
    			  	operandStack.push(op2 / op1);
    		  	else if (op == '^')
    			  operandStack.push(Math.pow( op2,op1));
    		  	else if (op == '%')
    			  operandStack.push(op2 %op1);
    		  	else if(op=='v')
    		  	{ 
    		  		//for make any square root so we first enter the number which want to find the square the we put the pow of the square 
    		  		op1=(1/op1);
    		  		operandStack.push(Math.pow( op2,op1));
    		  		
    			  
    		  	}
    		  }
    		 
    		  public static String insertBlanks(String s) {
    		  String result = "";

    		  for (int i = 0; i < s.length(); i++) {
    		  if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
    		 s.charAt(i) == '+' || s.charAt(i) == '-' ||
    		  s.charAt(i) == '*' || s.charAt(i) == '/' ||
    		  s.charAt(i) == '^' || s.charAt(i) == '%'  || s.charAt(i) == 'v' )
    		 result += " " + s.charAt(i) + " ";
    		  
    		 else
    		 result += s.charAt(i);
    		  }
    		 
    		 return result;
    }
}
