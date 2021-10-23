//

import java.awt.*;
class Frame_Q3 extends Frame
{
	Frame_Q3(){
		Button b1=new Button("Ok");
		b1.setBounds(150,100,100,50);
		setTitle("Java");
		setLayout(null);
		add(b1);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String arg[]){
		Frame_Q3 f=new Frame_Q3();
	}
}