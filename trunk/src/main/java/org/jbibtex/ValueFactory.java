/*
 * Copyright (c) 2012 University fo Tartu
 */
package org.jbibtex;

public class ValueFactory {

	public ConcateValue createConcateValue(Value left, Value right){
		return new ConcateValue(left, right);
	}

	public CrossReferenceValue createCrossReferenceValue(Value value, BibTeXEntry entry){
		return new CrossReferenceValue(value, entry);
	}

	public DigitStringValue createDigitStringValue(String string){
		return new DigitStringValue(string);
	}

	public KeyValue createKeyValue(String string){
		return new KeyValue(string);
	}

	public ReferenceValue createReferenceValue(KeyValue value, BibTeXString string){
		return new ReferenceValue(value, string);
	}

	public StringValue createStringValue(String string, StringValue.Style style){
		return new StringValue(string, style);
	}

	public static final ValueFactory DEFAULT = new ValueFactory();
}