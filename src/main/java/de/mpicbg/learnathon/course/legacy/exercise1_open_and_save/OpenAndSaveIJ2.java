package de.mpicbg.learnathon.course.legacy.exercise1_open_and_save;

import io.scif.services.DatasetIOService;
import net.imagej.Dataset;
import net.imagej.DatasetService;
import net.imagej.ImageJ;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.img.Img;
import net.imglib2.type.numeric.RealType;
import org.scijava.ui.UIService;

import java.io.IOException;

public class OpenAndSaveIJ2
{
	public static void main(String... args) throws IOException
	{
		// setup path
		String path = OpenAndSaveIJ2.class.getResource( "/bridge.tif" ).getFile();
		// setup IJ2 services
		ImageJ imagej = new ImageJ();
		DatasetIOService datasetIOService = imagej.scifio().datasetIO();
		DatasetService datasetService = imagej.dataset();
		UIService uiService = imagej.ui();

		// Beginning of the Exercise:
		// 1. Use datasetIOService to open the image "path".
		Dataset image = datasetIOService.open( path );
		// 2. Use Invert.invert(...) to invert the image.
		Img< RealType<?> > result = Invert.invert( image );
		// 3. Use uiService.show(...) to show the result of the inversion.
		uiService.show( result );
		// 4. Use datasetService.create(...) to create a Dataset from the inverted image.
		Dataset dataset = datasetService.create( ( RandomAccessibleInterval) result );
		// 5. Use datasetIOService to save the result of the inversion to your hard drive.
		datasetIOService.save( dataset, "/home/arzt/test.tif" );
	}
}
