package de.mpicbg.learnathon.course.legacy.exercise2_run_commands;

import de.mpicbg.learnathon.course.legacy.ImageNormalizerPlugin;
import ij.IJ;
import ij.ImagePlus;

public class RunCommandIJ1
{
	public static void main(String... args) {
		// setup path
		String path = RunCommandIJ1.class.getResource( "/bridge.tif" ).getFile();
		ImagePlus imp = IJ.openImage(path);

		// 1. Run the ImageNormalizerPlugin
		//  - IJ.run() doesn't work from the IDE
		//  - Create an instance of ImageNormalizerPlugin and run it directly
		new ImageNormalizerPlugin().run(imp.getProcessor());

		// Optional:
		//  - Build the binaries with  $ mvn package
		//  - Copy the jar file to Fiji.app/plugins/
		//  - Run Normalisation and Normalisation (IJ2) plugin using IJ.run
	}
}
