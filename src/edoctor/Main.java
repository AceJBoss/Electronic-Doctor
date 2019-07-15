/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edoctor;

import javax.swing.UIManager;


public class Main 
{    
     public static void setLaf()
     {
        UIManager.LookAndFeelInfo[] lafInfo = UIManager.getInstalledLookAndFeels();
        try
        {
            for (UIManager.LookAndFeelInfo lookAndFeelInfo : lafInfo)
            {
                if (lookAndFeelInfo.getName().equals("Nimbus"))
                {
                    UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
                }
            }
        } 
        catch (Exception ex)
        {
        }
    }     
    public static void main(String[] args)
    {
        //create the database and tables needed for the application if they don no already exist
        DataBaseHandler dbh = new DataBaseHandler();
        dbh.loadDriver();
        dbh.createDataBase("vda");
        dbh.creatTable1("appointment");
        dbh.creatTable2("billing");
        //dbh.creatTable3("diagnose");
        dbh.creatTable4("doctortb");
        dbh.creatTable5("healthcarehistory");
        dbh.creatTable6("medicaladvice");
        dbh.creatTable7("patienttb");
        dbh.creatTable8("pharmacy");
        dbh.creatTable9("prescription");
        dbh.creatTable10("DiagnoseTb");
        setLaf();

        new Starter().setVisible(true);

        //memory clean up...
        dbh = null;
    }
}
