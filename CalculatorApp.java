public class CalculatorApp {
    public static void main(String[] args){
        CalculatorFunctions myCalculator = new CalculatorFunctions();

        boolean needCalculation = true;

        if(needCalculation){
            System.out.println("Opening Calculator");
            myCalculator.openCalculator();
        }

        // returning results

        System.out.println();
        myCalculator.add();
        System.out.println();
        myCalculator.deduct();
        System.out.println();
        myCalculator.addThreeNum();
        System.out.println();
        myCalculator.deductThreeNum();


    }
}
