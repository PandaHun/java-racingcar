package calculator;

public class DivideOperator implements Operator {
	@Override
	public long operation(long a, long b) {
		return a / b;
	}
}