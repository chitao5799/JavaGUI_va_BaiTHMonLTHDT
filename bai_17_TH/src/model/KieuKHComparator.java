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
public class KieuKHComparator implements Comparator<BangDatTour> {
        @Override
	public int compare(BangDatTour s1, BangDatTour s2) {
            if(s1.getIntKieuKH()>s2.getIntKieuKH())
                return 1;
            else if(s1.getIntKieuKH()<s2.getIntKieuKH())
		return -1;
            else return 0;
	}
}