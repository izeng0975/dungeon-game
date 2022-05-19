public class Player
{
  private String name;
  private String weapon;
  private double money;
  private boolean isAlive;
  private int hitPoints;
  private int score;
  private int damage;

  public Player (String n, String w, double m, boolean a, int h, int s, int d)
  {
    name = n;
    weapon = w;
    money = m;
    isAlive = a;
    hitPoints = h;
    score = s;
    damage = d;
  }

  public Player (String n, String w, double m, boolean p, int s, int d)
  {
    n = name;
    w = weapon;
    m = money;
    hitPoints = 0;
    p = isAlive;
    s = score;
    d = damage;
  }

  public String getName()
  {
    return name;
  }
  public String getWeapon()
  {
    return weapon;
  }
  public double getMoney()
  {
    return money;
  }
  public double setMoney (double num)
  {
    return money += num;
  }
  public int getScore()
  {
    return score;
  }
  public int getHitPoints()
  {
    return hitPoints;
  }
  public int getDamage()
  {
    return damage;
  }
  public void increaseScore()
  {
    score +=20;
  }
  public void setScore(int s)
  {
    score = s;
  }
  public void hasDied()
  {
    isAlive = false;
  }
  public void newWeapon (String w)
  {
    weapon = w;
  }
  public void heal(int h)
  {
    hitPoints += h;
  }
  public void increaseHP (int num)
  {
    hitPoints += num;
  }
  public void increaseAttack (int amount)
  {
    damage += amount;
  }
  public void takeDamage(int d)
  {
    hitPoints -= d;
  }
  public String toString()
  {
    return "Weapon: " + weapon + "\nMoney: " + money + "\nHP: " + hitPoints + "\nDamage: " + damage + "\nScore: " + score;
  }

}