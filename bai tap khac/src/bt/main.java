/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author NCT99
 */
public class main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
       DSKH listKHdocfile=new DSKH();//chứa danh sách đọc từ file.
       DSKH dskh=new DSKH();
       
        int LuaChonChinh;
        do{           
            LuaChonChinh=-1;
            menu();
            System.out.print("\n Mời bạn nhập lựa chọn:");
            
            try {
                LuaChonChinh=sc.nextInt();                
                sc.nextLine();
            } catch (Exception e) {                
                System.out.print("\n!!!Lỗi: "+e.toString()+" ; phải nhập số nguyên.");                                      
                sc.nextLine();
            }
            switch(LuaChonChinh){
                case 1:{
                    dskh.nhap();
                };break;
                       
                case 2:{
                    dskh.xuat();
                };break;
                case 3:{
                    dskh.ghiFile("kh.dat");
                   
                };break;
                case 4:{
                    
                    listKHdocfile.docfile("kh.dat");
                    listKHdocfile.xuat();
                };break;
                case 5:
                {
                    listKHdocfile.XuatDSKHCaNhap();
                };break;
                case 6:
                {
                    listKHdocfile.xuatDSKHDoanhNgiep();
                };break;
            }
        }while (LuaChonChinh!=0);
    }
    public static void menu(){
        System.out.print("\n-------------menu");
        System.out.print("\n1.nhập danh sách khách hàng");
        System.out.print("\n2. xuất ds khách hàng");
        System.out.print("\n3. ghi file kh");
        System.out.print("\n4. đọc file kh");
        System.out.print("\n5. xuất ds khách hàng là cá nhân");
        System.out.print("\n6. xuất ds là doanh nghiệp");
        System.out.print("\n0. thoát");
    }
}
