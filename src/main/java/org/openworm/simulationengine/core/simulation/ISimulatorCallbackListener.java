/**
 * 
 */
package org.openworm.simulationengine.core.simulation;

import java.util.List;

import org.openworm.simulationengine.core.model.IModel;

/**
 * @author matteocantarelli
 *
 */
public interface ISimulatorCallbackListener {

	void resultReady(final List<IModel> models);
	
	
}
