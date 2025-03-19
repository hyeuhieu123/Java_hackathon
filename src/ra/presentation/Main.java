package ra.presentation;

import ra.bussiness.CustomerBusiness;
import ra.entity.Customer;

import java.util.Scanner;

public class Main {
    public   static Customer[] arrCustomer = new Customer[100];
    public static int currentIndex =0;
    static CustomerBusiness CB = new CustomerBusiness();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("**********MENU*********");
            System.out.println("1. Hiển thị danh sách các khách hàng");
            System.out.println("2. Thêm mới khách hàng");
            System.out.println("3. Chỉnh sửa thông tin khách hàng");
            System.out.println("4. Xóa khách hàng");
            System.out.println("5. Tìm kiếm khách hàng");
            System.out.println("6. Sắp xếp ");
            System.out.println("0. Thoát chương trình");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                        CB.printList();
                    break;
                case 2:
                        CB.addCustomer(sc);
                    break;
                case 3:
                        CB.updateCustomer(sc);

                    break;
                case 4:
                    CB.deleteCustomer(sc);
                    break;
                case 5:
                    break;
                case 6:


                    break;
                case 7:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("nhap lai");
                        ;
            }


        }while(true);




    }



}
