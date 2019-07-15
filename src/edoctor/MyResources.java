 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edoctor;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import static edoctor.MyResources.getResources;

public class MyResources
{
    public static String getLanguage()
    {
        String lang = Homepage.jComboBox1.getSelectedItem().toString();
        System.out.println("Language from combo box:" +lang);
        String language = null;
        if(lang.equals("Yoruba"))
        {
            language = "yr";
        }
        else if(lang.equals("Ibo"))
        {
            language = "ib";
        }
        else if(lang.equals("Hausa"))
        {
            language = "hs";
        }
        else
        {
            language = "en";
        }

        System.out.println("Language:" +language);
        System.out.println("Language from combo box:" +lang);
        return language;
     }
      public static String getCountry()
    {
        String country = null;
        if(getLanguage().equals("yr"))
        {
            country = "NG";
        }
        else if(getLanguage().equals("ib"))
        {
            country = "NG";
        }
        else if(getLanguage().equals("hs"))
        {
            country = "NG";
        }
        else
        {
            country = "US";
        }
        System.out.println("Country:" +country);
        return country;
     }
      public static Locale getLocale()
      {
          Locale currentLocale;
          currentLocale = new Locale(getLanguage(), getCountry());
          System.out.println("Locale:" +currentLocale.toString());
          return  currentLocale;
      }
     public static ResourceBundle getResources()
     {
         ResourceBundle resources = null;
        try
        {
            resources = ResourceBundle.getBundle("resources/Labels",getLocale());
        }
        catch (MissingResourceException mre)
        {
            System.err.println("resources/Labels.properties not found");
            System.exit(1);
        }

         System.out.println("Resources:" +resources.toString());
        return resources;
     }
}
