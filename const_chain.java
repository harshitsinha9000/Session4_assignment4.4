//assignment 4.4
package java_session4;

class a1
{
	a1()
	{
		System.out.println("a constructor");
	}
}

class b1 extends a1
{
	b1()
	{
		System.out.println("b constructor");
	}
}


class c1 extends b1
{
	c1()
	{
		System.out.println("c constructor");
	}
}

public class const_chain extends c{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c1 obj = new c1();
	}

}
