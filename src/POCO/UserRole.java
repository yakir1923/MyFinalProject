package POCO;

public class UserRole implements POCO{
    public int id;
    public String RoleName;

    public UserRole() {
    }

    public UserRole(int id, String roleName) {
        this.id = id;
        RoleName = roleName;
    }
}
