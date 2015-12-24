package controller;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;

/*
 * Author: Daryll David E. Dagondon
 * class: MyController
 */

public class MyController
{
	private Main app;
	private int count = 9;
	
	@FXML
	private Text txtCount;
	
	@FXML
	private MenuItem miTree,
	miSockGreen,
	miSockWhite,
	miBallWhite,
	miBallGreen;
	
	@FXML
	public void initialize(){}
	
	public void setApp(Main app){
		this.app = app;
	}
	
	@FXML
	public void treeAction()
	{
		app.tree();
		miTree.setDisable(true);
		set();
	}
	
	@FXML
	public void sockWhiteAction()
	{
		app.sock(true);
		set();
		
		if(count == 0)
			disable();
	}
	
	public void disable()
	{
		miSockWhite.setDisable(true);
		miSockGreen.setDisable(true);
		miBallWhite.setDisable(true);
		miBallGreen.setDisable(true);
		
		try
		{
			Thread.sleep(2500);
			app.result();
		}
		catch(InterruptedException exception){
			exception.printStackTrace();
		}
	}
	
	@FXML
	public void sockGreenAction()
	{
		app.sock(false);
		set();
		
		if(count == 0)
			disable();
	}
	
	@FXML
	public void ballWhiteAction()
	{
		app.ball(false);
		set();
		
		if(count == 0)
			disable();
	}
	
	@FXML
	public void ballGreenAction()
	{
		app.ball(true);
		set();
		
		if(count == 0)
			disable();
	}
	
	@FXML
	public void aboutAction()
	{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Christmas Tree");
		alert.setHeaderText("About");
		alert.setContentText("Author: Daryll David E. Dagondon");
		alert.showAndWait();
		
		/*new Thread(new Runnable()
        {
            @Override
            public void run()
            {
        		Platform.runLater(new Runnable(){
                    @Override
                    public void run()
                    {
                    	alert.setTitle("Christmas Tree");
                		alert.setHeaderText("About");
                		alert.setContentText("Author: Daryll David E. Dagondon");
                		alert.showAndWait();
                    }
                });
            }
        }).start();*/
	}
	
	@FXML
	public void testAction(){}
	
	private void set()
	{
		--count;
		txtCount.setText(count+"");
		
		if(count == 1)
			txtCount.setText("Merry\nChristmas!");
	}
	
	@FXML
	public void closeAction(){
		app.closeTree();
	}
}