package forms.estilo;
import java.awt.Color;

public class Estilos {
    public static final Color COLOR_TABLERO = new Color(187, 173, 160);
    public static final Color COLOR_VACIO = new Color(204, 192, 179);
    public static final Color TEXTO_OSCURO = new Color(119, 110, 101);

    public static Color getColorFondo(int valor) {
        switch (valor) {
            case 2:  return new Color(238, 228, 218);
            case 4:  return new Color(237, 224, 200);
            case 8:  return new Color(242, 177, 121);
            case 16: return new Color(245, 149, 99);
            default: return COLOR_VACIO;
        }
    }
}