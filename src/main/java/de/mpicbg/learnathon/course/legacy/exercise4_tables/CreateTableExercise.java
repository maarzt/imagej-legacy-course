package de.mpicbg.learnathon.course.legacy.exercise4_tables;

import ij.measure.ResultsTable;
import net.imagej.ImageJ;
import net.imagej.table.DefaultGenericTable;
import net.imagej.table.DoubleColumn;
import net.imagej.table.GenericColumn;
import net.imagej.table.GenericTable;

public class CreateTableExercise
{
	public static void main(String... args) {

		ImageJ imagej = new ImageJ();

		GenericColumn nameColumn = new GenericColumn("Town");
		DoubleColumn populationColumn = new DoubleColumn("Population");

		// we fill the columns with information about the largest towns in the world.
		nameColumn.add("Karachi");
		populationColumn.add(23500000.0);

		nameColumn.add("Bejing");
		populationColumn.add(21516000.0);

		nameColumn.add("Sao Paolo");
		populationColumn.add(21292893.0);

		// but actually, the largest town is Shanghai,
		// so let's add it at the beginning of the table.
		nameColumn.add(0, "Shanghai");
		populationColumn.add(0, 24256800.0);

		// After filling the columns, you can create a table
		GenericTable table = new DefaultGenericTable();

		// and add the columns to that table
		table.add(nameColumn);
		table.add(populationColumn);

		imagej.ui().show( table );
	}
}
