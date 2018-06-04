package de.mpicbg.learnathon.course.legacy.exercise4_tables;

import ij.measure.ResultsTable;
import net.imagej.ImageJ;

public class CreateTableExercise
{
	public static void main(String... args) {

		new ImageJ().ui().showUI();
		ResultsTable table = new ResultsTable();

		// we fill the table row by row with information about the largest towns in the world.
		table.incrementCounter();
		table.addValue("Town", "Shanghai");
		table.addValue("Population", 24256800.0);

		table.incrementCounter();
		table.addValue("Town","Karachi");
		table.addValue("Population", 23500000.0);

		table.incrementCounter();
		table.addValue("Town","Bejing");
		table.addValue("Population",21516000.0);

		table.incrementCounter();
		table.addValue("Town","Sao Paolo");
		table.addValue("Population",21292893.0);

		table.show( "Results" );
	}
}
