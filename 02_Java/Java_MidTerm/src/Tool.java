import java.io.IOException;

public class Tool {

    public void clear(){
		//Clears Screen in java
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
				System.out.print("\033\143");
		} catch (IOException | InterruptedException ex) {}
	}


    //Random 文字列生成
    String getRandomString(int i){ 
        String theAlphaNumericS;
        StringBuilder builder;
        
        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789"; 
    
        //create the StringBuffer
        builder = new StringBuilder(i); 
    
        for (int m = 0; m < i; m++) { 
    
            // generate numeric
            int index = (int)(theAlphaNumericS.length() * Math.random()); 
    
            // add the characters
            builder.append(theAlphaNumericS.charAt(index)); 
            } 
    
        return builder.toString(); 
        }
}
