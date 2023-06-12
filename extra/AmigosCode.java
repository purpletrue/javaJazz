package extra;

public class AmigosCode {
    private String id;

    private String username;

    private int birthYear;


    public AmigosCode(String id, String username, int birthYear) {
        this.id = id;
        this.username = username;
        this.birthYear = birthYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
