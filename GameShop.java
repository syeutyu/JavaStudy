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

class Potion extends Item {
	private String type;
	private int capacity;

	public Potion(String name, String description, int weight, int value, String type, int capacity) {
		super(name, description, weight, value);

	}

}

class Shop {
	private String name;
	private Object[] items;

	public Shop(String name, Object[] items) {
		this.name = name;
		this.items = items;
	}

}

public class GameShop {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Item[] item = new Item[5];
		item[0] = new Weapon("Sword", "Medium DMG", 3, 10, 10);
		item[1] = new Armor("Cap", "Light Armor", 1, 5, 5);
		item[2] = new Armor("Gloves", "Light Armor", 1, 5, 5);
		item[3] = new Weapon("Axe", "High DMG", 5, 15, 15);
		item[4] = new Armor("Boots", "Light Armor", 1, 5, 5);

		Item[] posion = new Item[5];
		posion[0] = new Potion("Small Health Potion", "100 HP", 2, 5, "Health", 100);
		posion[1] = new Potion("Small Mana Potion", "50 MP", 1, 30, "Mana", 50);
		posion[2] = new Potion("Medium Health Potion", "200 HP", 4, 120, "Health", 200);
		posion[3] = new Potion("Medium Mana Potion", "100 MP", 2, 75, "Mana", 100);
		posion[4] = new Potion("Large Health Potion", "300 HP", 6, 200, "Health", 300);
		// Item[] postion = new Item[5];

		while (true) {
			System.out.println("- Shop Select -");
			System.out.print("\t1. Weapon/Armor Shop\n\t2. Potion Shop\n\t3. Exit\n");
			int count = scanner.nextInt();
			System.out.println("Select : " + count);
			switch (count) {
			case 1: {
				new Shop("Weapon/Armor Shop", item);
				break;
			}
			case 2: {
				for (int i = 0; i < 5; i++) {

				}
			}

			case 3: {
				break;
			}
			default: {
				System.out.println("Invalid number! Try again.");
			}
			}
			if (count == 3)
				break;

		}
		System.out.println("Close Shop");
	}

}