/*
 * Copyright (c) 2012 University of Tartu
 */
package org.jbibtex;

public class KeyFactory {

	public Key createKey(String value){
		return new Key(value);
	}

	public static final KeyFactory DEFAULT = new KeyFactory();
}