/*******************************************************************************
 * The MIT License (MIT)
 * 
 * Copyright (c) 2011 - 2015 OpenWorm.
 * http://openworm.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MIT License
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/MIT
 *
 * Contributors:
 *     	OpenWorm - http://openworm.org/people.html
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE 
 * USE OR OTHER DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package org.geppetto.core.simulator.services;

import java.util.List;

import org.geppetto.core.beans.SimulatorConfig;
import org.geppetto.core.common.GeppettoExecutionException;
import org.geppetto.core.common.GeppettoInitializationException;
import org.geppetto.core.data.model.VariableList;
import org.geppetto.core.model.IModel;
import org.geppetto.core.model.ModelInterpreterException;
import org.geppetto.core.model.ModelWrapper;
import org.geppetto.core.model.runtime.AspectNode;
import org.geppetto.core.model.runtime.AspectSubTreeNode;
import org.geppetto.core.model.runtime.AspectSubTreeNode.AspectTreeType;
import org.geppetto.core.model.runtime.OBJNode;
import org.geppetto.core.simulation.IRunConfiguration;
import org.geppetto.core.simulation.ISimulatorCallbackListener;
import org.geppetto.core.simulator.ASimulator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OBJSimulatorService extends ASimulator{

	@Autowired
	private SimulatorConfig objSimulatorConfig;
	
	@Override
	public void simulate(IRunConfiguration runConfiguration, AspectNode aspect)
			throws GeppettoExecutionException {
		advanceTimeStep(0, aspect);
		notifyStateTreeUpdated();
	}

	@Override
	public void initialize(List<IModel> models,
			ISimulatorCallbackListener listener)
			throws GeppettoInitializationException, GeppettoExecutionException {
		super.initialize(models, listener);
	}

	@Override
	public VariableList getForceableVariables() {
		return new VariableList();
	}

	@Override
	public VariableList getWatchableVariables() {
		return new VariableList();
	}

	@Override
	public String getName() {
		return this.objSimulatorConfig.getSimulatorName();
	}

	@Override
	public String getId() {
		return this.objSimulatorConfig.getSimulatorID();
	}

	@Override
	public void addWatchVariables(List<String> variableNames) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startWatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopWatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearWatchVariables() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean populateVisualTree(AspectNode aspectNode)
			throws ModelInterpreterException, GeppettoExecutionException {
		OBJNode obj = new OBJNode("OBJ");
		obj.setModel((String) ((ModelWrapper) aspectNode.getModel()).getModel("OBJ"));

		aspectNode.getSubTree(AspectTreeType.VISUALIZATION_TREE).addChild(obj);
		((AspectSubTreeNode) aspectNode.getSubTree(AspectTreeType.VISUALIZATION_TREE)).setModified(true);

		return false;
	}
}
