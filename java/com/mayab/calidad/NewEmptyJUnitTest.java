package com.mayab.calidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Angel
 */
public class NewEmptyJUnitTest {
     @Before
    public void setUp() throws Exception {
        System.out.print("Termine la prueba");
    }
    @After
    public void tearDown() throws Exception{
        System.out.print("Termine la prueba");
    }
    
    @Test
    public void test(){
       fail("Not yet implemented");
    }
    
    public NewEmptyJUnitTest() {
        
    }
    
}
