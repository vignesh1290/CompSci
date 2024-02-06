package proj;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;




public class TreeNode {
	
	public String val;
	public ArrayList<TreeNode> children;

	public TreeNode(String n) {
		val=n;
		children = new ArrayList<TreeNode>();
	}
	public void addChild(TreeNode n) {
		children.add(n);
	} 
	public void addChildren(ArrayList<TreeNode> n) {
		for (TreeNode e: n) {
			children.add(e);
		}

	}
	public void drawTreeNode() {
		JFrame frame = new JFrame();
		
		frame.setSize(null);
		frame.setTitle();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RectangleComponent component
				
				
	
				
	}
}

