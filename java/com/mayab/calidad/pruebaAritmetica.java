/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.calidad;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


/**
 *
 * @author Angel
 */
public class pruebaAritmetica {
    private aritmetica aritmetica;
    
    @BeforeClass
    public void init(){
        aritmetica= new aritmetica();
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("Inicie la prueba");
    }	
    @After
    public void tearDown() throws Exception {
        System.out.println("Termine la prueba");	
    }
    @Test
    public void testSuma(){
        //assertEquals(2, aritmetica.suma(1,1),0);
        assertThat(aritmetica,notNullValue());
        assertThat(aritmetica.suma(2,3), is (5.0f));
    }
    @Test
    public void testResta(){
        //assertEquals(3,aritmetica.resta(3,1),0);
        assertThat(aritmetica,notNullValue());
        assertThat(aritmetica.resta(5,3), is (2.0f));
    } 
    @Test
    public void testMultiplicacion(){
        assertThat(aritmetica,notNullValue());
        assertThat(aritmetica.multiplicacion(5,3), is (15.0f));
    }
    @Test

    public void testDivision(){
        assertThat(aritmetica.division(4, 2), is(2.0f));
    }
    
    
    public pruebaAritmetica() {
    }
    
}
