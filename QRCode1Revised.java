package javafx;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

//*********************************************************************************************************
//Assignment 5 QR Code        Author: Carlos Fernandez/L30031020
//
//Program to generate a sample image QR code using Javafx
//*********************************************************************************************************

public class QRCode1Revised extends Application {
	public void start(Stage initialStage) {
		
		Rectangle rect1 = new Rectangle(0, 0, 512, 512);
		rect1.setStroke(Color.WHITE);
		rect1.setStrokeWidth(20);
		rect1.setFill(Color.WHITE);
		
		Rectangle rect1a = new Rectangle(30, 30, 100, 100);
		rect1a.setStroke(Color.BLACK);
		rect1a.setStrokeWidth(20);
		rect1a.setFill(Color.WHITE);
		
		Rectangle rect1b = new Rectangle(65, 65, 30, 30);
		rect1b.setStroke(Color.BLACK);
		rect1b.setStrokeWidth(20);
		rect1b.setFill(Color.BLACK);
		
		Rectangle rect2a = new Rectangle(380, 30, 100, 100);
		rect2a.setStroke(Color.BLACK);
		rect2a.setStrokeWidth(20);
		rect2a.setFill(Color.WHITE);
		
		Rectangle rect2b = new Rectangle(415, 65, 30, 30);
		rect2b.setStroke(Color.BLACK);
		rect2b.setStrokeWidth(20);
		rect2b.setFill(Color.BLACK);
		
		Rectangle rect3a = new Rectangle(30, 380, 100, 100);
		rect3a.setStroke(Color.BLACK);
		rect3a.setStrokeWidth(20);
		rect3a.setFill(Color.WHITE);
		
		Rectangle rect3b = new Rectangle(65, 415, 30, 30);
		rect3b.setStroke(Color.BLACK);
		rect3b.setStrokeWidth(20);
		rect3b.setFill(Color.BLACK);
		
		Rectangle rect4a = new Rectangle(320, 300, 60, 60);
		rect4a.setStroke(Color.BLACK);
		rect4a.setStrokeWidth(15);
		rect4a.setFill(Color.WHITE);
		
		Rectangle rect4b = new Rectangle(345, 325, 10, 10);
		rect4b.setStroke(Color.BLACK);
		rect4b.setStrokeWidth(15);
		rect4b.setFill(Color.BLACK);
		
		Rectangle dot1 = new Rectangle(180, 30, 10, 10);
		dot1.setStroke(Color.BLACK);
		dot1.setStrokeWidth(10);
		dot1.setFill(Color.BLACK);
		
		Rectangle dot2 = new Rectangle(220, 30, 10, 10);
		dot2.setStroke(Color.BLACK);
		dot2.setStrokeWidth(10);
		dot2.setFill(Color.BLACK);
		
		Rectangle dot3 = new Rectangle(260, 30, 10, 10);
		dot3.setStroke(Color.BLACK);
		dot3.setStrokeWidth(10);
		dot3.setFill(Color.BLACK);
		
		Rectangle dot4 = new Rectangle(340, 30, 10, 10);
		dot4.setStroke(Color.BLACK);
		dot4.setStrokeWidth(10);
		dot4.setFill(Color.BLACK);
		
		Rectangle dot5 = new Rectangle(200, 50, 10, 10);
		dot5.setStroke(Color.BLACK);
		dot5.setStrokeWidth(10);
		dot5.setFill(Color.BLACK);
		
		Rectangle dot6 = new Rectangle(240, 50, 10, 10);
		dot6.setStroke(Color.BLACK);
		dot6.setStrokeWidth(10);
		dot6.setFill(Color.BLACK);
		
		Rectangle dot7 = new Rectangle(280, 50, 10, 10);
		dot7.setStroke(Color.BLACK);
		dot7.setStrokeWidth(10);
		dot7.setFill(Color.BLACK);
		
		Rectangle dot8 = new Rectangle(300, 70, 10, 10);
		dot8.setStroke(Color.BLACK);
		dot8.setStrokeWidth(10);
		dot8.setFill(Color.BLACK);
		
		Rectangle dot9 = new Rectangle(260, 70, 10, 10);
		dot9.setStroke(Color.BLACK);
		dot9.setStrokeWidth(10);
		dot9.setFill(Color.BLACK);
		
		Rectangle dot10 = new Rectangle(240, 70, 10, 10);
		dot10.setStroke(Color.BLACK);
		dot10.setStrokeWidth(10);
		dot10.setFill(Color.BLACK);
		
		Rectangle dot11 = new Rectangle(300, 70, 10, 10);
		dot11.setStroke(Color.BLACK);
		dot11.setStrokeWidth(10);
		dot11.setFill(Color.BLACK);
		
		Rectangle dot12 = new Rectangle(340, 70, 10, 10);
		dot12.setStroke(Color.BLACK);
		dot12.setStrokeWidth(10);
		dot12.setFill(Color.BLACK);
		
		Rectangle dot13 = new Rectangle(240, 200, 50, 50);
		dot13.setStroke(Color.BLACK);
		dot13.setStrokeWidth(10);
		dot13.setFill(Color.BLACK);
		
		Rectangle dot14 = new Rectangle(360, 200, 50, 50);
		dot14.setStroke(Color.BLACK);
		dot14.setStrokeWidth(10);
		dot14.setFill(Color.BLACK);
		
		Rectangle dot15 = new Rectangle(160, 110, 50, 50);
		dot15.setStroke(Color.BLACK);
		dot15.setStrokeWidth(10);
		dot15.setFill(Color.BLACK);
		
		Rectangle dot16 = new Rectangle(340, 400, 50, 50);
		dot16.setStroke(Color.BLACK);
		dot16.setStrokeWidth(10);
		dot16.setFill(Color.BLACK);
		
		Rectangle dot17 = new Rectangle(200, 340, 100, 20);
		dot17.setStroke(Color.BLACK);
		dot17.setStrokeWidth(10);
		dot17.setFill(Color.BLACK);
		
		Rectangle dot18 = new Rectangle(340, 90, 10, 10);
		dot18.setStroke(Color.BLACK);
		dot18.setStrokeWidth(10);
		dot18.setFill(Color.BLACK);
		
		Rectangle dot19 = new Rectangle(180, 90, 10, 10);
		dot19.setStroke(Color.BLACK);
		dot19.setStrokeWidth(10);
		dot19.setFill(Color.BLACK);
		
		Rectangle dot20 = new Rectangle(280, 90, 10, 10);
		dot20.setStroke(Color.BLACK);
		dot20.setStrokeWidth(10);
		dot20.setFill(Color.BLACK);
		
		Rectangle dot21 = new Rectangle(300, 110, 10, 10);
		dot21.setStroke(Color.BLACK);
		dot21.setStrokeWidth(10);
		dot21.setFill(Color.BLACK);
		
		Rectangle dot22 = new Rectangle(240, 110, 10, 10);
		dot22.setStroke(Color.BLACK);
		dot22.setStrokeWidth(10);
		dot22.setFill(Color.BLACK);
		
		Rectangle dot23 = new Rectangle(320, 110, 10, 10);
		dot23.setStroke(Color.BLACK);
		dot23.setStrokeWidth(10);
		dot23.setFill(Color.BLACK);
		
		Rectangle dot24 = new Rectangle(220, 130, 10, 10);
		dot24.setStroke(Color.BLACK);
		dot24.setStrokeWidth(10);
		dot24.setFill(Color.BLACK);
		
		Rectangle dot25 = new Rectangle(280, 130, 10, 10);
		dot25.setStroke(Color.BLACK);
		dot25.setStrokeWidth(10);
		dot25.setFill(Color.BLACK);
		
		Rectangle dot26 = new Rectangle(300, 150, 10, 10);
		dot26.setStroke(Color.BLACK);
		dot26.setStrokeWidth(10);
		dot26.setFill(Color.BLACK);
		
		Rectangle dot27 = new Rectangle(240, 150, 10, 10);
		dot27.setStroke(Color.BLACK);
		dot27.setStrokeWidth(10);
		dot27.setFill(Color.BLACK);
		
		Rectangle dot28 = new Rectangle(320, 150, 10, 10);
		dot28.setStroke(Color.BLACK);
		dot28.setStrokeWidth(10);
		dot28.setFill(Color.BLACK);
		
		Rectangle dot29 = new Rectangle(220, 150, 10, 10);
		dot29.setStroke(Color.BLACK);
		dot29.setStrokeWidth(10);
		dot29.setFill(Color.BLACK);
		
		Rectangle dot30 = new Rectangle(280, 150, 10, 10);
		dot30.setStroke(Color.BLACK);
		dot30.setStrokeWidth(10);
		dot30.setFill(Color.BLACK);
		
		Rectangle dot31 = new Rectangle(295, 165, 10, 10);
		dot31.setStroke(Color.BLACK);
		dot31.setStrokeWidth(10);
		dot31.setFill(Color.BLACK);
		
		Rectangle dot32 = new Rectangle(140, 165, 10, 10);
		dot32.setStroke(Color.BLACK);
		dot32.setStrokeWidth(10);
		dot32.setFill(Color.BLACK);
		
		Rectangle dot33 = new Rectangle(40, 165, 20, 10);
		dot33.setStroke(Color.BLACK);
		dot33.setStrokeWidth(10);
		dot33.setFill(Color.BLACK);
		
		Rectangle dot34 = new Rectangle(420, 165, 30, 10);
		dot34.setStroke(Color.BLACK);
		dot34.setStrokeWidth(10);
		dot34.setFill(Color.BLACK);
		
		Rectangle dot35 = new Rectangle(40, 200, 100, 10);
		dot35.setStroke(Color.BLACK);
		dot35.setStrokeWidth(10);
		dot35.setFill(Color.BLACK);
		
		Rectangle dot36 = new Rectangle(390, 165, 10, 10);
		dot36.setStroke(Color.BLACK);
		dot36.setStrokeWidth(10);
		dot36.setFill(Color.BLACK);
		
		Rectangle dot37 = new Rectangle(350, 165, 10, 10);
		dot37.setStroke(Color.BLACK);
		dot37.setStrokeWidth(10);
		dot37.setFill(Color.BLACK);
		
		Rectangle dot38 = new Rectangle(475, 185, 10, 10);
		dot38.setStroke(Color.BLACK);
		dot38.setStrokeWidth(10);
		dot38.setFill(Color.BLACK);
		
		Rectangle dot39 = new Rectangle(220, 185, 10, 10);
		dot39.setStroke(Color.BLACK);
		dot39.setStrokeWidth(10);
		dot39.setFill(Color.BLACK);
		
		Rectangle dot40 = new Rectangle(280, 185, 10, 10);
		dot40.setStroke(Color.BLACK);
		dot40.setStrokeWidth(10);
		dot40.setFill(Color.BLACK);
		
		Rectangle dot41 = new Rectangle(25, 300, 10, 10);
		dot41.setStroke(Color.BLACK);
		dot41.setStrokeWidth(10);
		dot41.setFill(Color.BLACK);
		
		Rectangle dot42 = new Rectangle(25, 220, 10, 10);
		dot42.setStroke(Color.BLACK);
		dot42.setStrokeWidth(10);
		dot42.setFill(Color.BLACK);
		
		Rectangle dot43 = new Rectangle(40, 240, 20, 10);
		dot43.setStroke(Color.BLACK);
		dot43.setStrokeWidth(10);
		dot43.setFill(Color.BLACK);
		
		Rectangle dot44 = new Rectangle(80, 220, 30, 10);
		dot44.setStroke(Color.BLACK);
		dot44.setStrokeWidth(10);
		dot44.setFill(Color.BLACK);
		
		Rectangle dot45 = new Rectangle(200, 250, 100, 10);
		dot45.setStroke(Color.BLACK);
		dot45.setStrokeWidth(10);
		dot45.setFill(Color.BLACK);
		
		Rectangle dot46 = new Rectangle(200, 300, 10, 10);
		dot46.setStroke(Color.BLACK);
		dot46.setStrokeWidth(10);
		dot46.setFill(Color.BLACK);
		
		Rectangle dot47 = new Rectangle(450, 300, 40, 10);
		dot47.setStroke(Color.BLACK);
		dot47.setStrokeWidth(10);
		dot47.setFill(Color.BLACK);
		
		Rectangle dot48 = new Rectangle(25, 345, 10, 10);
		dot48.setStroke(Color.BLACK);
		dot48.setStrokeWidth(10);
		dot48.setFill(Color.BLACK);
		
		Rectangle dot49 = new Rectangle(80, 345, 40, 10);
		dot49.setStroke(Color.BLACK);
		dot49.setStrokeWidth(10);
		dot49.setFill(Color.BLACK);
		
		Rectangle dot50 = new Rectangle(480, 345, 10, 80);
		dot50.setStroke(Color.BLACK);
		dot50.setStrokeWidth(10);
		dot50.setFill(Color.BLACK);
		
		Rectangle dot51 = new Rectangle(225, 340, 10, 70);
		dot51.setStroke(Color.BLACK);
		dot51.setStrokeWidth(10);
		dot51.setFill(Color.BLACK);
		
		Rectangle dot52 = new Rectangle(255, 400, 10, 60);
		dot52.setStroke(Color.BLACK);
		dot52.setStrokeWidth(10);
		dot52.setFill(Color.BLACK);
		
		Rectangle dot53 = new Rectangle(160, 450, 20, 10);
		dot53.setStroke(Color.BLACK);
		dot53.setStrokeWidth(10);
		dot53.setFill(Color.BLACK);
		
		Rectangle dot54 = new Rectangle(160, 360, 30, 10);
		dot54.setStroke(Color.BLACK);
		dot54.setStrokeWidth(10);
		dot54.setFill(Color.BLACK);
		
		Rectangle dot55 = new Rectangle(160, 380, 100, 10);
		dot55.setStroke(Color.BLACK);
		dot55.setStrokeWidth(10);
		dot55.setFill(Color.BLACK);
		
		Rectangle dot56 = new Rectangle(400, 360, 50, 10);
		dot56.setStroke(Color.BLACK);
		dot56.setStrokeWidth(10);
		dot56.setFill(Color.BLACK);
		
		Rectangle dot57 = new Rectangle(450, 360, 40, 50);
		dot57.setStroke(Color.BLACK);
		dot57.setStrokeWidth(10);
		dot57.setFill(Color.BLACK);
		
		Rectangle dot58 = new Rectangle(455, 245, 10, 10);
		dot58.setStroke(Color.BLACK);
		dot58.setStrokeWidth(10);
		dot58.setFill(Color.BLACK);
		
		Rectangle dot59 = new Rectangle(400, 460, 40, 10);
		dot59.setStroke(Color.BLACK);
		dot59.setStrokeWidth(10);
		dot59.setFill(Color.BLACK);
		
		Rectangle dot60 = new Rectangle(460, 440, 10, 10);
		dot60.setStroke(Color.BLACK);
		dot60.setStrokeWidth(10);
		dot60.setFill(Color.BLACK);
		
		Rectangle dot61 = new Rectangle(380, 470, 10, 10);
		dot61.setStroke(Color.BLACK);
		dot61.setStrokeWidth(10);
		dot61.setFill(Color.BLACK);

		Rectangle dot62 = new Rectangle(320, 470, 30, 10);
		dot62.setStroke(Color.BLACK);
		dot62.setStrokeWidth(10);
		dot62.setFill(Color.BLACK);
		
		Rectangle dot63 = new Rectangle(260, 470, 10, 10);
		dot63.setStroke(Color.BLACK);
		dot63.setStrokeWidth(10);
		dot63.setFill(Color.BLACK);
		
		Rectangle dot64 = new Rectangle(480, 470, 10, 10);
		dot64.setStroke(Color.BLACK);
		dot64.setStrokeWidth(10);
		dot64.setFill(Color.BLACK);
		
		Rectangle dot65 = new Rectangle(180, 470, 10, 10);
		dot65.setStroke(Color.BLACK);
		dot65.setStrokeWidth(10);
		dot65.setFill(Color.BLACK);
		
		Line line1 = new Line(100, 185, 300, 185);
		line1.setStroke(Color.BLACK);
		line1.setStrokeWidth(20);

		Line line2 = new Line(400, 245, 180, 245);
		line2.setStroke(Color.BLACK);
		line2.setStrokeWidth(20);
		
		Line line3 = new Line(180, 420, 460, 420);
		line3.setStroke(Color.BLACK);
		line3.setStrokeWidth(20);
		
		Line line4 = new Line(350, 250, 250, 250);
		line4.setStroke(Color.BLACK);
		line4.setStrokeWidth(20);
		
		Line line5 = new Line(30, 270, 350, 270);
		line5.setStroke(Color.BLACK);
		line5.setStrokeWidth(20);

		Line line6 = new Line(30, 330, 295, 330);
		line6.setStroke(Color.BLACK);
		line6.setStrokeWidth(20);
		
		Group root = new Group(rect1, rect1a, rect1b, rect2a, rect2b, rect3a, rect3b, rect4a, rect4b);
		Group lines = new Group(line1, line2, line3, line4, line5, line6);
		Group dots = new Group(dot1, dot2, dot3, dot4, dot5, dot6, dot7, dot8, dot9, dot10, dot11, dot12, 
				dot13, dot14, dot15, dot16, dot17, dot18, dot19, dot20, dot21, dot22, dot23, dot24, dot25, 
				dot26, dot27, dot28, dot29, dot30, dot31, dot32, dot33, dot34, dot35, dot36, dot37, dot38,
				dot39, dot40, dot41, dot42, dot43, dot44, dot45, dot46, dot47, dot48, dot49, dot50, dot51,
				dot52, dot53, dot54, dot55, dot56, dot57, dot58, dot59, dot60, dot61, dot62, dot63, dot64,
				dot65);
		Group all = new Group (root,dots,lines);
		Scene scene = new Scene(all, 512, 512);
		
		initialStage.setTitle("QR CODE");
		initialStage.setScene(scene);
		initialStage.show();
	}

}