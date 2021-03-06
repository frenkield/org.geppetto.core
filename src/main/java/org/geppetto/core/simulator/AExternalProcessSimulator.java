package org.geppetto.core.simulator;

import java.util.HashMap;
import java.util.Map;

import org.geppetto.core.common.GeppettoExecutionException;
import org.geppetto.core.externalprocesses.ExternalProcess;
import org.geppetto.core.model.ModelInterpreterException;
import org.geppetto.core.model.runtime.AspectNode;
import org.geppetto.core.simulation.IExternalSimulatorCallbackListener;
import org.geppetto.core.simulation.IRunConfiguration;

/**
 * Abstract simulator class for external processes 
 * 
 * @author Jesus R Martinez (jesus@metacell.us)
 *
 */
public abstract class AExternalProcessSimulator extends ASimulator implements IExternalSimulatorCallbackListener{
	
	Map<String, ExternalProcess> externalProcesses = new HashMap<String,ExternalProcess>();

	public void runExternalProcess(String command, String directoryToExecuteFrom,
			String fileToExecute){
		ExternalProcess process = 
				new ExternalProcess(command, directoryToExecuteFrom, fileToExecute, this);
		process.start();
		
		externalProcesses.put(command, process);
	}
	
	@Override
	public void simulate(IRunConfiguration runConfiguration, AspectNode aspect)
			throws GeppettoExecutionException {
		
	}

	@Override
	public boolean populateVisualTree(AspectNode aspectNode)
			throws ModelInterpreterException, GeppettoExecutionException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Map<String, ExternalProcess> getExternalProccesses(){
		return this.externalProcesses;
	}
	

	@Override
	public void processDone(String processCommand) {
		ExternalProcess process = this.externalProcesses.get(processCommand);
		this.getListener().endOfSteps("Process for " + 
				process.getFileToExecute()+ " is done executing");
	}
}
