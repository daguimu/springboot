package com.boot.controller;

import org.fit.cssbox.demo.ImageRenderer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

/**
 * @Program : image_demo
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-17 16:03
 */
public class HtmlToImage {

    protected static void generateOutput(String url) throws Exception {
        ImageRenderer render = new ImageRenderer();
        System.out.println("start...");
       // FileOutputStream out = new FileOutputStream(new File("D:" + File.separator + "html.png"));
        FileOutputStream out = new FileOutputStream(new File("C:/Users/Guimu/Desktop/" + File.separator + "html123.png"));
        render.renderURL(url, out, ImageRenderer.Type.PNG);
        out.close();
        System.out.println("OK");

    }
}
