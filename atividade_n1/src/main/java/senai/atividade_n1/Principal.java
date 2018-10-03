package senai.atividade_n1;

import java.awt.Color;

import org.joda.time.LocalTime;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class Principal {

	public static void main(String[] args) {
		ImagePlus imp = IJ.openImage("E:\\Desktop\\batman.jpg");
		ImageProcessor ip = imp.getProcessor();
		ip.setColor(Color.YELLOW);
		ip.setLineWidth(4);
		ip.drawRect(10, 10, imp.getWidth() - 20, imp.getHeight() - 20);
		imp.show();
		getHorario();
	}
	
	static String getHorario() {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime.toString());
		return currentTime.toString();

	}

}
