/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Muñeca Brava
 */
public class Fuentes {
    private Font font = null;
    public String luisa = "Luisa.ttf";
    public String sunshine = "Sunshine.ttf";

        //Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
        //tamanio = float
    
    public Font fuenteLuisa(int stilo, int tamanio){
        
         try {
            InputStream is =  getClass().getResourceAsStream(luisa);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException ex) {
            System.err.println(luisa + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
        Font tfont = font.deriveFont(stilo, tamanio);
        return tfont;
    }
    
    public Font fuenteSunshine(int stilo,int tamanio){
        
         try {
            InputStream is =  getClass().getResourceAsStream(sunshine);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException ex) {
            System.err.println(luisa + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
        Font tfont = font.deriveFont(stilo, tamanio);
        return tfont;
    }
}
