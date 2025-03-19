package ra.entity;

import java.util.Scanner;
public class Customer implements IApp{
    private String customerId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private boolean gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String customerType;

    public Customer(){

    };

    public Customer(String customerId, String firstName, String lastName, String dateOfBirth, boolean gender, String address, String phoneNumber, String email, String customerType) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
    }
    // getter
    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerType() {
        return customerType;
    }


    //setter

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }



    @Override
    public void inputData(Scanner sc) {
        System.out.println("nhap id");
        this.customerId=sc.nextLine();
        System.out.println("nhap ten kh");
        this.firstName=sc.nextLine();
        System.out.println("nhap ho kh");
        this.lastName=sc.nextLine();
        System.out.println("nhap ngay sinh kh");
        this.dateOfBirth=sc.nextLine();
        System.out.println("nhap gioi tinh");
        this.gender=Boolean.parseBoolean(sc.nextLine());
        System.out.println("nhap dia chi");
        this.address=sc.nextLine();
        System.out.println("nhap so dien thoai");
        this.phoneNumber=sc.nextLine();

        System.out.println("nhap email");
        this.email=sc.nextLine();
        System.out.println("nhap loai kh");
        this.customerType=sc.nextLine();


    }




    @Override
    public void displayData() {
        System.out.println("ma kh "+ this.customerId);
        System.out.println("ten kh "+this.firstName);
        System.out.println("ho kh "+this.lastName);
        System.out.println("ngay sinh "+this.dateOfBirth);
        System.out.println("gioi tinh "+(this.gender?"nam":"nu"));
        System.out.println("dia chi "+ this.address);
        System.out.println("sdt "+this.phoneNumber);
        System.out.println("email "+this.email);
        System.out.println("loai kh "+this.customerType);
    }
}
