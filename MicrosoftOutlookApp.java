public class MicrosoftOutlookApp {
    public static void main(String[] args){
        MicrosoftOutlook myOutlook = new MicrosoftOutlook();

        boolean openOutlook = false;
        boolean closeOutlook = true;

        if (openOutlook) {
            System.out.println("Opening Microsoft Outlook");
            myOutlook.openMsOutlook();}
        else if (closeOutlook) {
            System.out.println("Closing Microsoft Outlok");
            myOutlook.closeMsOutlook();
        }
    }
}
