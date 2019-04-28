//package by.home.hryhoryeu.realty.entities.pojo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Table(name = "user")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="id")
//    private Long id;
//
//    @Column(name="name")
//    private String name;
//
//    @Column(name="surname")
//    private String surname;
//
//    @Column(name="email")
//    private String email;
//
//    @Column(name="phone")
//    private String phone;
//
//    @Column(name="additional_phone")
//    private String additionalPhone;
//
//    @Column(name="skype")
//    private String skype;
//
//    @Column(name="day_of_birth")
//    private Date dayOfBirth;
//
//    @Column(name="password")
//    private String password;
//
//    @OneToMany(mappedBy = "user")
//    private List<Realty> realtyList;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getAdditionalPhone() {
//        return additionalPhone;
//    }
//
//    public void setAdditionalPhone(String additionalPhone) {
//        this.additionalPhone = additionalPhone;
//    }
//
//    public String getSkype() {
//        return skype;
//    }
//
//    public void setSkype(String skype) {
//        this.skype = skype;
//    }
//
//    public Date getDayOfBirth() {
//        return dayOfBirth;
//    }
//
//    public void setDayOfBirth(Date dayOfBirth) {
//        this.dayOfBirth = dayOfBirth;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public List<Realty> getRealtyList() {
//        return realtyList;
//    }
//
//    public void setRealtyList(List<Realty> realtyList) {
//        this.realtyList = realtyList;
//    }
//}
