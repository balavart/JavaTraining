package ru.epam.balayan.tasksolution7.models.items;

/**
 * Item's contract.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 09.09.2019
 * @see Potion extends
 * @see Weapon extends
 */
public abstract class Item {
  private String className = getClass().getSimpleName();
  private String name;
  private Integer price;

  public Item(String name, Integer price) {
    this.name = name;
    this.price = price;
  }

  /** override with format specifiers. */
  @Override
  public String toString() {
    // use yellow for text
    String gold = "\u001B[33m" + "gold" + "\u001B[0m";
    return String.format("%s %s sold for %d %s", className, name, price, gold);
  }
}
