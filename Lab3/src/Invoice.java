import java.io.*;

public class Invoice {
	String number;
	String description;
	int quantity;
	double price;

	Invoice(String number, String description, int quantity, double price) {
		this.number = number;
		this.description = description;
		if (price < 0) {
			this.price = 0.0;
		} else {
			this.price = price;
		}
		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
	}

	void setNumber(String number) {
		this.number = number;
	}

	String getNumber() {
		return this.number;
	}

	double getInvoice() {
		return this.quantity * this.price;
	}

	void setDescription(String description) {
		this.description = description;
	}

	void setQuantity(int quantity) {
		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
	}

	void setPrice(double price) {
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}

	String getDescription() {
		return this.description;
	}

	int getQuantity() {
		return this.quantity;
	}

	double getPrice() {
		return this.price;
	}

	public static void main(String[] args) {
		Invoice obj = new Invoice("1234", "hello", 7, 49.6);
		System.out.println(obj.getDescription());
		obj.setPrice(5.0);
		System.out.println(obj.getInvoice());

		obj.setQuantity(-5);
		System.out.println(obj.getQuantity());

	}

}
