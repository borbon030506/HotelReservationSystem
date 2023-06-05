/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kylle
 */
public class tables {
    public static void main (String[] args)
    {
        Connection con = null;
        Statement st = null;
        try
        {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table users(name varchar(200), email varchar(200), password varchar(50), securityQuestion varchar(500), answer varchar(200), address varchar(200), status varchar(20))");
            JOptionPane.showMessageDialog(null,"Table Created Successfully");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
        {
            con.close();
            st.close();
        }
        catch (Exception e)
        {}
        }    
    }
}
