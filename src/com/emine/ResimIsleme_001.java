package com.emine;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;
import org.opencv.imgproc.Imgproc;

public class ResimIsleme_001 {
	public static void main(String [] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		//Mat img = new Mat();
		//img = Highgui.imread("C:/Users/MCF Ar-Ge/Downloads/IMG-4522.JPG");
		
		//Core.rectangle(img, new Point(50,100), new Point(100,200), new Scalar(44,22,22));
		//Core.putText(img, "MCF", new Point(60,100), 1, 5, new Scalar(44,22,22));
		//Highgui.imwrite("C:/Users/MCF Ar-Ge/Downloads/yeniResim.JPG", img);
		//System.out.println("çizim tamamlandi");
		
		VideoCapture vcp = new VideoCapture();
		vcp.open(0);
		Mat kameraImg = new Mat();
		System.out.println("kamera açilacak");
		if(vcp.isOpened()) {
			System.out.println("kamera açildi");
			vcp.read(kameraImg);
			Highgui.imwrite("C:/Users/MCF Ar-Ge/Downloads/kamera_001.JPG", kameraImg);
			vcp.release();
		}
		System.out.println("Alindi");
			
		 
	}
	

}
