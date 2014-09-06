package com.Trading.DataDownload;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        GoogleFinance gf = new GoogleFinance(); 
        gf.url = gf.populateURL(60, 1, "APPL"); 
        
        //System.out.println(gf.getData());
        System.out.println(gf.getDataTwo());
    }
}
