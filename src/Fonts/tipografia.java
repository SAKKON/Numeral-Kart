/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fonts;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author Jason
 */
public class tipografia {
    private Font font = null;
    public String EXoBo = "Exo-Bold.ttf";
    public String EXoRe = "Exo-Regular.ttf";
    public String EXoSe = "Exo-SemiBold.ttf";
    
    public Font fuente( String fontName, int estilo, float tamanio)
    {
        try{
            //Cargar la tipografia
            InputStream is = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Error al cargar tipografia
            System.err.println(fontName + "No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }   
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
