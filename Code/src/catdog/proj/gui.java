package proj;

import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.ErrorManager;


public class gui {
   
    private JTextField textField;
    public gui(){
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel label = new JLabel("dir:");
        
        textField = new JTextField();
        JButton submitButton = new JButton("Submit");
        
        submitButton.addActionListener(e-> runner());
        
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(submitButton);

        frame.getContentPane().add(panel);
        frame.setLayout(new java.awt.FlowLayout());


        frame.setVisible(true);
        

    }

    public void runner() throws FileNotFoundException{
        
            File directory = new File(textField.getText());
            FileNamePrinter.traverseDir(directory);
        
        
    }

    public static void traverseDir(File dir) {
        try{
        
            File[] files = dir.listFiles();

            if (files != null) {

                for (final File file : files) {
                    traverseDir(file);
                    System.out.println(dir.getAbsoluteFile());

                }
            }
        }
        catch(Error e){
            System.out.println("Error");
        }

        
    
    }

    public static void main(String[] args) {
        gui gooey = new gui();
        
    }

}
