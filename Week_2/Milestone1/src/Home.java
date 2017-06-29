//Caleb Miller//
	//CST-105//
		//20170621//
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Home {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Home window = new Home();
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
		shell.setLayout(new FormLayout());
		
		Label lblFirstName = new Label(shell, SWT.NONE);
		FormData fd_lblFirstName = new FormData();
		fd_lblFirstName.top = new FormAttachment(0, 42);
		fd_lblFirstName.left = new FormAttachment(0, 10);
		lblFirstName.setLayoutData(fd_lblFirstName);
		lblFirstName.setText("First Name");
		
		text = new Text(shell, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.right = new FormAttachment(lblFirstName, 269, SWT.RIGHT);
		fd_text.top = new FormAttachment(0, 42);
		fd_text.left = new FormAttachment(lblFirstName, 6);
		text.setLayoutData(fd_text);
		
		Label lblDateOfBirth = new Label(shell, SWT.NONE);
		FormData fd_lblDateOfBirth = new FormData();
		fd_lblDateOfBirth.top = new FormAttachment(text, 19);
		fd_lblDateOfBirth.left = new FormAttachment(0, 10);
		lblDateOfBirth.setLayoutData(fd_lblDateOfBirth);
		lblDateOfBirth.setText("Date of Birth");
		
		DateTime dateTime = new DateTime(shell, SWT.BORDER);
		FormData fd_dateTime = new FormData();
		fd_dateTime.top = new FormAttachment(lblDateOfBirth, 0, SWT.TOP);
		fd_dateTime.left = new FormAttachment(lblDateOfBirth, 6);
		dateTime.setLayoutData(fd_dateTime);
		
		Button btnSubmit = new Button(shell, SWT.NONE);
		btnSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Congrats nw = new Congrats();
				nw.open();
			}
		});
		FormData fd_btnSubmit = new FormData();
		fd_btnSubmit.bottom = new FormAttachment(100, -50);
		fd_btnSubmit.right = new FormAttachment(text, 0, SWT.RIGHT);
		btnSubmit.setLayoutData(fd_btnSubmit);
		btnSubmit.setText("Submit");
		
		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Goodbye nw = new Goodbye();
				nw.open();
			}
		});
		FormData fd_btnExit = new FormData();
		fd_btnExit.top = new FormAttachment(btnSubmit, 0, SWT.TOP);
		fd_btnExit.left = new FormAttachment(0, 93);
		btnExit.setLayoutData(fd_btnExit);
		btnExit.setText("Exit");

	}

	public void NewScreen() {
		// TODO Auto-generated method stub
		
	}
}
