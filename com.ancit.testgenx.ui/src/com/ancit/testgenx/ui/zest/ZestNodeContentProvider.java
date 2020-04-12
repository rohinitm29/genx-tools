package com.ancit.testgenx.ui.zest;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;
import org.eclipse.zest.core.viewers.INestedContentProvider;

import DiagonosticModel.CAPLTestStep;
import DiagonosticModel.ForLoop;
import DiagonosticModel.TestStep;
import DiagonosticModel.WhileLoop;

public class ZestNodeContentProvider extends ArrayContentProvider
		implements IGraphEntityContentProvider, INestedContentProvider {

	@Override
	public Object[] getConnectedTo(Object entity) {
		if (entity instanceof TestStep) {
			TestStep node = (TestStep) entity;
			return new Object[] { node.getNextStep() };
		}

		return new Object[] {};
//		throw new RuntimeException("Type not supported");
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof WhileLoop) {
			return ((WhileLoop) element).getTestSteps().size() > 0;
		} else if (element instanceof ForLoop) {
			return ((ForLoop) element).getTestSteps().size() > 0;
		} else if (element instanceof CAPLTestStep) {
			return ((CAPLTestStep) element).getParameters().size() > 0;
		}
		return false;
	}

	@Override
	public Object[] getChildren(Object element) {
		if (element instanceof WhileLoop) {
			return ((WhileLoop) element).getTestSteps().toArray();
		} else if (element instanceof ForLoop) {
			return ((ForLoop) element).getTestSteps().toArray();
		} else if (element instanceof CAPLTestStep) {
			return ((CAPLTestStep) element).getParameters().toArray();
		}
		return null;
	}

}