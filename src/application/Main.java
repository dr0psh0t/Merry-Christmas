package application;	
import java.util.Random;
import controller.MyController;
import model.Ball;
import model.ChristmasTree;
import model.Sock;
import utility.UtilityClass;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/*
 * Author: Daryll David E. Dagondon
 * class: Main
 */

public class Main extends Application
{
	private AnchorPane root;
	private Stage stage;
	private Random rand = new Random();
	private Node menuBar;
	private Node text;
	private ChristmasTree cTree = new ChristmasTree();
	
	@Override
	public void start(Stage primaryStage)
	{
		try
		{
			stage = primaryStage;
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/controller/Tree.fxml"));			
			root = (AnchorPane) loader.load();
			
			Scene scene = new Scene(root);
			
			MyController controller = loader.getController();
			controller.setApp(this);
			
			menuBar = root.getChildren().get(0);
			text = root.getChildren().get(1);
			
			stage.setScene(scene);
			stage.setTitle("Merry Christmas!");
			stage.setResizable(false);
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sock(boolean isWhite)
	{
		Sock imgView;		
		if(isWhite)
			 imgView = new Sock(new Image("/res/sockwhite.jpg"), xCoord(), yCoord(), 50, 50);
		else
			 imgView= new Sock(new Image("/res/sockgreen.jpg"), xCoord(), yCoord(), 50, 50);
		
		cTree.addSocksOrnaments(imgView);
		root.getChildren().addAll(imgView);
	}
	
	public void ball(boolean isGreen)
	{
		Ball ball;
		if(isGreen)
			ball = new Ball(new Image("/res/ballgreen.jpg"), xCoord(), yCoord(), 50, 50);
		else
			ball = new Ball(new Image("/res/ballwhite.jpg"), xCoord(), yCoord(), 50, 50);
		
		cTree.addBallsOrnaments(ball);
		root.getChildren().addAll(ball);
	}
	
	public void greet()
	{
		Timeline timeline = new Timeline();
		ImageView imgView = UtilityClass.merryXmas();
		root.getChildren().add(imgView);
		
		Duration timeDuration = new Duration(5000);
		KeyValue keyValue = new KeyValue(imgView.translateXProperty(), 1640);
		KeyFrame keyFrame = new KeyFrame(timeDuration, keyValue);
		
		timeline.getKeyFrames().add(keyFrame);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}
	
	public void tree()
	{
		cTree.setTree(UtilityClass.tree());
		root.getChildren().add(cTree.getTree());
	}
	
	public void closeTree(){
		stage.close();
	}
	
	public void result()
	{
		ImageView imageView = UtilityClass.reindeer();
		root.getChildren().clear();
		root.getChildren().addAll(menuBar, text);
		root.getChildren().addAll(UtilityClass.nodes());
		
		Timeline timeline = new Timeline();
		root.getChildren().add(2, imageView);
		
		Duration timeDuration = new Duration(5000);
		KeyValue keyValue = new KeyValue(imageView.translateXProperty(), 1600);
		KeyFrame keyFrame = new KeyFrame(timeDuration, keyValue);
		
		timeline.getKeyFrames().add(keyFrame);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		
		greet();
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	private int xCoord(){
		return rand.nextInt((800 - 100) + 1) + 100;
	}
	
	private int yCoord(){
		return (int) (Math.random() * (400 - 100) + 100);
	}
}