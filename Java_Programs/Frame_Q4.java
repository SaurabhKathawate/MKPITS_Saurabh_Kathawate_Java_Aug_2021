//

import java.awt.*;
class Frame_Q4{
	Frame_Q4(){
		Frame fr=new Frame();
		Button b1=new Button("Ok");
		b1.setBounds(50,50,200,100);
		fr.setTitle("Java");
		fr.setLayout(null);
		fr.add(b1);
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public static void main(String arg[]){
		Frame_Q4 f=new Frame_Q4();
	}
}