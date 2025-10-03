public class Simplecalucator {
    Public static viod main(String[] args) {
        //asl user for two numbers
        int num1 =float(input("Enter first number: ")) 
        int a =  int(input("Enter second number: "))
        
        //ask user for operation
        String op = input("Enter operation (+, -, *, /): ")
        
        //perform calculation based on operation
        if op == "+":
            result = num1 + num2
        elif op == "-":
            result = num1 - num2
        elif op == "*":
            result = num1 * num2
        elif op == "/":
            if num2 != 0:
                result = num1 / num2
            else:
                print("Error: Division by zero")
                return
        else:
            print("Error: Invalid operation")
            return
    
    }
}