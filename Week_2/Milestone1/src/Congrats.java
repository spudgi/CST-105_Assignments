import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Congrats {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Congrats window = new Congrats();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblGoodJobHaving = new Label(shell, SWT.NONE);
		lblGoodJobHaving.setBounds(99, 75, 236, 53);
		lblGoodJobHaving.setText("Good Job Having A Birthday!!");
		
		CLabel lblNewLabel = new CLabel(shell, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage(Congrats.class, "/org/eclipse/jface/dialogs/images/message_warning.png"));
		lblNewLabel.setBounds(193, 25, 87, 31);
		lblNewLabel.setText("");
		
		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Home nw = new Home();
				nw.open();
			}
		});
		btnExit.setBounds(157, 150, 105, 35);
		btnExit.setText("Exit");

	}

}
