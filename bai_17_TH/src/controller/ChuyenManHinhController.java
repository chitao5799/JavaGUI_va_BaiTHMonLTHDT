/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import java.awt.Panel;
import bean.DanhSachBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.DatTourPanel;
import view.KhachHangPanel;
import view.TourPanel;
import view.TrangChuPanel;


/**
 *
 * @author NCT99
 */
public class ChuyenManHinhController {
    private JPanel jpRoot;
    private String kindSelected="";
    private List<DanhSachBean> list=null;
    public ChuyenManHinhController() {
    }

    public ChuyenManHinhController(JPanel jpRoot) {
        this.jpRoot = jpRoot;
    }
    public void setView(JPanel panelItem,JLabel label){
        kindSelected="TrangChu";
        panelItem.setBackground(new Color(96, 100, 191));
        label.setBackground(new Color(96, 100, 191));
        
        jpRoot.removeAll();
        jpRoot.setLayout(new BorderLayout());
        jpRoot.add(new TrangChuPanel());
        jpRoot.validate();
        jpRoot.repaint();
    }
    public void setEvent(List<DanhSachBean> list){
        this.list=list;
        for (DanhSachBean item : list) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{
        private JPanel node;//node là cái panel nào được chọn hay đối tượng đc quản lý
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent() {
        }
        
        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
           this.kind = kind;
           this.jpnItem = jpnItem;
           this.jlbItem = jlbItem;
         }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuPanel();
                    break;
                case "KhachHang":
            {
                try {
                    node = new KhachHangPanel();
                } catch (IOException ex) {
                    Logger.getLogger(ChuyenManHinhController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChuyenManHinhController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case "Tour":
            {
                try {
                    node = new TourPanel();
                } catch (IOException ex) {
                    Logger.getLogger(ChuyenManHinhController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChuyenManHinhController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case "DatTour":
            {
                try {
                    node = new DatTourPanel();
                } catch (IOException ex) {
                    Logger.getLogger(ChuyenManHinhController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChuyenManHinhController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                // more
                default:
                    break;
           }
           jpRoot.removeAll();
           jpRoot.setLayout(new BorderLayout());
           jpRoot.add(node);
           jpRoot.validate();
           jpRoot.repaint();
           setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
             kindSelected = kind;
           jpnItem.setBackground(new Color(96, 100, 191));
           jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
          if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
          }
        }
        
    }
    
    public void setChangeBackground(String kind){
        //thay đổi màu sắc của panel và label của các mục ở menu bên trái.
        for (DanhSachBean item : list) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJlb().setBackground(new Color(96, 100, 191));
//                item.getJpn().setBackground(new Color(96, 100, 191));
                item.getJpn().setBackground(new Color(0,232,224));
            }
            else{
                item.getJlb().setBackground(new Color(76, 175, 80));
                item.getJpn().setBackground(new Color(76,175,80));
            }
        }
    }
}
