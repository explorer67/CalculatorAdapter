public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) result;
    }

    @Override
    public int pow(int a, int b) throws Exception {
        double result = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        if (result > Integer.MAX_VALUE) throw new Exception("Превышено максимальное значение Integer.MAX_VALUE");
        return (int) result;
    }
}
