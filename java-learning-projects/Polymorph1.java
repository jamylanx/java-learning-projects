class animal{
	public void sound(){
		System.out.println();
	}
}

class cow extends animal{
	public void sound(){
		System.out.println("Moooh moooh moooh");
	}
}

class pig extends animal{
	public void sound(){
		System.out.println("Oink oink oink");
}

public class Polymorph1{
	public static void main(String [] args){
	pig a = new pig();
	a.sound();
		}
	}
}