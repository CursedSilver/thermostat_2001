
/**
 * Write a description of class HeatDisplay here.
 * The class controls the temperature by increasing ordecreasing it by set increments and displays the new Temperature in Farenheit or Celcieus.
 * @author (John Gillespie & Hussein AbdelRahman)
 * @version (23rd Sep. 2018)
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
            return convertToFahrenheit() + 'F';
        }
        else {return currentTemperature + 'C';
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
        if(incr < 0){
            incr = incr * -1;
        }
        increment = incr;
        
    }
    
    public int getCurrentTemperature()
    {
        //Returns currentTemperature
        return currentTemperature;
    }
}
