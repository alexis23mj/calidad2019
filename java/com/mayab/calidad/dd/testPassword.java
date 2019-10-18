/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.calidad.dd;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
/**
 *
 * @author Angel
 */
public class testPassword {
    private password password;
    
    @Before
    public void init(){
        password  = new password();
    }
    @Test
    public void testNull(){
      password p1= new password("kfdjah");
      assertNotNull(p1);
    }
    public void testCapital(){
        password p1 = new password("sdgdg");
    }
    
    
    public testPassword() {
    }
    
}
