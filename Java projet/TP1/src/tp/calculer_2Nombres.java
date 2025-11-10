package tp;
import java.util.Scanner;

public class calculer_2Nombres {
	char op;
    int x, y;

public calculer_2Nombres(int x, int y, char op) {
	this.x = x;
    this.y = y;
    this.op = op;
    }
public void calculate() {
	Scanner scanner = new Scanner(System.in);
	
	while (op != '+' && op != '-' && op != '*' && op != '/') {
		System.out.println("Re-enter the operation (+, -, *, /):");
		op = scanner.next().charAt(0);
}
	if (op == '+') {
	System.out.println(x + y);
	}
    else if (op == '-') {
	System.out.println(x-y);
	} 
    else if (op == '*') {
	System.out.println(x * y);
	}
    else if (op == '/') {
    	if (y != 0) {
    		System.out.println(x / y);
    		} else {
    			System.out.println("Division by zero error");
    			}
    	} else {
    		System.out.println("Unknown operation");
    		}
	scanner.close();
	}

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter first number: ");
    int x = scanner.nextInt();

    System.out.print("Enter second number: ");
    int y = scanner.nextInt();

    System.out.print("Enter operation (+, -, *, /): ");
    char op = scanner.next().charAt(0);

    calculer_2Nombres  calc = new calculer_2Nombres (x, y, op);
    calc.calculate();

    scanner.close();
    }
}


