//The object of MenuItem class adds a simple labeled menu item on menu. The items used in a menu must belong to the MenuItem or any of its subclass.

//The object of Menu class is a pull down menu component which is displayed on the menu bar. It inherits the MenuItem class.

import java.awt.*;  
    class Menu_Q1
    {  
         Menu_Q1(){  
             Frame f= new Frame("Menu and MenuItem Example");  
             MenuBar mb=new MenuBar();  
             Menu menu=new Menu("Menu");  
             Menu submenu=new Menu("Sub Menu");  
             MenuItem i1=new MenuItem("Item 1");  
             MenuItem i2=new MenuItem("Item 2");  
             MenuItem i3=new MenuItem("Item 3");  
             MenuItem i4=new MenuItem("Item 4");  
             MenuItem i5=new MenuItem("Item 5");  
             menu.add(i1);  
             menu.add(i2);  
             menu.add(i3);  
             submenu.add(i4);  
             submenu.add(i5);  
             menu.add(submenu);  
             mb.add(menu);  
             f.setMenuBar(mb);  
             f.setSize(400,400);  
             f.setLayout(null);  
             f.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
    new Menu_Q1();  
    }  
    } 

