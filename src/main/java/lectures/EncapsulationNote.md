# Encapsulation
is the mechanism that allows we to restrict access to certain components in the objects that 
we are creating. So, we 're able to protect the members of a class from external access

```java
class Player {
   public String name;
   public int health;
   public String weapon;
   
   public void loseHealth(int damage) {
      health = health-damage;
      if (health <= 0) {
         System.out.println("Player knocked out");
         // Reduce number of lives remaining
      }
   }
   
   public int healthRemaining() {
      return health;
   }
}

public class Main {
   public static void main(String[] args) {
      Player player = new Player();
      player.name = "Leng";
      player.health = 20;
      player.weapon = "Sword";
      
      int damage = 10;
      player.loseHealth(damage);
      System.out.println("Remaining Health = "+player.healthRemaining());
   }
}
```

```java
      int damage = 11;
      player.loseHealth(damage); // will knock out player
      System.out.println("Remaining Health = "+player.healthRemaining());
```
but since we have ability to change the `health` field. the next day someone could modify our 
code like this
```java
      int damage = 11;
      player.health = 200; // this will break application
      player.loseHealth(damage); // will knock out player
      System.out.println("Remaining Health = "+player.healthRemaining());
```
Another problem is
if we decide to rename some field in `Player` class from `name` to `fullName` 