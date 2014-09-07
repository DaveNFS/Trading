#!/usr/bin/python

import sys

#print len(sys.argv)
#print str(sys.argv)

def verify_ticker(user_ticker):
    #TODO: implement this!
    return True

def verify_period(input_period):
    #TODO: implement this!
    return True

def verify_interval(input_interval):
    #TODO: implement this!
    return True


#taking user inputs:
input_ticker = raw_input("Please Enter the Ticker symbol: ")

if not verify_ticker(input_ticker):
    sys.exit('Incorrect ticker')

input_period = raw_input("Enter # days from now, for historical data: ")

if not verify_period(input_period):
    sys.exit('Incorrect period')
    
input_interval = raw_input('Enter interval for data samples (seconds): ')

if not verify_interval(input_interval):
    sys.exit('Incorrect interval')
    
print 'done'

     






