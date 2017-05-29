import java.util.Scanner;

class Item {
	private String name;
	private String description;
	private int weight;
	private int value;

	public Item(String name, String description, int weight, int value) {
		this.name = name;
		this.description = description;
		this.weight = weight;
		this.value = value;
	}

	public void Describe() {
		System.out.printf("name\t\t :%s\ndescription\t :%s\nweight\t\t :%d lbs\nvalue\t\t :%d gold coins\n", name,
				description, weight, value);
	}
}

class Weapon extends Item {
	private int damage;

	public Weapon(String name, String description, int weight, int value, int damage) {
		super(name, description, weight, value);
		this.damage = damage;
	}

	public void Describe() {
		try {
			super.Describe();
			System.out.printf("Damage\t\t :%d", damage);
			System.out.println();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Armor extends Item {
	private int defense;

	public Armor(String name, String description, int weight, int value, int defense) {
		super(name, description, weight, value);
		this.defense = defense;
	}

	public void Describe() {
		super.Describe();
		System.out.printf("Defense\t\t :%d", defense);
		System.out.println();
		System.out.println();
	}

}

public class Shop {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("몇개의 아이템을 원하나요?");
		int count = scanner.nextInt();

		Item[] item = new Item[count];
		item[0] = new Weapon("Excalibur", "The legendary sword of King Arthur", 12, 1024, 24);
		item[1] = new Armor("Steel Armor", "Protective covering made by steel", 15, 805, 18);

		for (int i = 0; i < count; i++) {
			item[i].Describe();
		}
	}

}
