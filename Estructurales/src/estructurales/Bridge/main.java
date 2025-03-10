package estructurales.Bridge;

/**
 *
 * @author Uniminuto Tibu
 */

// Bridge 
// Separa una abstracción de su implementación para que ambas puedan evolucionar independientemente.

// Ejemplo:
// Diferentes formas geómetricas que pueden ser dibujados de distintas maneras (rojo o azul).

public class main {
    
    // Interfaz de la implementacion
    interface Color{
        void applyColor ();
    }

    // Implementaciones concretas
    static class RedColor implements Color{
        public void applyColor() {
            System.out.println("Aplicando color Rojo");
        }
    }

    static class BlueColor implements Color{
        public void applyColor() {
            System.out.println("Aplicando color Azul");
        }
    }

    static abstract class Shape{
        protected Color color;
        public Shape(Color color){
            this.color = color;
        }
        abstract void draw();
    }

    // Subclase con una implementacion diferente
    static class Circle extends Shape{
        public Circle(Color color) {
            super(color);
        }

        public void draw() {
            System.out.println("Dibujando circulo");
            color.applyColor();
        }
    }

    // Uso del patron Bridge
    public static void main(String[] args) {
        Shape redCircle = new Circle( new RedColor());
        Shape blueCircle = new Circle( new BlueColor());

        redCircle.draw();
        blueCircle.draw();
    }
}
