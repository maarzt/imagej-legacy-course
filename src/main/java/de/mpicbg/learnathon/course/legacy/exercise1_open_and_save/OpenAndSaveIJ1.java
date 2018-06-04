package de.mpicbg.learnathon.course.legacy.exercise1_open_and_save;

import ij.IJ;
import ij.ImagePlus;
import net.imglib2.img.Img;
import net.imglib2.img.display.imagej.ImageJFunctions;
import net.imglib2.type.numeric.RealType;

public class OpenAndSaveIJ1
{
	public static void main(String... args) {
		// Setup path
		String path = OpenAndSaveIJ1.class.getResource( "/bridge.tif" ).getFile();

		// Beginning of the exercise:
		// 1. Use IJ.open(...) to open the image as ImagePlus.
		// 2. Use ImageJFunctions.wrapReal to convert the ImagePlus to Img.
		Img<? extends RealType<?> > img = null;
		// 3. Use Invert.invert(...) to invert the Img.
		Img<? extends RealType<?> > result = null;
		// 4. Use ImageJFunctions.wrap(image, "title") to convert the Img to ImagePlus
		// 5. Use imagePlus.show() to show the inverted image.
		// 6. Save the result with IJ.save(...).
	}
}
