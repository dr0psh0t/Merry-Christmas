package utility;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.ChristmasTree;

/*
 * Author: Daryll David E. Dagondon
 * class: UtilityClass
 */

public class UtilityClass
{
	public static ImageView nativity()
	{
		Image img = new Image("/res/nativity.jpg");
		ImageView imgView = new ImageView(img);
		
		imgView.setFitHeight(450);
		imgView.setFitWidth(722);
		imgView.setX(350);
		imgView.setY(115);
		
		return imgView;
	}
	
	public static ImageView tree()
	{
		ChristmasTree imgView = new ChristmasTree(new ImageView("/res/christmastree.png"), 450, 344, 115);
		return imgView.getTree();
	}
	
	public static ImageView finalTree()
	{
		ChristmasTree imgView = new ChristmasTree(new ImageView("/res/christmastree.gif"), 450, 344, 115);
		return imgView.getTree();
	}
	
	public static ImageView reindeer()
	{
		Image img = new Image("/res/reindeer.jpg");
		ImageView imgView = new ImageView(img);
		
		imgView.setFitHeight(110);
		imgView.setFitWidth(490);
		imgView.setX(-500);
		imgView.setY(570);
		
		return imgView;
	}
	
	public static ImageView merryXmas()
	{
		ImageView imgView = new ImageView(new Image("/res/merrychristmas.gif"));
		imgView.setFitHeight(110);
		imgView.setFitWidth(590);
		imgView.setX(-590);
		
		return imgView;
	}
	
	public static ImageView lightOne()
	{
		ImageView imageView = new ImageView(new Image("/res/lightone.gif"));
		
		imageView.setFitWidth(294);
		imageView.setFitHeight(60);
		imageView.setY(115);
		imageView.setX(30);
		
		return imageView;
	}
	
	public static ImageView lightTwo()
	{
		ImageView imageView = new ImageView(new Image("/res/lighttwo.gif"));
		
		imageView.setFitWidth(400);
		imageView.setFitHeight(100);
		imageView.setX(170);
		
		return imageView;
	}
	
	public static ImageView lightThree()
	{
		ImageView imageView = new ImageView(new Image("/res/lightthree.gif"));
		
		imageView.setFitWidth(1040);
		imageView.setFitHeight(50);
		imageView.setY(570);
		imageView.setX(25);
		
		return imageView;
	}
	
	public static ImageView lightFour()
	{
		ImageView imageView = new ImageView(new Image("/res/lightfour.gif"));
		
		imageView.setFitWidth(400);
		imageView.setFitHeight(100);
		imageView.setX(630);
		
		return imageView;
	}
	
	public static ArrayList<ImageView> nodes()
	{
		ArrayList<ImageView> children = new ArrayList<>(Arrays.asList(nativity(),
				finalTree(), lightFour(), merryXmas(), lightThree(), lightTwo(), lightOne()));
		return children;
	}
}