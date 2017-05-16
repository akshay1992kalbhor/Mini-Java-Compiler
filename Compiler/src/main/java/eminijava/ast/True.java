package eminijava.ast;

import eminijava.lexer.JSymbol;
import eminijava.visitor.IBranchVisitor;

public class True extends Expression {

	public True(JSymbol jSymbol) {
		super(jSymbol);
	}

	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}

	@Override
	public <R> R accept(IBranchVisitor<R> v, String nTrue, String nFalse) {
		return v.visit(this, nTrue, nFalse);
	}

}
