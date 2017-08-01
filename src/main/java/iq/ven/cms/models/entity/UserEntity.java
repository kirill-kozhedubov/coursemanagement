package iq.ven.cms.models.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "entity_seq_gen")
    @SequenceGenerator(name = "entity_seq_gen", sequenceName = "user_seq")
    private long id;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false, length = 150)
    private String email;

    @Column(name = "password", nullable = false, length = 32)
    private String password;

    @Column(name = "password_encrypted", nullable = false)
    private boolean passwordEncrypted;

    @Column(name = "email_visible", nullable = false)
    private boolean emailVisible;

    @Column(name = "contact_information", columnDefinition = "TEXT")
    private String contacts;

    @Column(name = "active", nullable = false)
    private boolean active;

    @Column(name = "banned", nullable = false)
    private boolean banned;

    @Column(name = "email_confirmed", nullable = false)
    private boolean emailConfirmed;

    @Column(name = "creation_date", nullable = false)
    @Type(type = "timestamp")
    private Date creationDate;

    @Column(name = "modification_date")
    @Type(type = "timestamp")
    private Date modificationDate;

    @Column(name = "last_login_date")
    @Type(type = "timestamp")
    private Date lastLoginDate;

    @Column(name = "last_login_ip", length = 45)
    private String lastLoginIP;

    @Column(name = "comments")
    private String comments;

    //!TODO cofigure userGroups
    //private UserGroups userGroups;

    //!TODO cofigure courses
   // private List<Course> courses;

    //!TODO configure userProfileImage
   // private UserProfileImage userProfileImage;

    //!TODO configure userSettings
    //private UserSettings userSettings;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPasswordEncrypted() {
        return passwordEncrypted;
    }

    public void setPasswordEncrypted(boolean passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }

    public boolean isEmailVisible() {
        return emailVisible;
    }

    public void setEmailVisible(boolean emailVisible) {
        this.emailVisible = emailVisible;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public boolean isEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    /*
    long getId(){}
    String getFirstName(){}
    String getLastName(){}
    String getEmail(){}
    String getPassword(){}
    boolean isEmailVisible();  //if user wants to show others his email
    String getContacts(); //if user wants to add some contacts e.g. phone, additional email
    boolean isPasswordEncrypted(); //if password stored in encrypted form
    UserGroups getUserGroup(); //returns group of users to get courses
    List<Course> getCourses(); //get list of individual courses
    boolean isActive(); // if account is active (deleted) or non
    boolean isBanned(){}
    boolean isEmailConfirmed(){}
    Date getRegistrationDate(){}
    Date getModifiedDate(){}
    Date getLastLoginDate(){}
    String getLastLoginIP(){}
    String getComments(){}
    UserProfileImage getUserProfileImage(){}
    UserSettings getUserSettings(){}*/

}
