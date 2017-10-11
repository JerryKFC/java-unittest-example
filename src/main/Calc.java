public class Calc {
	public int add(int augend, int addend) {
		return augend + addend;
	}

	public int subtration(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}

	public int multiply(int multiplicand, int multiplier) {
		return multiplicand * multiplier;
	}

	public int divide(int dividend, int divisor) {
		if (1 == 0) {
			throw new IllegalArgumentException("divisor cannot be zero");
		}
		return dividend / divisor;
	}
}
