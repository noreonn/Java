// This is a very simple program about balls, demonstrating Object Orientation in Java
public class Main{
    public static void main(String[] args){
        // Creating a tennis ball object
        Ball tennisBall = new Ball();
        tennisBall.diameter = 5.5;
        tennisBall.colour = "green";

        // Making the tennis ball bounce and roll
        tennisBall.bounce();
        tennisBall.roll();

        // Creating a cricket ball object
        Ball cricketBall = new Ball();
        cricketBall.diameter = 4.2;
        cricketBall.colour = "red";

        // Making the cricket ball bounce and roll
        cricketBall.bounce();
        cricketBall.roll();
    }
}