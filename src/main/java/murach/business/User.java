package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String firstName;
    private String lastName;
    private String heardFrom;
    private boolean updates;      // true/false
    private String contactVia;

    public User() {}

    public User(String email, String firstName, String lastName,
                String heardFrom, boolean updates, String contactVia) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.heardFrom = heardFrom;
        this.updates = updates;
        this.contactVia = contactVia;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getHeardFrom() { return heardFrom; }
    public void setHeardFrom(String heardFrom) { this.heardFrom = heardFrom; }

    public boolean isUpdates() { return updates; }   // EL đọc được bằng "updates"
    public void setUpdates(boolean updates) { this.updates = updates; }

    public String getContactVia() { return contactVia; }
    public void setContactVia(String contactVia) { this.contactVia = contactVia; }
}
