/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.calidad.actividad3;

import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.awt.List;

import static org.mockito.ArgumentMatchers.anyInt;

import org.hamcrest.Matcher;
//import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.CoreMatchers.nullValue;

public class AccountTest {

	public Account a;
	public int balance;
	public String holder;
	@Before
	public void setupMock() throws Exception {
		a = Mockito.mock(Account.class);
	}
	@After
	public void tearDown() throws Exception{
	}
	@Test
	public void testSaldo() {
	when(a.debit(balance)).thenReturn("alfo");
	//verify(a).
	}
	@Test
	public void whenAddCalledAnswered() {
		a = Mockito.mock(Account.class);
	    doAnswer((Answer) invocation -> {
	        Object arg0 = invocation.getArgument(0);
	        Object arg1 = invocation.getArgument(1);
	         
	        assertEquals(3, arg0);
	        assertEquals("answer me", arg1);
	        return null;
	    }).when(a).add(any(Integer.class), any(String.class));
	    a.add(3, "answer me");
	}
	public void testAnswer() 
	{
		when(dependency.addTwo(anyInt())).thenAnswer(
		new Answer<Integer>(){
			public Integer answer(InvocationOnMock invocation) 
					throws Throwable
			{
				Object arg0 = invocation.getArgument(0);
		        Object arg1 = invocation.getArgument(1);
		         
		        assertEquals(3, arg0);
		        assertEquals("answer me", arg1);
		        return null;
			}
		});
	}
}