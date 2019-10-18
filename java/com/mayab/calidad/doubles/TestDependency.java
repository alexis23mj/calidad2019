/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.calidad.doubles;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.mockito.ArgumentMatchers.anyInt;

/**
 *
 * @author Angel
 */
public class TestDependency {
Dependency d;
	@Before
	public void setUp() throws Exception {
		//d = new Dependency(null);
		 d = Mockito.mock(Dependency.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDummy() {
		//fail("Not yet implemented");
		assertThat(d.getClassName(), is(nullValue()));
	}
	@Test
	public void testClassName() {
		when(d.getClassName()).thenReturn("Hola mundo");
		assertThat(d.getClassName(),is(equalTo("Hola mundo")));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testException() {
		when(d.getClassName()).thenThrow(IllegalArgumentException.class);
		d.getClassName();
	}@Test
	public void testAddTwo() {
		when(d.addTwo(4)).thenReturn(6);
		assertThat(d.addTwo(4),is(equalTo(6)));
		when(d.addTwo(anyInt())).thenReturn(53);
		assertThat(d.addTwo(anyInt()),is(equalTo(53)));
	}
	@Test
	public void testAnswer() {
		when(d.addTwo(anyInt())).thenAnswer(
				new Answer<Integer>() {
			public Integer answer(InvocationOnMock invocation) throws Throwable{
				int sumando = (Integer) invocation.getArguments()[0];
				return sumando + 20;
			}
		});
		//assertEquals(30, d.addTwo(10));
		assertThat(d.addTwo(10),is(equalTo(30)));
	}
	@Test
	public void testNameClassNameUpperCase() {
		when(d.getClassNameUpperCase()).thenAnswer(
				new Answer() {
					public String answer(InvocationOnMock invocation) throws Throwable{
						String resultado = "Clase en Mayusculas";
						String str = invocation.getMock().getClass().toString();
						String[] arrOfStr = str.split("\\$");
						String nameClass = arrOfStr[0];
						resultado = resultado + ":"+nameClass.toUpperCase();
						return resultado;
					}
				}	
				);
		assertThat(d.getClassNameUpperCase(),
				is(equalTo("Clase en Mayusculas:CLASS COM.MAYAB.CALIDAD.DOUBLES.DEPENDENCY")));
	}

}
