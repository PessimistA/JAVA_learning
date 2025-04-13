package exam_work5;

class person {
	String nameString;// ismi public private kullanmadan subclass da kullanmaya çalışırsan hata
	protected int asnt;				// alırsın

	public person(String nameString) {
		this.nameString = nameString;
	}

	public void showinfo() {
		System.out.println("name: " + nameString);
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

}

class member extends person {
	int number;

	public member(String nameString, int number) {
		super(nameString);
		this.number = number;
	}

	@Override
	public void showinfo() {
		asnt =7;
		System.out.println("name: " + getNameString() + "\n" + "number: " + number);
	}
}

class librarian extends person {
	String shift;

	public librarian(String nameString, String shift) {
		super(nameString);
		this.shift = shift;
	}

	@Override
	public void showinfo() {
		System.out.println("name: " + getNameString() + "\n" + "shift: " + shift);
	}
}

class book {
	String titleString;
	member oneMember;

	public String getTitleString() {
		return titleString;
	}

	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}

	public member getOneMember() {
		return oneMember;
	}

	public void setOneMember(member oneMember) {
		this.oneMember = oneMember;
	}

	public book(String titleString, member oneMember) {
		this.titleString = titleString;
		this.oneMember = oneMember;
	}

	public void showinfo() {
		System.out.println("title: " + titleString);
		oneMember.showinfo();
	}

}

class liked {
	person myPerson;
	static int count = 0;

	public liked(person myPerson) {
		this.myPerson = myPerson;
	}

	public void showinfo() {
		System.out.println("çok beğenildi " + count++);
		myPerson.showinfo();
	}
}

public class example5 {
	public static void main(String[] args) {
		member myMember = new member("al", 0);
		member myMember2 = new member("ol", 1);
		librarian myLibrarian = new librarian("bas", "sabah");

		book[] myBooks = new book[2];
		myBooks[0] = new book("birinci", myMember);
		myBooks[1] = new book("ikinci", myMember2);
		// myBooks[2] =new book("üçüncü", myLibrarian); hatalı member eklenmeli
		for (int i = 0; i < myBooks.length; i++) {
			myBooks[i].showinfo();
			System.out.println("---");
		}

		liked[] mylikedfellaws = new liked[3];
		mylikedfellaws[0] = new liked(myLibrarian);
		mylikedfellaws[1] = new liked(myMember);
		mylikedfellaws[2] = new liked(myMember2);

		for (int i = 0; i < mylikedfellaws.length; i++) {
			mylikedfellaws[i].showinfo();
			System.out.println("---");
		}

	}
}
