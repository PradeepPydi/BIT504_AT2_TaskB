
public class Main {

	public static void main(String[] args) {
		System.out.println("Class Object Example\n");
		 
	    // Create an object from the Paddle class
	    Paddle Paddle1 = new Paddle();
	    // Set the properties of this object 
	    // We should really use setters and getters here but for simplicity we are just using public variables of the class 
	    // see encapsulation
	    Paddle1.name = "Paddle1";
	    Paddle1.height = 54; // changed height 
	    Paddle1.width = 160; // changed width 
	    Paddle1.color = "FF00FF";
	 
	    // Create an object from the Paddle class
	    Paddle Paddle2 = new Paddle();
	    // Set properties
	    Paddle2.name = "Paddle2";
	    Paddle2.height = 45; // changed height of the paddle 
	    Paddle2.width = 261; // changed the width 
	    Paddle2.color = "66D91";
	 
	  // Display the attributes of these new Objects  
	 
	  System.out.println("Name:   " + Paddle1.name);
	  System.out.println("height: " + Paddle1.height);
	  System.out.println("width:  " + Paddle1.width);
	  System.out.println("Color:  " + Paddle1.color);
	  System.out.println("");
	 
	  System.out.println("Name:   " + Paddle2.name);
	  System.out.println("height: " + Paddle2.height);
	  System.out.println("width:  " + Paddle2.width);
	  System.out.println("Color:  " + Paddle2.color);
	  System.out.println("");
	 

	}

}
