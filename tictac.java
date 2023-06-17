import java.awt.*;
import java.awt.event.*;
class tictac implements ActionListener{
Frame f;
GridLayout g;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
Panel p1,p2;
int a;
tictac(){
a=0;
f=new Frame();
f.setLayout(null);

p1=new Panel();
p1.setBounds(5,5,600,500);
f.add(p1);

g=new GridLayout(3,3);
b1=new Button();
b2=new Button();
b3=new Button();
b4=new Button();
b5=new Button();
b6=new Button();
b7=new Button();
b8=new Button();
b9=new Button();
p1.setLayout(g);
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);



p2=new Panel();
p2.setBounds(2,500,600,200);
p2.setBackground(Color.gray);
f.add(p2);
b10=new Button("REFRESH");
p2.add(b10);
b10.addActionListener(this);


f.setSize(600,600);
f.setVisible(true);

}
void test(){

if((b1.getLabel()!="") && (b2.getLabel()!="") && (b3.getLabel()!="") && (b4.getLabel()!="") && (b5.getLabel()!="") && (b6.getLabel()!="") && (b7.getLabel()!="") && (b8.getLabel()!="") && (b9.getLabel()!="")){
f.setTitle("NO ONE WINS");

}

if(b1.getLabel().equals("O") && b2.getLabel().equals("O") && b3.getLabel().equals("O")){
f.setTitle("O WINS");
b1.setBackground(Color.green);
b2.setBackground(Color.green);
b3.setBackground(Color.green);

}
if(b1.getLabel().equals("X") && b2.getLabel().equals("X") && b3.getLabel().equals("X")){
f.setTitle("X WINS");
b1.setBackground(Color.green);
b2.setBackground(Color.green);
b3.setBackground(Color.green);
}


if(b1.getLabel().equals("O") && b4.getLabel().equals("O") && b7.getLabel().equals("O")){
f.setTitle("O WINS");
b1.setBackground(Color.green);
b4.setBackground(Color.green);
b7.setBackground(Color.green);

}
if(b1.getLabel().equals("X") && b4.getLabel().equals("X") && b7.getLabel().equals("X")){
f.setTitle("X WINS");
b1.setBackground(Color.green);
b4.setBackground(Color.green);
b7.setBackground(Color.green);

}


if(b7.getLabel().equals("O") && b8.getLabel().equals("O") && b9.getLabel().equals("O")){
f.setTitle("O WINS");
b7.setBackground(Color.green);
b8.setBackground(Color.green);
b9.setBackground(Color.green);

}
if(b7.getLabel().equals("X") && b8.getLabel().equals("X") && b9.getLabel().equals("X")){
f.setTitle("X WINS");
b7.setBackground(Color.green);
b8.setBackground(Color.green);
b9.setBackground(Color.green);

}

if(b3.getLabel().equals("O") && b6.getLabel().equals("O") && b9.getLabel().equals("O")){
f.setTitle("O WINS");
b3.setBackground(Color.green);
b6.setBackground(Color.green);
b9.setBackground(Color.green);

}
if(b3.getLabel().equals("X") && b6.getLabel().equals("X") && b9.getLabel().equals("X")){
f.setTitle("X WINS");
b3.setBackground(Color.green);
b6.setBackground(Color.green);
b9.setBackground(Color.green);

}


if(b4.getLabel().equals("O") && b5.getLabel().equals("O") && b6.getLabel().equals("O")){
f.setTitle("O WINS");
b4.setBackground(Color.green);
b5.setBackground(Color.green);
b6.setBackground(Color.green);

}
if(b4.getLabel().equals("X") && b5.getLabel().equals("X") && b6.getLabel().equals("X")){
f.setTitle("X WINS");
b4.setBackground(Color.green);
b5.setBackground(Color.green);
b6.setBackground(Color.green);

}


if(b2.getLabel().equals("O") && b5.getLabel().equals("O") && b8.getLabel().equals("O")){
f.setTitle("O WINS");
b2.setBackground(Color.green);
b5.setBackground(Color.green);
b8.setBackground(Color.green);

}
if(b2.getLabel().equals("X") && b5.getLabel().equals("X") && b8.getLabel().equals("X")){
f.setTitle("X WINS");
b2.setBackground(Color.green);
b5.setBackground(Color.green);
b8.setBackground(Color.green);

}


if(b1.getLabel().equals("O") && b5.getLabel().equals("O") && b9.getLabel().equals("O")){
f.setTitle("O WINS");
b1.setBackground(Color.green);
b5.setBackground(Color.green);
b9.setBackground(Color.green);

}
if(b1.getLabel().equals("X") && b5.getLabel().equals("X") && b9.getLabel().equals("X")){
f.setTitle("X WINS");
b1.setBackground(Color.green);
b5.setBackground(Color.green);
b9.setBackground(Color.green);

}



if(b3.getLabel().equals("O") && b5.getLabel().equals("O") && b7.getLabel().equals("O")){
f.setTitle("O WINS");
b3.setBackground(Color.green);
b5.setBackground(Color.green);
b7.setBackground(Color.green);

}
if(b3.getLabel().equals("X") && b5.getLabel().equals("X") && b7.getLabel().equals("X")){
f.setTitle("X WINS");
b3.setBackground(Color.green);
b5.setBackground(Color.green);
b7.setBackground(Color.green);

}













}
public void actionPerformed(ActionEvent e){

if(e.getSource()==b10){

b1.setLabel("");
b2.setLabel("");
b3.setLabel("");
b4.setLabel("");
b5.setLabel("");
b6.setLabel("");
b7.setLabel("");
b8.setLabel("");
b9.setLabel("");
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);




}


if(e.getSource()==b1){
	if(a==0)
	{
	b1.setLabel("O");
	a=1;
	}
	else
	{
	b1.setLabel("X");
	a=0;
	}
test();
	
}
if(e.getSource()==b2){
	if(a==0)
	{
	b2.setLabel("O");
	a=1;
	}
	else
	{
	b2.setLabel("X");
	a=0;
	}
	test();
}
if(e.getSource()==b3){
if(a==0){
b3.setLabel("O");
a=1;
}
else{
b3.setLabel("X");
a=0;
}
test();
}
if(e.getSource()==b4){
	if(a==0)
	{
	b4.setLabel("O");
	a=1;
	}
	else
	{
	b4.setLabel("X");
	a=0;
	}
	test();
}
if(e.getSource()==b5){
	if(a==0)
	{
	b5.setLabel("O");
	a=1;
	}
	else
	{
	b5.setLabel("X");
	a=0;
	}
	test();
}
if(e.getSource()==b6){
	if(a==0)
	{
	b6.setLabel("O");
	a=1;
	}
	else
	{
	b6.setLabel("X");
	a=0;
	}
	test();
}
if(e.getSource()==b7){
	if(a==0)
	{
	b7.setLabel("O");
	a=1;
	}
	else
	{
	b7.setLabel("X");
	a=0;
	}
	test();
}
if(e.getSource()==b8){
	if(a==0)
	{
	b8.setLabel("O");
	a=1;
	}
	else
	{
	b8.setLabel("X");
	a=0;
	}
	test();
}
if(e.getSource()==b9){
	if(a==0)
	{
	b9.setLabel("O");
	a=1;
	}
	else
	{
	b9.setLabel("X");
	a=0;
	}
	test();
}

}
public static void main(String[] args){
tictac obj=new tictac();
}
}