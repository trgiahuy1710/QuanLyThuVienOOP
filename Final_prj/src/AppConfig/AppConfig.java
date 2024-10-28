package AppConfig;

import javax.swing.UIManager;
import LibrarianView.QLSachView;
import LibrarianView.StudentView;
import LibrarianView.TransactionView;
import LoginRegisterView.FuntionLogin;
import LoginRegisterView.LoginView;
import ReadersView.PhieuDkyView;
import ReadersView.ReaderBookView;
import ReadersView.StatusView;

public class AppConfig {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new StatusView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
