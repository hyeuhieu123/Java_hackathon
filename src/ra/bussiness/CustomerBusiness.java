package ra.bussiness;



import ra.entity.Customer;

import java.util.Scanner;

import static ra.presentation.Main.arrCustomer;
import static ra.presentation.Main.currentIndex;

public  class CustomerBusiness {
    public void printList(){
        if(currentIndex ==0) {
            System.out.println("ds trong ");
            return;
        }
        for(int i = 0 ; i< currentIndex;i++){
            arrCustomer[i].displayData();
            System.out.println("-------------------------------");

        }
    }
    public void addCustomer(Scanner sc ){
        if (currentIndex==100){
            System.out.println("ko the them kh moi nua");
            return;
        };

        System.out.println("nhap so kh");
        int n = Integer.parseInt(sc.nextLine());
        for (int i =currentIndex;i<n;i++){
            arrCustomer[currentIndex] = new Customer();
            arrCustomer[currentIndex].inputData(sc);
            currentIndex++;
            System.out.println("them moi thanh cong");
        }



    }

    ///  tim theo String
    public int findCustomerByString(String id){
        for (int i = 0 ;i < currentIndex;i++){
            if(arrCustomer[i].getCustomerId().equals(id)){
                return i;
            }

        }
        return -1;
    }
    // xoa
    public void deleteCustomer(Scanner sc ){
        System.out.println("nhap ma kh");
        int index = findCustomerByString(sc.nextLine());
        System.out.println(index);
        if(index !=-1){
            for(int i = index ; i<currentIndex;i++){
                arrCustomer[i]=arrCustomer[i+1];
                currentIndex--;
                System.out.println("xoa thanh cong ");

            }
        }else {
            System.out.println("ko tim thay");
        }
    }

    // chinh sua
    public void updateCustomer(Scanner sc){
        System.out.println("nhap ma khach hang ");

        int index = findCustomerByString(sc.nextLine());
        if(index !=-1){
            System.out.println("THONG TIN CU");
            arrCustomer[index].displayData();
            boolean isOut = false;

            do{
                int choice = Integer.parseInt(sc.nextLine());
                System.out.println("1.ten kh");
                System.out.println("2.ho kh");
                System.out.println("3.ngay sinh");
                System.out.println("4.gioi tinh");
                System.out.println("5.dia chi");
                System.out.println("6.so dien thoai");
                System.out.println("7.email");
                System.out.println("8.loai khach hang");
                System.out.println("0.thoat ");
                switch (choice){
                    case 1:
                        System.out.println("nhap ten moi");
                        arrCustomer[index].setFirstName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("nhap ho moi");
                        arrCustomer[index].setLastName(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("nhap ngay sinh moi");
                        arrCustomer[index].setDateOfBirth(sc.nextLine());
                        break;
                    case 4:
                        System.out.println("nhap gioi tinh");
                        arrCustomer[index].setGender(Boolean.parseBoolean(sc.nextLine()));
                        break;
                    case 5:
                        System.out.println("nhap dia chi moi");
                        arrCustomer[index].setAddress(sc.nextLine());
                        break;
                    case 6:
                        System.out.println("nhap sdt moi");
                        arrCustomer[index].setPhoneNumber(sc.nextLine());
                        break;
                    case 7:
                        System.out.println("nhap email moi");
                        arrCustomer[index].setEmail(sc.nextLine());
                        break;
                    case 8:
                        System.out.println("nhap loai khach hang moi");
                        arrCustomer[index].setCustomerType(sc.nextLine());
                        break;
                    case 0:
                        isOut = true;


                }
            }while(!isOut);


        }else {
            System.out.println("ko tim thay");
        }
    }

}
