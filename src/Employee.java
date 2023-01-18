import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class Employee implements Serializable {
    private int uuid;
    private String name;
    private String surname;
    private Map<String, Boolean> operations;
    private Boolean isConstructor;
    private Boolean isAdmin;


    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Map<String, Boolean> getOperations() {
        return operations;
    }

    public void setOperations(Map<String, Boolean> operations) {
        this.operations = operations;
    }

    public Boolean getConstructor() {
        return isConstructor;
    }

    public void setConstructor(Boolean constructor) {
        isConstructor = constructor;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
