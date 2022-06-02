public class CalculatorFunctions {

    public void openCalculator() {
        System.out.println("Turn on Calculator");
    }

    public void add () {
        int a = 20;
        int b = 21;
    int result = a + b;
        System.out.println("Addition result:" + result);
    }

    public void deduct () {
        int a = 20;
        int b = 21;
        int result = a - b;
        System.out.println("Deduction result:" + result);
    }

    public void addThreeNum() {
        int a = 20;
        int b = 21;
        int c = 22;
        int result = a + b + c;
        System.out.println("Addition of 3 numbers:" + result);
    }

    public void deductThreeNum() {
        int a = 20;
        int b = 21;
        int c = 22;
        int result = a - (b + c);
        System.out.println("Deduction of 3 numbers:" + result);
    }


}
