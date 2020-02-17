
//All java programs are saved as class files
public class Parent {

	//main method - where the java file runs from
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Navigated to home page");
    Methods m = new Methods(); //Create new object from the Methods class to use its methods
    System.out.println(m.ValidateHeader()); //Now use the method from the other class file
    }
}