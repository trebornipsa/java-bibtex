/*
 * Copyright (c) 2012 University of Tartu
 */
package org.jbibtex;

public class KeyFactory {

	private long id = 1L;


	public Key createKey(String value){

		if(value == null){
			value = String.valueOf("jbibtex-" + this.id++);
		}

		return new Key(value);
	}

	public static final KeyFactory DEFAULT = new KeyFactory();
}