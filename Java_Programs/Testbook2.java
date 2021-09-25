//create a read-only class Book having getter methods
class Book
{
	private int id=111;
	private String title="java";


	public int getId() {
		return id;
	}

		public String getTitle() {
		return title;
	}

}
/////////////////////////////////////////////////////////////////////
class Testbook2
{
	public static void main(String[] arg) {
		Book t=new Book();
		//t.setId(-11);
		System.out.println("id = " + t.getId() );
		//t.setTitle("java");
		System.out.println("title of the book is " + t.getTitle());

	}

}
