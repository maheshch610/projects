package parameterizedconstructors;
class Std
{
	int id;
	String name;
	Std(int i,String n)
	{
	id=i;
	name=n;
	}
	void display() 
	{
	System.out.println(id+" "+name);
	}
	}
public class parameterizedconstructors {

	public static void main(String[] args) {
		Std std1=new Std(7,"Mahesh");
		Std std2=new Std(25,"Gsanesh");
		std1.display();
		std2.display();

	}
}


