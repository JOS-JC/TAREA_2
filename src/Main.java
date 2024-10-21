//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro perro = new Perro("Rex", 3);
        Gato gato = new Gato("Miau", 2);

        // Llamar a los métodos
        perro.hacerSonido();
        perro.comer();
        perro.beber();
        perro.dormir();
        perro.hacerTruco();
        perro.hacerTruco("dar la pata");

        System.out.println();

        gato.hacerSonido();
        gato.comer();
        gato.beber();
        gato.dormir();
    }
}