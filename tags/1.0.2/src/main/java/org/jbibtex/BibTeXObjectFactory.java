/*
 * Copyright (c) 2012 University of Tartu
 */
package org.jbibtex;

public class BibTeXObjectFactory {

	public BibTeXComment createComment(StringValue value){
		return new BibTeXComment(value);
	}

	public BibTeXEntry createEntry(Key type, Key key){
		return new BibTeXEntry(type, key);
	}

	public BibTeXInclude createInclude(StringValue value, BibTeXDatabase database){
		return new BibTeXInclude(value, database);
	}

	public BibTeXPreamble createPreamble(Value value){
		return new BibTeXPreamble(value);
	}

	public BibTeXString createString(Key key, Value value){
		return new BibTeXString(key, value);
	}

	public static final BibTeXObjectFactory DEFAULT = new BibTeXObjectFactory();
}