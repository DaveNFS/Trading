import urllib2


#get data from google finance 
#see other documentation about the formation of the url 
url = 'http://www.google.com/finance/getprices?i=30&p=1d&f=d,o,h,l,c,v&df=cpct&q=IBM'
response = urllib2.urlopen(url)
source_page = response.read()
lines = source_page.split('\n')


for line in lines:
    print line