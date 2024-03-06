package labb5;
import java.awt.Button;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
  
import javax.swing.*;  
public class test extends JFrame{  
    public static void main(String[] args) {  
            test a = new test();  
        }  
        public test() {  
        	GridBagLayout grid = new GridBagLayout();  
            GridBagConstraints gbc = new GridBagConstraints();  
            setLayout(grid);  
            setTitle("GridBag Layout Example");  
            GridBagLayout layout = new GridBagLayout();
    this.setLayout(layout);  
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new Button("Button One"), gbc);
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    this.add(new Button("Button two"), gbc);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.ipady = 20;  
    gbc.gridx = 0;  
    gbc.gridy = 1;  
    this.add(new Button("Button Three"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 1;  
    this.add(new Button("Button Four"), gbc);  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridwidth = 2;  
    this.add(new Button("Button Five"), gbc);  
            setSize(300, 300);  
            setPreferredSize(getSize());  
            setVisible(true);  
            setDefaultCloseOperation(EXIT_ON_CLOSE);  
      
        }  
      
}  


//layoutConstraints = new GridBagConstraints();
//layoutConstraints.fill = GridBagConstraints.BOTH;



//int index = 0;



//for (int i = 0; i < 5; i++) {
	//layoutConstraints.gridy = i;
	
	//for(int k = 0; k < 4; k = k +2) {
		//layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
		//layoutConstraints.gridheight = 1;
		//layoutConstraints.gridwidth = 1;
		//layoutConstraints.gridx = k;
		
		
		//this.button[index] = new JButton(Integer.toString(index));
		//keypad.add(button[index], layoutConstraints);
		
		//index = index + 1;
	//}
//}