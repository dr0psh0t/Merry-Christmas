package model;
import java.util.LinkedList;
import javafx.scene.image.ImageView;

/*
 * Author: Daryll David E. Dagondon
 * class: ChristmasTree
 */

public class ChristmasTree extends Tree
{
	private LinkedList<Sock> socksOrnaments;
	private LinkedList<Ball> ballsOrnaments;
	
	// constructor
	public ChristmasTree(ImageView tree, int height, int width, int y)
	{
		super(tree, height, width, y);			
		socksOrnaments = new LinkedList<>();
		ballsOrnaments = new LinkedList<>();
	}
	
	public ChristmasTree()
	{
		socksOrnaments = new LinkedList<>();
		ballsOrnaments = new LinkedList<>();
	}
	
	// get tree
	@Override
	public ImageView getTree(){
		return super.getTree();
	}
	
	// set tree
	public void setTree(ImageView tree){
		super.setTree(tree);
	}
	
	// add more ornaments
	public void addSocksOrnaments(Sock imageView){
		socksOrnaments.add(imageView);
	}
	
	// add more ornaments
	public void addBallsOrnaments(Ball ball){
		ballsOrnaments.add(ball);
	}
}