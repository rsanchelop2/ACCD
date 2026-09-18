import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Pedir a usuario una ruta a un directorio
        Scanner sc = new Scanner(System.in);
        String ruta_directorio = sc.nextLine();
        File directorio = new File(ruta_directorio);

        // Listar el contenido del directorio
        if (directorio.exists() & directorio.isDirectory()){
            System.out.println(Arrays.toString(directorio.list()));
        }

        // Pedir el nombre de un fichero (con extension) contenido en esa ruta / comprobar si existe
        String fichero_in = sc.nextLine();
        String ruta_abs_fichero = ruta_directorio + "\\" + fichero_in;
        System.out.println(ruta_abs_fichero);
        File fichero = new File(ruta_abs_fichero);
        if (fichero.exists()){
            System.out.println("El fichero " + fichero_in + " existe");
        }

        // Abrirlo con FlireReader y mostrar todo su contenido
        try (FileReader fr = new FileReader(ruta_abs_fichero);
             BufferedReader br = new BufferedReader(fr)) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }


    }
}