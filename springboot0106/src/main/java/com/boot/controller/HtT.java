package com.boot.controller;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.net.URL;

/**
 * @Program : springboot0106
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-17 17:11
 */
public class HtT {
    public static void pop(String url) throws  Exception{
        JEditorPane ed = new JEditorPane(new URL(url));
        System.out.println("10");
        Thread.sleep(10000);
        ed.setSize(1000,1000);

        //create a new image
        BufferedImage image = new BufferedImage(ed.getWidth(), ed.getHeight(),
                BufferedImage.TYPE_INT_ARGB);

        //paint the editor onto the image
        SwingUtilities.paintComponent(image.createGraphics(),
                ed,
                new JPanel(),
                0, 0, image.getWidth(), image.getHeight());
        //save the image to file
        ImageIO.write((RenderedImage)image, "png", new File("C:/Users/Guimu/Desktop/html.png"));
        System.out.println("ok");

    }
}
