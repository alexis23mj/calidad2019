/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.calidad.mockito.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Angel
 */
public class TestAlumnoDAO {
    public Alumno alumno;
    
    @Before
    public void setUpMock(){
        alumno= Mockito.mock(Alumno.class);
    }
    
    
    @Test
    void addAlumnoTest(){
        
    }
    
    public TestAlumnoDAO() {
    }
    
}
