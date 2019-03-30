package bntu10702117alex;

public class netbok {

	private int Id;
	private String Name;
	private String Owner;

	public netbok(int Id, String Name, String Owner) {
		this.Id = Id;
		this.Name = Name;
		this.Owner = Owner;
	}

	@Override
	public String toString() {
		return "ID = " + this.Id + "\nName of laptop = " + this.Name + "\nOwner of laptop = " + this.Owner;
	}

	@Override
	public boolean equals(Object obj) {
		boolean Stat = false;
		if (obj.getClass() == this.getClass()) {
			netbok nlp = (netbok) obj;
			if (nlp.Id == this.Id) {
				System.out.println("Равны");
				Stat = true;
				}
			else {System.out.println("Не Равны");return false;}
			
		} 
		else {System.out.println("Не Равны");return false;}
			
		return Stat;

	}
	@Override
	public int hashCode() {
		return this.Id;
	}
	
}

//парсер  xml документа.
