package javaapplication1;

// Nicolas getting us started on first question, Java assignment 4.

public class Day {

    // Member variable.
    private int dayNumber;
    
    public Day(String dayName)
    {
        // Below is something that Nicolas does when later needs to add more 
        // code, and wants to remind himself
        // To do: 
        
        // Now it's later. One constructor:
        dayNumber = fromString(dayName);
    }
    
    // Converting from a string to a number
    private static int fromString(String name)
    {
        switch (name)
        {
            case "SUN": return 0;
            case "MON": return 1;
            case "TUE": return 2;
            case "WED": return 3;
            case "THU": return 4;
            case "FRI": return 5;
            case "SAT": return 6;
            default: return -1;
        }
            
    }
    
      
    
    
    // Converting from a number to a string
    private static String toString(int dayNumber)
    {
        switch(dayNumber)
        {
            case 0: return "SUN";
            case 1: return "MON";
            case 2: return "TUE";
            case 3: return "WED";
            case 4: return "THU";
            case 5: return "FRI";
            case 6: return "SAT";
            default: return "";
        }
    }

    
    
    public String toString()
            
    {
        return toString(dayNumber);
    }
    
}
