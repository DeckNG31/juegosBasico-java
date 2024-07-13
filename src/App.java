import java.util.Scanner;
import java.io.CharArrayReader;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String diccionario[] = {
            "Esternocleidomastoideo", "Serpiente", "Raton", "Inteligencia", "Emocional",
            "Subcutaneo", "Construccion", "Arquitectura", "Ingenieria", "Tornado", "Tentaculos",
            "Pentagono", "Melatonina", "Paleontologia", "Patrocinador",
            "Altruismo", "Biodiversidad", "Criptografia", "Dendrologia", "Ecosistema",
            "Filantropia", "Geotermia", "Hidroponia", "Interdisciplinario", "Juxtaposicion",
            "Kaleidoscopio", "Ludico", "Metamorfosis", "Nefelibata", "Oxigeno",
            "Paralelepipedo", "Quimerico", "Retorica", "Simetria", "Tetraedro",
            "Ubiquitous", "Vacuidad", "Whiskey", "Xenofobia", "Yodificacion",
            "Zoologia", "Antropoceno", "Bioluminiscencia", "Cromatica", "Dimensional",
            "Efimero", "Fotosintesis", "Galvanoplastia", "Holografia", "Inmunologia",
            "Jurisprudencia", "Kinesiologia", "Linguistica", "Matematica", "Nomenclatura",
            "Onomatopeya", "Pirotecnia", "Quasimojo", "Radiactividad", "Silvicultura",
            "Termodinamica", "Utopico", "Vibracion", "Wagneriano", "Xilofono"
        };
        Random random = new Random();
        int indiceAleatorio = random.nextInt(diccionario.length);
        String elementoAleatorio = diccionario[indiceAleatorio];

        String palabra_Adivinar = elementoAleatorio.toLowerCase();

        int intentosMaximos = 10;
        int intentosActuales = 0;
        boolean isAdivinada = false;

        char [] letrasAdivinadas = new char [palabra_Adivinar.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!isAdivinada && intentosActuales < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " ("+ palabra_Adivinar.length() + " letras" +")");
            System.out.println("Introduce una letra");

            char letra = scanner.next().charAt(0);
            boolean letraCorrecta = false;
            Character.toLowerCase(letra);

            for (int i = 0; i < palabra_Adivinar.length(); i++) {
                if (palabra_Adivinar.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }

            if (!letraCorrecta) {
                intentosActuales++;
                System.out.println(
                        "Te confundiste , que pena , tenes " + (intentosMaximos - intentosActuales) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabra_Adivinar)) {
                isAdivinada = true;
                System.out.println("Felicidades , adivinaste la palabra: " + palabra_Adivinar);
            }

        }
        if (!isAdivinada) {
            System.out.println("Te quedaste sin intentos, GAME OVER");
        }

        scanner.close();
    }
}
