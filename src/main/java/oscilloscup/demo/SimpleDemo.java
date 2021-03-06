/* (C) Copyright 2009-2013 CNRS (Centre National de la Recherche Scientifique).

Licensed to the CNRS under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The CNRS licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.

*/

/* Contributors:

Luc Hogie (CNRS, I3S laboratory, University of Nice-Sophia Antipolis) 

*/

package oscilloscup.demo;

import javax.swing.JFrame;

import oscilloscup.Figure;
import oscilloscup.SwingPlotter;
import oscilloscup.render.ConnectedLineFigureRenderer;

public class SimpleDemo
{
	public static void main(String[] args)
	{
		SwingPlotter plotter = new SwingPlotter();

		Figure f = new Figure();
		f.addPoint(1, 1);
		f.addPoint(1, 2);
		f.addPoint(3, 4);
		f.addRenderer(new ConnectedLineFigureRenderer());

		plotter.getPlot().addFigure(f);

		JFrame frame = new JFrame();
		frame.setContentPane(plotter);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

}
