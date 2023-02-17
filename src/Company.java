import java.util.Arrays;

public class Company {
    private String address;
    private Java[] java;
    private Android[] androids;
    private Go[] go;
    private String ownerName;

    public Company(String address, Java[] java, Android[] androids, Go[] go, String ownerName) {
        this.address = address;
        this.java = java;
        this.androids = androids;
        this.go = go;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Company  " +
                "address:  " + address + '\'' +
                ", java=" + Arrays.toString(java) +
                ", androids=" + Arrays.toString(androids) +
                ", go=" + Arrays.toString(go) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
