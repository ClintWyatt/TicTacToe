/*Author: Clint Wyatt
 * Version: 0.9.7
 * Description: This application is the classic Tictactoe game. This application uses the JavaFx library. 
 * 
 * 
 */

import javafx.application.*;
import javafx.stage.Stage;
import java.util.*;//array list
import javafx.scene.*;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.util.Random;
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe extends Application
{
   
	
   protected Button newGame = new Button("new game");
   public Image xpng = new Image("file:C:\\Users\\tenor\\Desktop\\School\\Computer-Science\\applications\\bin\\X.png");//this may need to be changed if used by someone else. If the images
   //are not showing, find the directory that the X.png file is at on your device
   public Image opng = new Image("file:C:\\Users\\tenor\\Desktop\\School\\Computer-Science\\applications\\bin\\O.png");//this may need to be changed if used by someone else. If the images
   //are not showing, find the directory that the O.png file is at on your device
   public Image graypng = new Image("file:gray.png");
   protected ImageView x1 = new ImageView(xpng);
   protected ImageView o1 = new ImageView(opng);
   protected ImageView x2 = new ImageView(xpng);
   protected ImageView o2 = new ImageView(opng);
   protected ImageView x3 = new ImageView(xpng);
   protected ImageView o3 = new ImageView(opng);
   protected ImageView x4 = new ImageView(xpng);
   protected ImageView o4 = new ImageView(opng);
   protected ImageView x5 = new ImageView(xpng);
   protected ImageView o5 = new ImageView(opng);
   protected ImageView x6 = new ImageView(xpng);
   protected ImageView o6 = new ImageView(opng);
   protected ImageView x7 = new ImageView(xpng);
   protected ImageView o7 = new ImageView(opng);
   protected ImageView x8 = new ImageView(xpng);
   protected ImageView o8 = new ImageView(opng);
   protected ImageView x9 = new ImageView(xpng);
   protected ImageView o9 = new ImageView(opng);
   ArrayList<ImageView> images = new ArrayList<ImageView>();//a array that has images
   Winner Win = new Winner();//object that helps determine the winner
   boolean canPress = true;
   
   //objects for the images
   protected ImageView grayImage = new ImageView(graypng);
   protected Button Button1 = new Button("", grayImage);
   protected Button Button2 = new Button("", grayImage);
   protected Button Button3 = new Button("", grayImage);
   protected Button Button4 = new Button("", grayImage);
   protected Button Button5 = new Button("", grayImage);
   protected Button Button6 = new Button("", grayImage);
   protected Button Button7 = new Button("", grayImage);
   protected Button Button8 = new Button("", grayImage);
   protected Button Button9 = new Button("", grayImage);    
   protected Button NewGame = new Button("New Game");
   public VBox display;
   private int number;
   private int turns = 0;
   public int [][] result = { {-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1} };//used to keep track of the current score
   Label resultLabel = new Label();
   
    public static void Main(String [] args)
    {
    	//launch the application
    	launch(args);
    }
    //@Override
    public void start(Stage primaryStage){
    	
    	
    	
    	
        
        //setting the size for the buttons
        Button1.setMinSize(200, 200);
        Button2.setMinSize(200, 200);
        Button3.setMinSize(200, 200);
        Button4.setMinSize(200, 200);
        Button5.setMinSize(200, 200);
        Button6.setMinSize(200, 200);
        Button7.setMinSize(200, 200);
        Button8.setMinSize(200, 200);
        Button9.setMinSize(200, 200);
        Random randomNumbers = new Random();
        number = randomNumbers.nextInt(10) + 1;//used to help determine who will go first
		

        GridPane grid = new GridPane();
        
        //adding buttons to the grid
        grid.add(Button1, 0, 0); //col 0 ,row 0
        grid.add(Button2, 0, 1);
        grid.add(Button3, 0, 2);
        grid.add(Button4, 1, 0);
        grid.add(Button5, 1, 1);
        grid.add(Button6, 1, 2);
        grid.add(Button7, 2, 0);
        grid.add(Button8, 2, 1);
        grid.add(Button9, 2, 2);
        grid.add(NewGame, 2, 3);
        grid.add(resultLabel, 1, 3);
        
        
    
       
        
       
      //inner class used for the buttons   
      Button1.setOnAction(new EventHandler<ActionEvent>()
      {
				@Override
				public void handle(ActionEvent event) 
				{
					if(result[0][0] == -1 && canPress == true) //if the button has not been pressed and no one has won yet
					{
						if(number %2 ==0)
						{
							
							x1.setFitWidth(200);//setting the X image to the same size as the button
							x1.setPreserveRatio(true);
							grid.add(x1, 0, 0);//adding the X image to the grid pane
							result[0][0] = 1;
							images.add(turns, x1);//adding the image to the array list
							
							if(Win.checkXresult(result) == true)//if the pressed button triggered a winning condition
							{
								resultLabel.setText("X Wins!");
								canPress = false;
							}
						}
						else
						{
							
							o1.setFitWidth(200);
							o1.setPreserveRatio(true);
							grid.add(o1, 0, 0);
							result[0][0] =0;
							images.add(turns, o1);
							if(Win.checkOresult(result) == true)
							{
								resultLabel.setText("O Wins!");
								canPress = false;
							}
						}
						number++;
						turns++;
						
					}
					
				}
    	  
      });
      //inner class for the second button
      Button2.setOnAction(new EventHandler<ActionEvent>()
      {
				@Override
				public void handle(ActionEvent event) 
				{
					if(result[0][1] == -1 && canPress == true) //if the button has not been pressed and no one has won yet
					{
						if(number %2 ==0)
						{
							
							x2.setFitWidth(200);
							x2.setPreserveRatio(true);
							grid.add(x2, 0, 1);//adding the image to the gird
							result[0][1] = 1;//updating the result array 
							images.add(turns, x2);//adding the image to the array list
							if(Win.checkXresult(result) == true)//if the pressed button triggered a winning condition
							{
								resultLabel.setText("X Wins!");
								canPress = false;
							}
						}
						else
						{
							
							o2.setFitWidth(200);
							o2.setPreserveRatio(true);
							grid.add(o2, 0, 1);
							result[0][1] =0;
							images.add(turns, o2);//adding the image to the array list
							if(Win.checkOresult(result) == true)
							{
								resultLabel.setText("O Wins!");
								canPress = false;
							}
						}
						number++;
						turns++;
					}
					
				}
    	  
      });
      Button3.setOnAction(new EventHandler<ActionEvent>()
      {
				@Override
				public void handle(ActionEvent event) 
				{
					if(result[0][2] == -1 && canPress == true) //if the button has not been pressed and no one has won yet
					{
						if(number %2 ==0)
						{
							
							x3.setFitWidth(200);
							x3.setPreserveRatio(true);
							grid.add(x3, 0, 2);//adding the X image to the grid pane
							result[0][2] = 1;
							images.add(turns, x3);//adding the image to the array list
							if(Win.checkXresult(result) == true)//if the pressed button triggered a winning condition
							{
								resultLabel.setText("X Wins!");
								canPress = false;
							}
						}
						else
						{
							
							o3.setFitWidth(200);
							o3.setPreserveRatio(true);
							grid.add(o3, 0, 2);
							result[0][2] =0;
							images.add(turns, o3);//adding the image to the array list
							if(Win.checkOresult(result) == true)
							{
								resultLabel.setText("O Wins!");
								canPress = false;
							}
						}
						number++;
						turns++;
					}
					
				}
    	  
      });
      Button4.setOnAction(new EventHandler<ActionEvent>()
      {
				@Override
				public void handle(ActionEvent event) 
				{
					if(result[1][0] == -1 && canPress == true) //if the button has not been pressed and no one has won yet
					{
						if(number %2 ==0)
						{
							
							x4.setFitWidth(200);
							x4.setPreserveRatio(true);
							grid.add(x4, 1, 0);//adding the X image to the grid pane
							result[1][0] = 1;
							images.add(turns, x4);//adding the image to the array list
							if(Win.checkXresult(result) == true)//if the pressed button triggered a winning condition
							{
								resultLabel.setText("X Wins!");
								canPress = false;
							}
						}
						else
						{
							
							o4.setFitWidth(200);
							o4.setPreserveRatio(true);
							grid.add(o4, 1, 0);
							result[1][0] =0;
							images.add(turns, o4);//adding the image to the array list
							if(Win.checkOresult(result) == true)
							{
								resultLabel.setText("O Wins!");
								canPress = false;
							}
						}
						number++;
						turns++;
					}
					
				}
    	  
      });
      Button5.setOnAction(new EventHandler<ActionEvent>()
      {
				@Override
				public void handle(ActionEvent event) 
				{
					if(result[1][1] == -1 && canPress == true) //if the button has not been pressed and no one has won yet
					{
						if(number %2 ==0)
						{
							
							x5.setFitWidth(200);
							x5.setPreserveRatio(true);
							grid.add(x5, 1, 1);//adding the X image to the grid pane
							result[1][1] = 1;
							images.add(turns, x5);//adding the image to the array list
							if(Win.checkXresult(result) == true)//if the pressed button triggered a winning condition
							{
								resultLabel.setText("X Wins!");
								canPress = false;
							}
						}
						else
						{
							
							o5.setFitWidth(200);
							o5.setPreserveRatio(true);
							grid.add(o5, 1, 1);
							result[1][1] =0;
							images.add(turns, o5);//adding the image to the array list
							if(Win.checkOresult(result) == true)
							{
								resultLabel.setText("O Wins!");
								canPress = false;
							}
						}
						number++;
						turns++;
					}
					
				}
    	  
      });
      Button6.setOnAction(new EventHandler<ActionEvent>()
      {
				@Override
				public void handle(ActionEvent event) 
				{
					if(result[1][2] == -1 && canPress == true) //if the button has not been pressed and no one has won yet
					{
						if(number %2 ==0)
						{
							
							x6.setFitWidth(200);
							x6.setPreserveRatio(true);
							grid.add(x6, 1, 2);//adding the X image to the grid pane
							result[1][2] = 1;
							images.add(turns, x6);//adding the image to the array list
							if(Win.checkXresult(result) == true)//if the pressed button triggered a winning condition
							{
								resultLabel.setText("X Wins!");
								canPress = false;
							}
						}
						else
						{
							
							o6.setFitWidth(200);
							o6.setPreserveRatio(true);
							grid.add(o6, 1, 2);
							result[1][2] =0;
							images.add(turns, o6);//adding the image to the array list
							if(Win.checkOresult(result) == true)
							{
								resultLabel.setText("O Wins!");
								canPress = false;
							}
						}
						number++;
						turns++;
					}
					
				}
    	  
      });
      Button7.setOnAction(new EventHandler<ActionEvent>()
      {
				@Override
				public void handle(ActionEvent event) 
				{
					if(result[2][0] == -1 && canPress == true) //if the button has not been pressed and no one has won yet
					{
						if(number %2 ==0)
						{
							x7.setFitWidth(200);
							x7.setPreserveRatio(true);
							grid.add(x7, 2, 0);//adding the X image to the grid pane
							result[2][0] = 1;
							images.add(turns, x7);//adding the image to the array list
							if(Win.checkXresult(result) == true)//if the pressed button triggered a winning condition
							{
								resultLabel.setText("X Wins!");
								canPress = false;
							}
						}
						else
						{
							
							o7.setFitWidth(200);
							o7.setPreserveRatio(true);
							grid.add(o7, 2, 0);
							result[2][0] =0;
							images.add(turns, o7);//adding the image to the array list
							if(Win.checkOresult(result) == true)
							{
								resultLabel.setText("O Wins!");
								canPress = false;
							}
						}
						number++;
						turns++;
					}
					
				}
    	  
      });
      Button8.setOnAction(new EventHandler<ActionEvent>()
      {
				@Override
				public void handle(ActionEvent event) 
				{
					if(result[2][1] == -1 && canPress == true) //if the button has not been pressed and no one has won yet
					{
						if(number %2 ==0)
						{
							
							x8.setFitWidth(200);
							x8.setPreserveRatio(true);
							grid.add(x8, 2, 1);//adding the X image to the grid pane
							result[2][1] = 1;
							images.add(turns, x8);//adding the image to the array list
							if(Win.checkXresult(result) == true)//if the pressed button triggered a winning condition
							{
								resultLabel.setText("X Wins!");
								canPress = false;
							}
						}
						else
						{
							
							o8.setFitWidth(200);
							o8.setPreserveRatio(true);
							grid.add(o8, 2, 1);
							result[2][1] =0;
							images.add(turns, o8);//adding the image to the array list
							if(Win.checkOresult(result) == true)
							{
								resultLabel.setText("O Wins!");
								canPress = false;
							}
						}
						number++;
						turns++;
					}
					
				}
    	  
      });
      Button9.setOnAction(new EventHandler<ActionEvent>()
      {
				@Override
				public void handle(ActionEvent event) 
				{
					if(result[2][2] == -1 && canPress == true) //if the button has not been pressed and no one has won yet
					{
						if(number %2 ==0)
						{
							
							x9.setFitWidth(200);
							x9.setPreserveRatio(true);
							grid.add(x9, 2, 2);//adding the X image to the grid pane
							result[2][2] = 1;
							images.add(turns, x9);//adding the image to the array list
							if(Win.checkXresult(result) == true)//if the pressed button triggered a winning condition
							{
								resultLabel.setText("X Wins!");
								canPress = false;
							}
							
						}
						else
						{
							
							o9.setFitWidth(200);
							o9.setPreserveRatio(true);
							grid.add(o9, 2, 2);
							result[2][2] =0;
							images.add(turns, o9);//adding the image to the array list
							if(Win.checkOresult(result) == true)
							{
								resultLabel.setText("O Wins!");
								canPress = false;
							}
						}
						number++;
						turns++;
					}
					
				}
    	  
      });
      NewGame.setOnAction(new EventHandler<ActionEvent>()
      {
    	  public void handle(ActionEvent event)
    	  {
    		  //will need a array that holds the images that were added to the gridPane
    		  if(turns !=0)
    		  {
    			  for(int i =0; i < turns; i++)
    			  {
    				  grid.getChildren().remove(images.get(i));
    			  }
    			  images.clear(); //erasing all elements from the array list
    			  //now resetting the result array to -1 in all indexes
    			  for(int i =0; i < 3; i++)
    			  {
    				for(int j =0; j < 3; j++)
    				{
    					result[i][j] = -1;
    				}
    			  
    			  }
    			  turns =0;//resetting the turns to zero
    			  number = randomNumbers.nextInt(10) + 1;//used to help determine who will go first
    			  canPress = true;
    			  resultLabel.setText("");
    		  }
    	  }
    	  
      });
      grid.setHgap(10);//setting the gap between the buttons
      grid.setVgap(10);//setting the gap between the buttons
      Scene scene = new Scene(grid, 700, 700);
      primaryStage.setScene(scene); 
      primaryStage.setTitle("Tic Tac Toe");
      primaryStage.show();
    }

    
 }   

