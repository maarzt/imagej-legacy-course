package de.mpicbg.learnathon.course.legacy.exercise1_open_and_save;

import net.imglib2.img.Img;
import net.imglib2.type.numeric.RealType;
import net.imglib2.util.Util;

public class Invert
{
	public static <T extends RealType<?> > Img< T > invert( Img< T > image )
	{
		Img< T > output = image.copy();
		T anyPixel = Util.getTypeFromInterval( image );
		double offset = anyPixel.getMinValue() == 0 ? anyPixel.getMaxValue() : 0;
		output.forEach( pixel -> pixel.setReal( offset - pixel.getRealDouble() ) );
		return output;
	}
}
