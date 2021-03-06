package zadania.fileReaderWriter;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -3179265919836083854L;
	private String name;
	private String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public Person() {
	}

}
