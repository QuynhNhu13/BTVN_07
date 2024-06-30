package models;


public abstract class Phone {
    protected String name;
    protected String phone;
    protected String newPhone;

    public Phone(String name, String phone, String newPhone) {
        this.name = name;
        this.phone = phone;
        this.newPhone = newPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(String newPhone) {
        this.newPhone = newPhone;
    }
    
    public abstract void insertPhone(String name, String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newPhone);
    public abstract void searchPhone(String name);
    public abstract void sort();

    @Override
    public String toString() {
        return "Phone " + "- Name: " + name + " - Phone: " + phone + " = New Phone: " + newPhone;
    }
    
    
    
    
}
