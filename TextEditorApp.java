import java.util.Scanner;

public class TextEditorApp {
    public static void main(String[] args) {

        TextEditor myTextEditor = new TextEditor();

        boolean openApp = true;
        boolean closeApp = false;

        if (openApp) {
            System.out.println("Opening App");
            myTextEditor.openTextEditor();
        } else if (closeApp) {
            System.out.println("Closing App");
            myTextEditor.closeEditor();
        }
        if (openApp) {
            Scanner myScanner = new Scanner(System.in);
            String text;
            System.out.println("Insert Your Text");
            text = myScanner.nextLine();
            System.out.println(text);
        } else {
            System.out.println("Sorry the Text Editor is Closed");
        }
    }
}
