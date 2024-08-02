public class heart {
    private String name;
    private String heartCode;

    public heart(String name, String heartCode) {
        this.name = name;
        this.heartCode = heartCode;
    }

    public String getName() {
        return name;
    }

    public String getHeartCode() {
        return heartCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeartCode(String heartCode) {
        this.heartCode = heartCode;
    }
}