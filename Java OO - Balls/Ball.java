public class Ball {
    // Fields to store diameter and colour of the ball
    public double diameter;
    public String colour;

    // Method to make the ball bounce
    public void bounce(){
        
        if(this.diameter > 5){
            System.out.println("Big Boing when bouncing");
        }
        else{
            System.out.println("Boing when bouncing");
        }
        
    }

    // Method to make the ball roll
    public void roll(){
        System.out.println(this.colour+" blur when rolling");
    }
}
