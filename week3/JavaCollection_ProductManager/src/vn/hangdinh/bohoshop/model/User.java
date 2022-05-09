package model;

public class User {
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String phone;
    private String address;
    private String email;
    private Role role;

    public User() {
    }

    public User(int id, String username, String password, String fullName, String phone, String address, String email, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.role = Role.parseRole(role);
    }

    public User(String raw){
        String[] userInformation = raw.split(",");
        this.id = Integer.parseInt(userInformation[0]);
        this.username = userInformation[1];
        this.password = userInformation[2];
        this.fullName = userInformation[3];
        this.phone = userInformation[4];
        this.address = userInformation[5];
        this.email = userInformation[6];
        this.role = Role.parseRole(userInformation[7]);

    }




    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }


}
