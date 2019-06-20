package com.emine;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;


public class VideoCapture_003 {
	
	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		String kameraUrl = "rtsp://Admin:1234@192.168.1.34:554/cam0/h264/multicast";
		/*çalýþanlar: 
		 * 
		 * rtsp://Admin:1234@192.168.1.34:554/live/h264/HD1080P
		 * 
		 * 
		 * */
		
		VideoCapture videoCapture = new VideoCapture(kameraUrl);
		
		videoCapture.set(Highgui.CV_CAP_PROP_FRAME_WIDTH, 640);
		videoCapture.set(Highgui.CV_CAP_PROP_FRAME_HEIGHT, 360);
		
		try {
		//videoCapture.open(0); //web cam
    	   videoCapture.open(kameraUrl); 
	
		Mat kameraFoto = new Mat();
		if(videoCapture.isOpened()) {
			System.out.println("açildi");
			videoCapture.read(kameraFoto);
			Highgui.imwrite("C:/Users/MCF Ar-Ge/Downloads/IPkamera_002.JPG", kameraFoto);
			videoCapture.release();
		}
		else {
			System.out.println("AÇILMADI.....");
		}

		
		}catch (Exception e) {
			System.out.println("hata aldi: " + e.toString());
			
			e.printStackTrace();
		}
	}

}
