import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
//import javafx.scene.*;
//import java.io.*;
//import java.lang.String.*;
//import java.util.HashMap;

public class SearchRecipe extends JInternalFrame{
	public static JLabel jlIngredientList = new JLabel("What Ingredients do you have available?: ");	
	public static JLabel jlIngredientNote = new JLabel("Note: type in all lowercase and separate each ingredients with a space. ");
	public static JPanel jpSearchPanel = new JPanel();	
	public static JTextField jtfSearch = new JTextField();
	public static JButton jbSearch = new JButton("Search!");
	public static JPanel jpResultPanel = new JPanel();	
	
	public static int amountOfIngredients = 0;
	//public static String[] ingredients;
	public static String tempString;
	private static double baconOmeletteCalculator = 0;
	private static double frenchToastCalculator = 0;
	private static String[] ingredients;
	
	public SearchRecipe(){
		//setPreferredSize(new Dimension(240, 80));
		setLayout(new GridLayout(2,1));
		jlIngredientList.setPreferredSize(new Dimension(240, 80));
		jtfSearch.setPreferredSize(new Dimension(200, 20));
		jbSearch.setPreferredSize(new Dimension(80, 20));
		
		//Build Panel 1
		jpSearchPanel.add(jlIngredientList);
		jpSearchPanel.add(jtfSearch);
		jpSearchPanel.add(jbSearch);
		jpSearchPanel.add(jlIngredientNote);
		add(jpSearchPanel);
		
		
		//Build Panel 2
		buildResultPanel();
		add(jpResultPanel);
		
		jbSearchListener();
		
		setTitle("Search Recipes");
		setResizable(true);
		setClosable(true);
		setMaximizable(true);
		//setDefaultCloseOperation(SearchRecipe.EXIT_ON_CLOSE);
	}
	
	public static void jbSearchListener(){
		jbSearch.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {   
			 // System.out.println("Test Block 1");
			  tempString = jtfSearch.getText();
			  System.out.println(characterCount(tempString) + 1);
			  amountOfIngredients = characterCount(tempString) + 1;
			  //String[] ingredients = tempString.split("\\s+");
			  for(int count = 0; count <= characterCount(tempString); count++ ){
				  
				  ingredients = tempString.split("\\s+");
				  System.out.println("Ingredient " + (count + 1) + ": " + ingredients[count]);
			  }
			  //Recipe 1 eggs bacon cheese
			  baconOmeletteCalculator();
			  frenchToastCalculator();
			  System.out.println("Ingredients available for bacon omelette: " + baconOmeletteCalculator + "%");
			  System.out.println("Ingredients available for french toast: " + frenchToastCalculator + "%");
			  
		  }
		});	
		
	}
	public static void buildResultPanel() {
		//jpResultPanel.add(new JLabel(ingredients[0]));
		/*
		for(int count = 0; count <= characterCount(tempString); count++ ) {
			jpResultPanel.add(new JLabel(ingredients[count]));
		
		}
		*/
	}
	
	private static int characterCount(String inputString){
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();  
	    char[] strArray = inputString.toCharArray();
	    int charCount = 0;

	    for (char c : strArray){
	    	if(charCountMap.containsKey(c)){
	    			charCountMap.put(c, charCountMap.get(c)+1);   	
	    			if (c == ' ') {
	        			charCount++;
	        		}
	        }
	        else{
	        		if (c == ' ') {
	        			charCountMap.put(c, 1);
	        			charCount++;
	        		}
	            }
	        }     
	        return charCount;        
	    }
	
	private static void baconOmeletteCalculator() {
		baconOmeletteCalculator = 0;
		  if(Arrays.asList(ingredients).contains("eggs")) {
			  baconOmeletteCalculator = baconOmeletteCalculator + 33.33;
		  }
		  if(Arrays.asList(ingredients).contains("bacon")) {
			  baconOmeletteCalculator = baconOmeletteCalculator + 33.33;
		  }
		  if(Arrays.asList(ingredients).contains("cheese")) {
			  baconOmeletteCalculator = baconOmeletteCalculator + 33.33;
		  }	
	}
	private static void frenchToastCalculator(){
		frenchToastCalculator = 0;
		  if(Arrays.asList(ingredients).contains("bread")) {
			  frenchToastCalculator = frenchToastCalculator + 33.33;
		  }
		  if(Arrays.asList(ingredients).contains("eggs")) {
			  frenchToastCalculator = frenchToastCalculator + 33.33;
		  }
		  if(Arrays.asList(ingredients).contains("cinnomon")) {
			  frenchToastCalculator = frenchToastCalculator + 33.33;
		  }	
	}
		
}
