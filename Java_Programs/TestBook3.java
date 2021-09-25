//create a write-only class Book having getter methods
class Book
{
	private int id;
	private String title;


	public void setId(int id) {
		this.id=id;
	}

		public void setTitle(String title) {
		this.title=title;
	}
	public void display() {
		System.out.println("id of the book is " + id);
		System.out.println("title of the book is " + title);
	}

}
/////////////////////////////////////////////////////////////////////
class TestBook3
{
	public static void main(String[] arg) {
		Book t=new Book();
		t.setId(11);
		//System.out.println("id = " + t.getId() );
		t.setTitle("java");
		//System.out.println("title of the book is " + t.getTitle());
		t.display();

	}

}
