//import API's needed here:

public class Problem 
{  
        public static void main(String args[ ]) 
        {
            for (double i = 40.0; i >= 31.0; i--){
                System.out.printf("%6.1f %6.1f\n", i, celsiusToFahrenheit(i));
            }
			
         } //closing main method
        public static double celsiusToFahrenheit(double celsius){
            double fahrenheit = (9.0 / 5) * celsius + 32;
            return fahrenheit;
        }

        public static double fahrenheitToCelsius(double fahrenheit){
            double celsius = (5.0 / 9) * (fahrenheit - 32);
            return celsius;
        }
} //closing class header