package model;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/*
 * Author: Daryll David E. Dagondon
 * class: Ball
 */

public class Ball extends ImageView
{
	private double dragBaseX;
	private double dragBaseY;
	
	// constructor
	public Ball(Image image, int x, int y, int fitHeight, int fitWidth)
	{
		super(image);
		
		setX(x);
		setY(y);
		setFitHeight(fitHeight);
		setFitWidth(fitHeight);
		
		setOnMousePressed(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event)
			{
				dragBaseX = event.getX() - getLayoutX();
				dragBaseY = event.getY() - getLayoutY();
				//dragBaseX = event.getSceneX();
				//dragBaseY = event.getSceneY();
			}
		});
		
		setOnMouseDragged(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event)
			{
				setTranslateX(event.getSceneX() - dragBaseX);
				setTranslateY(event.getSceneY() - dragBaseY);
			}
		});
	}
}