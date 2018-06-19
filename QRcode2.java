import com.google.zxing.BarcodeFormat;

import com.google.zxing.WriterException;

import com.google.zxing.common.ByteMatrix;

import com.google.zxing.qrcode.QRCodeWriter;

import javafx.application.Application;

import javafx.embed.swing.SwingFXUtils;

import javafx.scene.Scene;

import javafx.scene.image.ImageView;

import javafx.scene.layout.StackPane;

import javafx.stage.Stage;

import java.awt.Color;

import java.awt.Graphics2D;

import java.awt.image.BufferedImage;

import java.io.File;

import java.io.IOException;

import javax.imageio.ImageIO;

//*********************************************************************************************************
//Assignment 5 QR Code Maker        Author: Carlos Fernandez/L30031020
//
//Program to generate QR code using JavaFX
//*********************************************************************************************************

public class QRcode2 extends Application {

	public void start(Stage initialStage) throws WriterException, IOException {

		String qrCodeText = "Java is sweet";

		String filePath = "C:\\Users\\CFERNANDEZ\\Documents\\jpeg.png";

		int size = 512;

		String fileType = "jpeg";

		File qrFile = new File(filePath);

		System.out.println("QR code generated!!!");


		QRCodeWriter qrCodeWriter = new QRCodeWriter();

		ByteMatrix byteMatrix = qrCodeWriter.encode(qrCodeText, BarcodeFormat.QR_CODE, size, size);

		int matrixWidth = byteMatrix.getWidth();

		BufferedImage qrOutput = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);

		qrOutput.createGraphics();

		Graphics2D image = (Graphics2D) qrOutput.getGraphics();

		image.setColor(Color.WHITE);

		image.fillRect(0, 0, matrixWidth, matrixWidth);

		image.setColor(Color.BLACK);

		for (int a = 0; a < matrixWidth; a++) {

			for (int b = 0; b < matrixWidth; b++) {

				if (byteMatrix.get(a, b) == 0) {

					image.fillRect(a, b, 1, 1);

				}

			}

		}

		ImageIO.write(qrOutput, fileType, qrFile);

		ImageView qrImage = new ImageView();

		qrImage.setImage(SwingFXUtils.toFXImage(qrOutput, null));

		StackPane root = new StackPane();

		root.getChildren().add(qrImage);

		Scene box = new Scene(root, size, size);

		initialStage.setTitle("QR code maker");

		initialStage.setScene(box);

		initialStage.show();

	}

	public static void main(String[] args) {

		launch(args);

	}

}