/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;

/**
 *
 * @author NCT99
 */
public class KieuTourComparator implements Comparator<BangDatTour> {
        @Override
	public int compare(BangDatTour s1, BangDatTour s2) {
           
            if(s1.getIntKieuTour() == s2.getIntKieuTour())
            {   
                
                return 0;
               
            }
            else if(s1.getIntKieuTour() < s2.getIntKieuTour())
		{  
                    
                    return -1;
                }
            else return 1;
	}
}