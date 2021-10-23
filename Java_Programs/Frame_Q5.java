//example to create a login form

import java.awt.*;
class Frame_Q5
{
	Frame_Q5(){
		Frame fr=new Frame();
		Label l1=new Label("MKPITS");
		l1.setBounds(100,50,100,25);
		fr.add(l1);

		Label l2=new Label("Signup Form");
		l2.setBounds(100,50,100,25);
		fr.add(l2);

		fr.setSize(400,400);
		fr.setVisible(true);
	}
		public static void main(String arg[]){
			Frame_Q5 f=new Frame_Q5();
		}
}