public class Computer {
    public static void main(String[] args) {
        ComputerFunctions myComputer = new ComputerFunctions();

        boolean workingTime = true;
        boolean nonWorkingTime = false;
        boolean needFasterPC = false;
        boolean adjustBrightness = true;

        if (workingTime){
            System.out.println("Turning on Computer");
            myComputer.turnOnComputer();
        } else if (nonWorkingTime) {
            System.out.println("Turning off computer");
            myComputer.turnOffComputer();
        } else if (needFasterPC){
            System.out.println("Clearing Cache");
            myComputer.clearCache();
        } else if (adjustBrightness){
            System.out.println("Adjusting light at 25%");
            myComputer.reduceBrightness(25);
        }

    }
}


