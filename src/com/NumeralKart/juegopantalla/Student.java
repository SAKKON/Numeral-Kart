/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.NumeralKart.juegopantalla;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 *
 * @author skril
 */
   
    public class Student extends BasicSliderUI {

    private final BufferedImage img1;
        
    public Student(JSlider slider) throws IOException {
        super(slider);
        img1 = ImageIO.read(getClass().getResourceAsStream("redKart.png"));

    }
    

    @Override
    public void paintFocus(Graphics grphcs) {

    }

    @Override
    protected Dimension getThumbSize() {
        return new Dimension(14, 14);
    }

    @Override
    public void paintThumb(Graphics grphcs) {
        Graphics2D g1 = (Graphics2D) grphcs;
        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g1.setColor(slider.getForeground());
        
        g1.drawImage(img1, 0, 0, null);
    }

    @Override
    public void paintTrack(Graphics grphcs) {
        Graphics2D g1 = (Graphics2D) grphcs;
        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g1.setColor(slider.getBackground());
        if (slider.getOrientation() == JSlider.VERTICAL) {
            g1.fillRoundRect(slider.getWidth() / 2 - 2, 2, 4, slider.getHeight(), 1, 1);
        } else {
            g1.fillRoundRect(2, slider.getHeight() / 2 - 2, slider.getWidth() - 5, 4, 1, 1);
        }
    }
}
    

