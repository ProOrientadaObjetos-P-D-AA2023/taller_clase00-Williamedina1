package jugador_deber;

public class Metodos_Jugador {
    
    public Metodos_Jugador(String cedula, String nombre, String apellido, int edad) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public void caminar() {
        System.out.println("Hacer caminar al jugador");
    }

    public void correr() {
        System.out.println("Hacer correr al jugador");
    }

    public void viajar() {
        System.out.println("Hacer viajar al jugador");
    }    
    
}
