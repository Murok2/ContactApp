package sample;

public class Information {
    private String name;
    private String surname;
    private String phone;
    private String mail;
    private String image;

    public Information(String name, String surname, String phone, String mail, String image) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.mail = mail;
        this.image = image;
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


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Information{" +
                "surname='" + surname + '\'' +
                '}';
    }
}