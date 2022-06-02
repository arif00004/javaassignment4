public class ChromeBrowserApp {
    public static void main(String[] args) {
        ChromeBrowser myChrome = new ChromeBrowser();

        boolean browserOpen = true;
        boolean browserClosed = false;
        boolean insertText = true;
        boolean openTab = false;

        if (browserOpen) {
            System.out.println("Opening Chrome Browser");
            myChrome.openChromeBrowser();
        } else if (browserClosed) {
            System.out.println("Closing Chrome Browser");
            myChrome.closeChrome();
        }
        if (browserOpen && insertText) {
            System.out.println("Insert your url");
            myChrome.writeUrlinChromeBrowser();
        }

        if (browserOpen && openTab) {
            System.out.println("Opening new tab");
            myChrome.openNewTab();
        }
    }
}

