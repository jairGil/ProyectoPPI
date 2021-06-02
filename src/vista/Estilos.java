package vista;

/**
 *
 * @author jair
 */
public class Estilos {
    // Colores de fondo (background)
    public static final java.awt.Color GRIS_BG = new java.awt.Color(51, 51, 51);
    public static final java.awt.Color ROJO = new java.awt.Color(200, 0, 0);
    public static final java.awt.Color ROJO_OBS = new java.awt.Color(150, 0, 0);
    public static final java.awt.Color GRIS_SEL = new java.awt.Color(35, 35, 35);
    
    // Fuentes y color de fuente
    public static final java.awt.Color FG_COLOR = new java.awt.Color(255, 255, 255);
    public static final java.awt.Color GRIS_CLARO = new java.awt.Color(102, 102, 102);
    public static final java.awt.Font FUENTE_TITULOS = new java.awt.Font("Yu Gothic UI", 0, 28);
    public static final java.awt.Font FUENTE_LBL = new java.awt.Font("Yu Gothic UI", 0, 18);
    public static final java.awt.Font FUENTE_TXT = new java.awt.Font("Yu Gothic UI Light", 0, 14);
    
    // Bordes de linea, rojo -> seleccionado     gris -> no seleccionado
    public static final javax.swing.border.MatteBorder BORDE_ROJO = javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, ROJO);
    public static final javax.swing.border.MatteBorder BORDE_GRIS = javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, GRIS_CLARO);
    
}
