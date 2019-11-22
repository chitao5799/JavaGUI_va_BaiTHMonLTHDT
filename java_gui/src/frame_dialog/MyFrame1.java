///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package frame_dialog;
//
///**
// *
// * @author NCT99
// */
//Class MyFrame extends Frame implements ActionListener
//{ 
//    private MenuBar menuBar;
//
//    private Menu menu;
//    private MenuItem circleItem, rectItem;
//    public MyFrame(String title)
//    { super(title);
//    menuBar = new MenuBar();
//    setMenuBar(menuBar);
//    menu = new Menu("Draw");
//    menuBar.add(menu);
//    circleItem = new MenuItem("Circle");
//    rectItem = new MenuItem("Rectangle");
//    menu.add(circleItem); menu.add(rectItem);
//    circleItem.addActionListener(this);
//    rectItem.addActionListener(this);
//    public void actionPerformed(ActionEvent e)
//    {
//        if (e.getSource() == circleItem)
//        {
//            MyDialog dialog = new MyDialog(this, "Modeless Dialog: Circle", false);
//        }
//    }
//    }
//}
