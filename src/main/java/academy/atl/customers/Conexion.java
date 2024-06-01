package academy.atl.customers;

public class Conexion {
    // pattr de diseño singleton // objeto compartido en todo el proyecto
    private static Conexion instance;  // variable privada del mismo de la clase
    private String username;
    private String password;
    private String gost;
    private String port;

    private Conexion() {}  // cosbtructor privado

    public static Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    };

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGost() {
        return gost;
    }
    public void setGost(String gost) {
        this.gost = gost;
    }
    public String getPort() {
        return port;
    }
    public void setPort(String port) {
        this.port = port;
    }
}
