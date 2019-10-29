import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.HashMap;

public class SearchRecipe extends JInternalFrame{
	public static JLabel jlIngredientList = new JLabel("What Ingredients do you have available?: ");	
	public static JPanel jpSearchPanel = new JPanel();	
	public static JTextField jtfSearch = new JTextField();
	public static JButton jbSearch = new JButton("Search!");
	
	public static int amountOfIngredients = 0;
	public static String[] ingredients;
	
	public SearchRecipe(){
		//setPreferredSize(new Dimension(240, 80));
		setLayout(new GridLayout(1,1));
		jlIngredientList.setPreferredSize(new Dimension(240, 80));
		jtfSearch.setPreferredSize(new Dimension(200, 20));
		jbSearch.setPreferredSize(new Dimension(80, 20));
		jpSearchPanel.add(jlIngredientList);
		jpSearchPanel.add(jtfSearch);
		jpSearchPanel.add(jbSearch);
		add(jpSearchPanel);
		//add(new JLabel());
		//add(new JLabel());
		//add(new JLabel());
	
		
		jbSearchListener();
		
		setTitle("Search Recipes");
		setResizable(true);
		setClosable(true);
		setMaximizable(true);
		//setSize(300,300);
	}
	
	public static void jbSearchListener(){
		jbSearch.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {    
			  System.out.println("Test Block 1");
			  characterCount(jtfSearch.getText());
			  
		  }
		});
		
	}
	
	private static void characterCount(String inputString){
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();  
	    char[] strArray = inputString.toCharArray();

	    for (char c : strArray){
	    	if(charCountMap.containsKey(c)){
	    			charCountMap.put(c, charCountMap.get(c)+1);   	
	        }
	        else{
	        		if (c == ' ') {
	        			charCountMap.put(c, 1);
	        		}
	            }
	        }
	        System.out.println(inputString+" : "+charCountMap);
	    }
}