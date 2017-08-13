import java.awt.Desktop;
import java.io.File;

import javax.swing.JOptionPane;

public class OpenPdfExternal {

	public static void openPDF(String file) {
		if (Desktop.isDesktopSupported()) {
			try {
				File myFile = new File(file);
				Desktop.getDesktop().open(myFile);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No Application to open PDF", "App not Found",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
