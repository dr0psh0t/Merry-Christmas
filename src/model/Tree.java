package model;
import javafx.scene.image.ImageView;

/*
 * Author: Daryll David E. Dagondon
 * class: Tree
 */

public abstract class Tree
{
	// instance field
	private ImageView tree;
	
	// constructor
	public Tree(ImageView tree, int height, int width, int y)
	{
		this.tree = tree;
		setHeight(height);
		setWidth(width);
		this.tree.setY(y);
	}
	
	public Tree(){}
	
	// accessors
	protected double getHeight(){
		return tree.getFitHeight();
	}
	
	protected double getWidth(){
		return tree.getFitWidth();
	}
	
	protected ImageView getTree(){
		return tree;
	}
	
	// mutators
	protected void setHeight(int height){
		this.tree.setFitHeight(height);
	}
	protected void setWidth(int width){
		this.tree.setFitWidth(width);
	}

	protected void setTree(ImageView tree){
		this.tree = tree;
	}
}