//create a class Book having private fields title and author and methods(setter and getter methods) setTitle(),setAuthor and getTitle() and getAuthor();
class Book
{
	private String title;
	private String author;
	//creating setter and getter methods
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
}
class TestBook
{
	public static void main(String[] arg)
	{
		Book t=new Book();
		t.setTitle("java");
		System.out.println("title of the book is " + t.getTitle());
		t.setAuthor("martin");
		System.out.println("author of the book is " + t.getAuthor());
	}
}

