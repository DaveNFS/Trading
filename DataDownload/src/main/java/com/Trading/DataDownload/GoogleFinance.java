package com.Trading.DataDownload;

public class GoogleFinance {

	// We first from a URL by substituting what's in the [] using this format:
	// http://www.google.com/finance/getprices?i=[PERIOD]&p=[DAYS]d&f=d,o,h,l,c,v&df=cpct&q=[TICKER]
	// i = interval in seconds (how often)
	// p = period in # of days (going back from today)
	// q = ticker symbol for the stock (company name)
	// f = quantities needed: d(date--timestamp+ some_added_value*), o(open), h(high), l(low), c(close), v(volume) 
	
	// some_added_value* => In one day we have 6.5 hours of trading: 
	// so for i= 60 we should have{ 6.5*60 = 390 values } OR one for each minute 
	// for i = 30 we should have {6.5*60*2 = 780 values } OR two for each minute
	
	// MAYBE: df = difference cpct = percent change  
	
	// Example URL:
	// https://www.google.com/finance/getprices?i=60&p=5d&f=d,o,h,l,c,v&df=cpct&q=AAPL
	
	
	
	private String URL; 
	
	
	public String populateURL(int interval, int days, String ticker){
		String url = null;		
		// returns null if the input arguments are invalid
		if(interval < 30){
			// it doesn't work well for more than 2 values in a minute 
			// advised to go with 60 or more
			return null; 
		}
		if(days < 0){
			// can't have a negative number of days
			return null;
		}
		if(ticker == null){
			return null; 
		}
		
		url = "https://www.google.com/finance/getprices?"
				+ "i=" + interval + "&p=" + days + "d&f=d,o,h,l,c,v&df=cpct"
				+ "&q=" + ticker;
		
		return url; 
	}
	
}
