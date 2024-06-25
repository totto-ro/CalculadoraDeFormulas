package calculadoradeformulas;

import java.io.IOException;

public class CalculadoraDeFormulas {

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Menu menu = new Menu();
        menu.mostrarMenu();

    }

}
