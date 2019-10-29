import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TasteChef{
	private static int sortedCard = 0;
	private static int maxCard = 75;
	//extends JFrame
	static JPanel jpMenu = new JPanel();
	static JPanel jpTaskPanel = new JPanel();
	
	private static JFrame jfMain = new JFrame("Taste Chef");
	private static JButton jbGetStarted = new JButton("Get Started!");
	private static JButton jbFavorites = new JButton("Favorite Recipes");
	private static JButton jbDiet = new JButton("Diet");
	private static JButton jbTrending = new JButton("Trending");
	private static JButton jbInstructions = new JButton("Cook Like a Pro");
	
	private static JInternalFrame testFrame = new JInternalFrame("");
	private static JInternalFrame jifLogin = new JInternalFrame("Login");
	
	
	private static void mainFrame(){
		buildJMenu();
		buildTaskPanel();
		CreateInternalJFrame();
		
		
		jfMain.setLayout(new BorderLayout());
		jfMain.add(jpMenu, BorderLayout.WEST);
		jfMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfMain.setSize(1000, 600);
		jfMain.setVisible(true);
	}

	public static void main(String[] args) {
		mainFrame();
		jbLoginListener();
		//jbReportListener();
	}// end main

	private static void CreateInternalJFrame(){
		testFrame.setSize(300,300);
		testFrame.setVisible(true);	
	}
	
	private static void buildTaskPanel(){

		
	}//end buildTaskPanel()
	
	private static void buildJMenu(){
		jpMenu.setPreferredSize(new Dimension(200, 80));
		jbGetStarted.setPreferredSize(new Dimension(200, 40));
		jbFavorites.setPreferredSize(new Dimension(200, 40));
		jbDiet.setPreferredSize(new Dimension(200, 40));
		jbTrending.setPreferredSize(new Dimension(200, 40));
		jbInstructions.setPreferredSize(new Dimension(200, 40));
		
		
	
		
		jpMenu.add(jbGetStarted);
		jpMenu.add(jbFavorites);
		jpMenu.add(jbDiet);
		jpMenu.add(jbTrending);
		jpMenu.add(jbInstructions);
	}
	
	public static void jbLoginListener(){
		jbGetStarted.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  SearchRecipe searchPanel = new SearchRecipe();  
			  searchPanel.setVisible(true);
			  jfMain.add(searchPanel, BorderLayout.CENTER);	 
		  }
		});
		
	}
	
	
	
}//end class Main

