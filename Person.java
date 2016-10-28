public class Person
{
	private String lastname;
	private String firstname;
	private String zipcode;

	public Person()
	{
		lastname = "X";
		firstname = "X";
		zipcode = "X";

	}

	public Person(String first, String last, String zip)
	{
		lastname = last;
		firstname = first;
		zipcode = zip;
	}

	public void display()
	{
		System.out.println("First Name: " + firstname);
		System.out.println("Last Name: " + lastname);
		System.out.println("Zipcode: " + zipcode);

	}

	public static void main(String args[])
	{
		Person def = new Person();
		Person custom = new Person(args[0],args[1],args[2]);

		System.out.println("Default Date: ");
		def.display();
		System.out.println("Custom Date: ");
		custom.display();

	}
}