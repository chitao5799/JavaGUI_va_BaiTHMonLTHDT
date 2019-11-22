/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author NCT99
 */
public class DSTour {
     ArrayList<Tour> listTour =new ArrayList<>();
     public void ghiFile(String filename) throws FileNotFoundException, IOException{
//          
             FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream out =new ObjectOutputStream(fout);
            out.writeObject(listTour);           
            out.close();
           fout.close();
        }
    public void docfile(String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
            try{ 
            FileInputStream fin =new FileInputStream(filename);
            ObjectInputStream obin =new ObjectInputStream(fin);           
            listTour=(ArrayList)obin.readObject();
            obin.close();//fin.close();
            }catch(Exception e){
                
                System.out.print("\n!!!Lỗi :"+e);
            }
        }
}
