package constructorsdemo;
class Student
{		
void display(int id,String name) {
		System.out.println(id+" "+name);
}
}
		public class ConstructorsDemo {
		public static void main(String[] args) {

			Student std1 =new Student();
			Student std2 =new Student();
			
		std1.display(4,"Mahesh");
		std2.display(6,"Sathvik");
			}
		}
