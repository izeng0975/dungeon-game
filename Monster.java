public class Monster
{
  private int hitPoints;
  private int attackDamage;

  public Monster (int h, int ad)
  {
    hitPoints = h;
    attackDamage = ad;
  }

  public int setEasyHP()
  {
    hitPoints = (int) (Math.random() * 50) + 100;
    return hitPoints;
  }

  public int setEasyAD()
  {
    attackDamage = (int) (Math.random() * 15) + 10;
    return attackDamage;
  }

  public int setHardHP()
  {
    hitPoints = (int) (Math.random() * 50) + 150;
    return hitPoints;
  }

  public int setHardAD()
  {
    attackDamage = (int) (Math.random() * 20) + 15;
    return attackDamage;
  }

  public int getHP()
  {
    return hitPoints;
  }

  public int getAD()
  {
    return attackDamage;
  }

  public void takeDamage(int d)
  {
    hitPoints -= d;
  }
}