import java.io.Serializable;

class UserData implements Serializable {
    String name = "Mayank";
}

public class BackupMarkerMain {
    public static void main(String[] args) {
        UserData u = new UserData();
        System.out.println(u.name);
    }
}