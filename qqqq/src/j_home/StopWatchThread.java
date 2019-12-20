package j_home;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.Date;

import javax.swing.SwingConstants;

public class StopWatchThread extends JPanel implements Runnable {
	private JLabel lblNewLabel;
	boolean stop = false;
	private double end;

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
		DecimalFormat df = new DecimalFormat("###,###.000");
		long begin = new Date().getTime();
		while (!stop) {
			long end = new Date().getTime() - begin;
			lblNewLabel.setText(df.format(end / 1000.0));
			try {
				Thread.sleep(1);
			} catch (Exception ex) {
			}
		}

	}

}
