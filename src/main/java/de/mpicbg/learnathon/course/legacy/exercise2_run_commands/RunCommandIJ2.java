package de.mpicbg.learnathon.course.legacy.exercise2_run_commands;

import de.mpicbg.learnathon.course.legacy.ImageNormalizerIJ2Plugin;
import io.scif.services.DatasetIOService;
import net.imagej.Dataset;
import net.imagej.ImageJ;
import org.scijava.command.CommandService;
import org.scijava.ui.UIService;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class RunCommandIJ2
{
	public static void main(String... args) throws IOException
	{
		// setup IJ2 services
		ImageJ imagej = new ImageJ();
		CommandService commandService = imagej.command();
		// setup path
		String path = RunCommandIJ2.class.getResource( "/bridge.tif" ).getFile();
		// open an image
		Dataset image = imagej.scifio().datasetIO().open( path );
		// show gui
		imagej.ui().showUI();

		// The Exercise:
		// 1. Use commandService.run() to run the ImageNormalizerIJ2Plugin
	}
}
