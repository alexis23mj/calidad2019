/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.calidad.dbUnit;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.junit.Test;
import static org.junit.Assert.*;
import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;

/**
 *
 * @author Angel
 */
public class alumnoDbTest extends DBTestCase {
    
    public String URL="jdbc:mysql://localhost:3306/calidad2"+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public alumnoDbTest(String name){
        super(name);
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "com.mysql.jdbc.Driver");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, URL);
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "root");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "FoXterr1er");
            try{
                Connection con= DriverManager.getConnection(URL, "root", "FoXterr1er");
                Statement st;
                st= con.createStatement();
                int isEx = st.executeUpdate("INSERT INTO alumno2(alumno_name,alumno_LastNameP,age,average) VALUES" +"('Alex','Diaz',19,8.7);");
                con.close(); 
            }catch (Exception e){
                e.printStackTrace();
            }

    }

    
    public alumnoDbTest() {
    }

    @Override
    protected IDataSet getDataSet() throws Exception {
        
        InputStream xmlFile= getClass().getResourceAsStream("/data.xml");
        
        return new FlatXmlDataSetBuilder().build(xmlFile);
        
    }
    @Before
    public void setUp() throws Exception{
       super.setUp();
        IDatabaseConnection conn= getConnection();
        try{
            DatabaseOperation.CLEAN_INSERT.execute(conn, getDataSet());
        }finally{
            conn.close();
        }
    }
    @Test
    public void test1() throws Exception {
        IDatabaseConnection conn = getConnection();
        assertEquals(0, conn.getRowCount("alumno2"));
        conn.close();
    }
    
    
}
