package week3;

public class Calculator {

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        if (operation == null) {
            throw new IllegalStateException("연산 객체가 설정되지 않았습니다.");
        }
        return operation.operate(firstNumber, secondNumber);
    }
}
