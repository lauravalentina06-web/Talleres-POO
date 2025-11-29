public class Main {

    // Método para avanzar
    public void avanzar() {
        // Pasos simples para avanzar
        System.out.println("1. Encendiendo el motor");
        System.out.println("2. Acelerando suavemente");
        System.out.println("El coche avanza.");
        System.out.println("==================================");
        
    }

    // Método para retroceder
    public void retroceder() {
        // Pasos simples para retroceder
        System.out.println("1. Activando reversa");
        System.out.println("2. Controlando lentamente el pedal");
        System.out.println("El coche retrocede.");
        System.out.println("=====================================");
    }

    // Método de máxima velocidad
    public void fullThrottle() {
        System.out.println("El coche va a máxima velocidad!");
    }

    // Método para mostrar la velocidad
    public void speed(int maxSpeed) {
        System.out.println("Velocidad máxima: " + maxSpeed);
    }
}
