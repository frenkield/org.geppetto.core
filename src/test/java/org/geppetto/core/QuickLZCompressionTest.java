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
package org.geppetto.core;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.geppetto.core.common.QuickLZ;
import org.junit.Test;

/**
 * @author matteocantarelli
 *
 */
public class QuickLZCompressionTest
{

	@Test
	public void testCompressionLevel1() throws IOException
	{
		testCompression(1,"/elasticscene.txt");
		testCompression(1,"/smallscene.txt");
		testCompression(1,"/elasticscene2.txt");
		testCompression(1,"/elasticscene.txt");
		testCompression(1,"/smallscene.txt");
		testCompression(1,"/elasticscene.txt");
		testCompression(1,"/elasticscene2.txt");
		testCompression(1,"/smallscene.txt");
	}
	
	
	@Test
	public void testCompressionLevel3() throws IOException
	{
		testCompression(3,"/elasticscene.txt");
		testCompression(3,"/smallscene.txt");
		testCompression(3,"/elasticscene2.txt");
		testCompression(3,"/elasticscene.txt");
		testCompression(3,"/smallscene.txt");
		testCompression(3,"/elasticscene.txt");
		testCompression(3,"/elasticscene2.txt");
		testCompression(3,"/smallscene.txt");
	}
	
	@Test
	public void testCiao()
	{
		String giao="GIAO MI CHIAMO GIAO";
		String compressed=new String(QuickLZ.compress(giao.getBytes(),3));
		System.out.println(compressed.getBytes());
	}
	
	private void testCompression(int level, String resource) throws IOException
	{
		URL url = this.getClass().getResource(resource);
		String model=new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();
		long start=System.currentTimeMillis();
		String compressed=new String(QuickLZ.compress(model.getBytes(), level));
		System.out.println("Compressed at Level "+level+ " in "+((long)System.currentTimeMillis()-start)+"ms. Original size:"+model.length()+" Compressed size:"+compressed.length());
	}

}
