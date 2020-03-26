/*
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRcode {
	public static void main(String[] args) throws Exception {
		String page="https://sureshmuruga.github.io/";
		ByteArrayOutputStream out = QRcode.from(page).to(ImageType.PNG).stream();
		File fi=new File("F:\\eclipse\\ec_workspace\\QR_code_genderator\\QR_package\\my.png");
		FileOutputStream fos = new FileOutputStream(fi);
		fos.write(out.toByteArray());
		fos.flush();
		

	}
	

}

*/

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 * 
 */

/**
 * @author Garvit Kothari
 *
 */
public class QRcode{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String page="https://sureshmuruga.github.io/";
		ByteArrayOutputStream out =  QRCode.from(page).to(ImageType.JPG).stream();
		
		File fi=new File("F:\\eclipse\\ec_workspace\\QR_code_genderator\\QR_package\\my.png");
		FileOutputStream fos = new FileOutputStream(fi);
		
		fos.write(out.toByteArray());
		
		BufferedImage img = ImageIO.read(fi);
        JLabel label = new JLabel(new ImageIcon(img));
	    JFrame frame = new JFrame("Image");
	    frame.setSize(300,300);
	    frame.add(label);
        frame.setFocusable(true);
        frame.setVisible(true);
        
		fos.flush();
		
		fos.close();
		
	}

}
