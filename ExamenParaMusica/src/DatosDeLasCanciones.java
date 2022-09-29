import java.util.Scanner;
public abstract class DatosDeLasCanciones {
int limit=0, Año;
String Nombre, Artista, Genero, Album, Disquera;
    public DatosDeLasCanciones() {
    }
    public void NombreCancion() 
    {
        System.out.println("Ingresa el nombre de la canción");
        Scanner s = new Scanner(System.in);
        Nombre = s.nextLine();
    }
    public void NombreArtista() 
    {
        System.out.println("Ingresa el nombre del artista");
        Scanner s = new Scanner(System.in);
        Artista = s.nextLine();
    }
    public void NombreGenero() 
    {
        System.out.println("Ingresa el nombre del genero");
        Scanner s = new Scanner(System.in);
        Genero = s.nextLine();
    }
    public void NombreAlbum() 
    {
        System.out.println("Ingresa el nombre del album");
        Scanner s = new Scanner(System.in);
        Album = s.nextLine();
    }
    public void AñoLanzamiento() 
    {
        System.out.println("Ingresa el año");
        Scanner s = new Scanner(System.in);
        Año= s.nextInt();
    }
    public void NombreDisquera() 
    {
        System.out.println("Ingresa el nombre del album");
        Scanner s = new Scanner(System.in);
        Disquera = s.nextLine();
    }
    
    public void MostrarDatos(){
    System.out.println("-----------PLAYLIST-----------\n"
            + "\nLA CANCION: "+ Nombre
            + "\nDE EL ARTISTA: "+ Artista
            + "\nCATALOGADA COMO: "+Genero
            + "\nDEL ALBUM:"+Album 
            + "\nDEL AÑO: "+Año
            + "\nDISQUERA:" + Disquera);
    
    }
 
    
}
