package i_thread;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class StopWatchThread extends JPanel implements Runnable {
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public StopWatchThread() {
		setLayout(new BorderLayout(0, 0));
		add(getLblNewLabel(), BorderLayout.CENTER);

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("stopwatch");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		}
		return lblNewLabel;
	}

	@Override
	public void run() {
		
		
	}
}
