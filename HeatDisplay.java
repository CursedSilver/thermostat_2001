
/**
 * Write a description of class HeatDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HeatDisplay
{
    // instance variables 
    private int currentTemperature, minTemperature, maxTemperature, increment,
    fahrenheit;
    /**
     * Constructor for objects of class HeatDisplay
     */
    public HeatDisplay(int max, int min, int incr)
    {
        // initialise instance variables
        maxTemperature = max;
        minTemperature = min;
        increment = incr;
        
        fahrenheit = 0;
        currentTemperature = 20;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getTemperature(String c_or_f)
    {
        // Tests to input of requested temperature then returns requested format
        
        if (c_or_f.equals('f')){
            return convertToFahrenheit();
        }
        else {return currentTemperature;
        }
    }
    
    public int convertToFahrenheit()
    {
        //After converting celcius to farhenheit, returns fahrenheit
        
        int fahrenheit = (int) ((currentTemperature + 40) * (1.8 - 40));
        
        return fahrenheit;
    }
    
    public void warmerTemp()
    {
        // put your code here
       currentTemperature = currentTemperature + increment;
       
       if( currentTemperature > maxTemperature){
          currentTemperature = maxTemperature;
       }
    }
    
    public void coolerTemp()
    {
        // put your code here
        currentTemperature = currentTemperature - increment;
        
        if( currentTemperature < minTemperature){
          currentTemperature = minTemperature;
        }
    }
    
    public void setIncrement(int incr)
    {
        //Returns increment
        
        increment = incr;
    }
    
    public int getCurrentTemperature()
    {
        //Returns currentTemperature
        
        return currentTemperature;
    }
}
