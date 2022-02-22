public class Main {
    public static void main(String[] args) {
        System.out.println("Пример использования класса Calculator:");
        Calculator calc = new Calculator();
        System.out.println(calc
                .newFormula()
                .addOperand(5)
                .addOperand(15)
                .calculate(Calculator.Operation.MULT)
                .result() + "\n");

        System.out.println("Пример использования класса IntsCalculator:");
        Ints intsCalc = new IntsCalculator();

        System.out.println("Умножение");
        System.out.println(intsCalc.sum(2, 2));

        System.out.println("Суммирование");
        System.out.println(intsCalc.mult(10, 22));

        System.out.println("Возведение в степень");
        try {
            System.out.println(intsCalc.pow(2, 10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}