
import urllib2

# download page source raw, taking in url as input argument
def download_page_source(url_string):
    response = urllib2.urlopen(url_string)
    page_srouce = response.read()
    response.close()
    print page_srouce
    
    
# executing our instructions
url_string = 'http://www.google.com/finance/getprices?i=60&p=10d&f=d,o,h,l,c,v&df=cpct&q=IBM'
download_page_source(url_string)