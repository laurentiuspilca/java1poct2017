import java.io.*;

public class Punct implements Serializable {
    public static final long serialVersionUID = 1;
    

    int x;
    transient int y;
    int z;
    
    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }
}