package hashmapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{

    public static void main(String[] args) 
    {
        HashMap<String,String> capitalCities = new HashMap<String,String>();
      
        capitalCities.put("Greece", "Athens");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("France","Paris");

        
        String x = capitalCities.get("France");
        System.out.println("H πρωτεύουσα είναι..."+x);
        
        //capitalCities.remove("England");
        //capitalCities.clear();
        int num = capitalCities.size();
        System.out.println("το hashmap 'εχει " + num + " ζεύγη");
        
        for (String s : capitalCities.keySet())
        {
            System.out.println(s);
        
          
        for (String s : capitalCities.values())
        {
            System.out.println(s);
        }
          
        for (String s : capitalCities.keySet())
        {
            System.out.println("key: "+s+", value: "+capitalCities.get(s));
        }
          
        System.out.println("");
          
        for (Map.Entry me : capitalCities.entrySet())
        {
            //System.out.println("key: " + me.getKey() + ", value: " + me.getValue());
            System.out.println(me);
        }
        
    }
    
}
