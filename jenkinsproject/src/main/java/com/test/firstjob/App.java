package com.test.firstjob;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App app = new App();
        System.out.println( app.getString("Hello World ") );
    }
    
    public String getString(String string) {
    	return string;
    }
}
