import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.*;
public class MagnetFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int TEXTAREA_ROWS = 10;
	public static final int TEXTAREA_COLUMNS = 40;
	public JTextArea textArea1;
	public JTextArea textArea2;
	public String text1 = "";
	public String regex = "magnet:.+?\\&";
	public MagnetFrame()
	{
		
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(2,2));
		
		textArea1 = new JTextArea(TEXTAREA_ROWS, TEXTAREA_COLUMNS);
		JScrollPane scrollPane1 = new JScrollPane(textArea1);
		
		textArea2= new JTextArea(TEXTAREA_ROWS, TEXTAREA_COLUMNS);
		JScrollPane scrollPane2 = new JScrollPane(textArea2);
		
		northPanel.add(new JLabel("url to be resolved: ", SwingConstants.LEFT));
		northPanel.add(new JLabel("url resolved:", SwingConstants.LEFT));
		northPanel.add(scrollPane1);
		northPanel.add(scrollPane2);
		
		add(northPanel, BorderLayout.NORTH);
		
		JPanel southPanel = new JPanel();
		
		SimpleListener listener = new SimpleListener();
		
		JButton insertButton = new JButton("Resolve");
		southPanel.add(insertButton);
		insertButton.addActionListener(listener);
		add(southPanel, BorderLayout.SOUTH);
		pack();
	
	}
	private class SimpleListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			String text1 = textArea1.getText();
			String text2 = "";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(text1);
			
		    while (matcher.find()) 
		    {  
		    	text2 = (text2 + matcher.group()).replace("&", "") + "\n";  
		    }  
			textArea2.append(text2 +"\n");
		}
	}
}