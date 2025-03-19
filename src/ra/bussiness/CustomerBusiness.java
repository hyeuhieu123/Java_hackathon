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



        }else {
            System.out.println("ko tim thay");
        }
    }

}
