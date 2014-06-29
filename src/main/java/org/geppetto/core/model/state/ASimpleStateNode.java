/*******************************************************************************
 * The MIT License (MIT)
 * 
 * Copyright (c) 2011, 2013 OpenWorm.
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
package org.geppetto.core.model.state;

import java.util.ArrayList;
import java.util.List;

import org.geppetto.core.model.values.AValue;

/**
 * Abstract node used for nodes that don't have other nodes as children, a leaf node.
 * 
 * @author matteocantarelli
 * 
 */
@SuppressWarnings("rawtypes")
public abstract class ASimpleStateNode extends ANode
{

	private List<AValue> _values = new ArrayList<AValue>();;
	private String _unit;
	private String _scalingFactor;

	public ASimpleStateNode(String name)
	{
		super(name);
	}

	public ASimpleStateNode(){
		
	}
	
	@Override
	public String toString()
	{
		return _name + "[" + _values + "]";
	}

	public void addValue(AValue value)
	{
		value.setParentNode(this);
		_values.add(value);
	}

	public List<AValue> getValues()
	{
		return _values;
	}

	public AValue consumeFirstValue()
	{
		if(_values.size() == 0)
		{
			return null;
		}
		AValue first = _values.get(0);
		_values.remove(0);
		return first;
	}

	public void setUnit(String unit)
	{
		this._unit = unit;
	}

	public String getUnit()
	{
		return _unit;
	}

	public String getScalingFactor()
	{
		return _scalingFactor;
	}

	public void setScalingFactor(String scalingFactor)
	{
		this._scalingFactor = scalingFactor;
	}

}
