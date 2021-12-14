package ThucHanh;

public class Calculator {
//    public static int calculate(int a, int b, char o) {
//        switch (o) {
//            case '+' :
//                return a + b;
//            case '-' :
//                return a - b;
//            case '*' :
//                return a * b;
//            case '/' :
//                if (b != 0)
//                    return a / b;
//            else
//                throw new RuntimeException("Can not divide by 0");
//            default:
//                throw new RuntimeException("Unsupported operation");
//        }
//    }

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int Calculate(int fistOperand, int secondOperand, char operato) {
        switch (operato){
            case ADDITION:
                return fistOperand + secondOperand;
            case SUBTRACTION:
                return fistOperand - secondOperand;
            case MULTIPLICATION:
                return fistOperand * secondOperand;
            case DIVISION:
                if(secondOperand != 0)
                    return fistOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divition by 0");
                default:
                    throw new RuntimeException("Unsupported operation");
        }
    }
}
