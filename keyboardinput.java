public class mainfirstprogram {

	public static void main(String[] args) 
	throws java.io.IOException {
		
		char input;
		
		System.out.println("Enter a single character from the keyboard, the press ENTER: ");	
		
		input = (char) System.in.read();
		
		if(input == '1') System.out.println("You typed the number 1! ");
		if(input != '1') System.out.println("You did not type the number 1!");
		
	}

}
