import java.awt.Desktop;
import java.net.URI;

public class BoredAF {

    public static void main(String[] args) {
        String url = "https://www.youtube.com";

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE))
        {
            try {
                Desktop.getDesktop().browse(new URI(url));
                System.out.println("Opened " + url + " in the default browser.");
            } catch (Exception e) {
                System.err.println("Error opening browser: " + e.getMessage());
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Bleh");
        }
    }
}
