import java.util.Scanner;
public class Main 
{
  public static final String TEXT_RESET = "\u001B[0m";
  public static final String TEXT_BLUE = "\u001B[34m";
  public static final String TEXT_GREEN = "\u001B[32m";
  public static final String TEXT_YELLOW = "\u001B[33m";
  public static final String TEXT_RED = "\u001B[31m";
  public static final String TEXT_PURPLE = "\u001B[35m";
  public static void main(String[] args) 
  {
    String name = "";
    String answer = "";
    int balance = 0;
    int counter  = 0;
    int potions = 10;
    boolean minMonsterKilled = true;
    String chooseWeapon = "";
    Monster monster = new Monster(0, 0);
    Monster boss = new Monster(500,30);
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your name please: ");
    name = scan.nextLine();
    System.out.println();
    SlowText.slowText("*You went out with your friends to celebrate your 21st birthday last night. You drank so much the bartender kicked you out. Your friends ended up carrying you back to your sweet bed. You wake up the next day without any memory of what happened*\n");
    System.out.println("======================================================================================================================================================================================================================================================");
    SlowText.slowText(TEXT_GREEN + "\nUNKNOWN VOICE: " + TEXT_RESET + " Hey...Hey...Hey...");
    SlowText.slowText(TEXT_BLUE + "\n" + name + ":" + TEXT_RESET + " Who is this voice? What do they want?");
    System.out.println();
    SlowText.slowText("\n*You reluctantly wake up*");
    System.out.println();
    SlowText.slowText(TEXT_BLUE + "\n" + name + ":" + TEXT_RESET + " ...Where am I? Was I not out drinking for my birthday?");
    System.out.println();
    SlowText.slowText("\n*You finally realize that there is a gnome right next to you trying to get your attention.*");
    System.out.println();
    SlowText.slowText(TEXT_BLUE + "\n" + name + ":" + TEXT_RESET + " Hey you, can you tell me what's going on?");
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " I just happened to stumble across you as I was walking around the street. You are currently in Selenville. I believe you come from the planet Earth but sorry to say, we are currently in a galaxy far, far away.");
    SlowText.slowText(TEXT_BLUE + "\n" + name + "(internally): " + TEXT_RESET + "Why does this gnome look like Keemstar. Ugh, whatever I guess I'll just follow what he says so I can go back.");
    SlowText.slowText(TEXT_BLUE + "\n" + name +":" + TEXT_RESET + " I'm not even going to question how I'm alive or where I am. Is there any way I can go back to Earth?");
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Sadly, no. You are probably stuck here.");
    SlowText.slowText(TEXT_BLUE + "\n" + name + ":" + TEXT_RESET + " What can I even do here? I don't want to live the rest of my life in a boring planet.");
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " You can join the Guild and fight monsters in our famed Dungeon. Just a heads up, some don't make it back out. Would you like to join in and fight these monsters? I heard there's a chance that making it out alive grants you any wish. Maybe you can make a wish back to the Planet Earth.");
    SlowText.slowText(TEXT_BLUE + "\n" + name + ": " + TEXT_RESET);
    answer = scan.nextLine();
    Player character = new Player(name, "", 0.0, true, 100, 0, 0);
    if (answer.equals("yes") || answer.equals("y") || answer.equals("Yes") || answer.equals("Y"))
    {
      SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " I'm glad you can make it. Welcome aboard runt, you have a lot to do. Come with me, I will take you to the guild.");
    }
    else
    {
      SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " I guess you don't have the courage to join us. Come back when you are ready runt.");
      System.exit(0);
    }
    System.out.println();
    SlowText.slowText("\n*You follow this Gnome to the guild. You continue to open the door and you are surprised by the amount of people that there is.*");
    System.out.println();
    SlowText.slowText(TEXT_BLUE + "\n" + name + ":" + TEXT_RESET + " Wow, there are so many people here.");
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Come here, you need to choose what you want to be. Which weapon are you most proficient with, the sword, bow, or staff?");
    System.out.println();
    SlowText.slowText("\n*Hint: Sword users do the least amount of damage but have the most HP, mages who use staffs have the lowest amount of HP but highest damage, and archers are in the middle.*");
    System.out.println();
    SlowText.slowText(TEXT_BLUE + "\n" + name + ": " + TEXT_RESET);
    chooseWeapon = scan.nextLine();
    while(!chooseWeapon.equals("sword") && !chooseWeapon.equals("bow") && !chooseWeapon.equals("staff")) 
    {
      SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Come on, pick one of the options that I gave you. Either the sword, bow, or staff. Knights use the sword. Archers use the bow. Mages use the staff. There's also the rumored clown that uses his bare fists.");
      SlowText.slowText(TEXT_BLUE + "\n" + name + ": " + TEXT_RESET);
      chooseWeapon = scan.nextLine();
    }
    if (chooseWeapon.equals("sword"))
    {
      SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Ahh, I see you want to be a knight. Here is a sword for you to use.");
      System.out.println();
      SlowText.slowText("*The Gnome gives you a sword*");
      System.out.println();
      character.newWeapon("dull sword");
      character.increaseHP(150);
      character.increaseAttack(25);
    }
    else if (chooseWeapon.equals("bow"))
    {
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Ahh, I see you want to be an archer. Here is a bow for you to use.");
      System.out.println();
      SlowText.slowText("*The Gnome gives you a bow*");
      System.out.println();
      character.newWeapon("rusty bow");
      character.increaseHP(50);
      character.increaseAttack(50);
    }
    else if (chooseWeapon.equals("staff"))
    {
      SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Ahh, I see you want to be a mage. Here is a staff for you to use.");
      System.out.println();
      SlowText.slowText("*The Gnome gives you a staff*");
      System.out.println();
      character.newWeapon("beginner's staff");
      character.increaseAttack(75);
    }
    else
    {
      SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Why did you decide to be a clown...");
      SlowText.slowText("\n*Just kidding, being a clown is good. You automatically win the game for deciding on doing something so stupid. :)*");
      character.setScore(Integer.MAX_VALUE);
      System.out.println();
      SlowText.slowText("\n*CONGRATULATIONS FOR WINNING THE SNEAKY WAY!!!!! YOU GOT A SCORE OF " + character.getScore() + "*");
      System.exit(0);
    }
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Now follow me to the dungeon. We will start off by fighting the weak monsters. Each monster that you kill will give you 100 coins, but be careful, they will fight back.");
    SlowText.slowText(TEXT_BLUE + "\n" + name + ":" + TEXT_RESET + " I guess I will give it a try.");
    System.out.println();
    SlowText.slowText("\n*You approach a monster from the back and you continue to attack it. You somehow manage to kill it.*");
    System.out.println();
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Nice work! It didn't even hit you once that time.");
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " We are going to continue fighting more monsters whether you like it or not. You need the money and experience so that you can get out of here.");
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Fight at least 3 monsters and we can continue onto the shopkeeper. We are going to upgrade your equipment before facing the boss. By the way, you have only 10 potions right now, use them wisely.");
    int characterMaxHP = character.getHitPoints();
    while(counter < 10 && minMonsterKilled)
    {
      String fightAnswer = "";
      if (counter < 5)
      {
        monster.setEasyHP();
        monster.setEasyAD();
      }
      else if (counter >= 5)
      {
        monster.setHardHP();
        monster.setHardAD();
      }
      SlowText.slowText("\n*A monster with " + monster.getHP() + " HP and " + monster.getAD() + " attack damage is encountered. Do you want to fight it? If not, you can always fight another one with different stats.* ");
      fightAnswer = scan.nextLine();
      if (fightAnswer.equals("yes") || fightAnswer.equals("y") || fightAnswer.equals("Yes") || fightAnswer.equals("Y")) 
      {
        while(monster.getHP() > 0 && character.getHitPoints() > 0)
        {
          String actionAnswer = "";
          SlowText.slowText("\nYou currently have " + character.getHitPoints() + " HP and " + character.getDamage() + " attack damage. Do you want to (h)eal, (a)ttack, or (r)un to the next monster ");
          actionAnswer = scan.nextLine();
          if(actionAnswer.equals("h") && potions > 0)
          {
            character.heal(20);
            if(character.getHitPoints() + 20 < characterMaxHP)
            {
              SlowText.slowText("\n*You have healed for 20 HP and dodged the monster's incoming attack.*");
              potions--;
            }
            else if(character.getHitPoints() == characterMaxHP)
            {
              SlowText.slowText("\n*You cannot heal, you can't go above your current HP");
            }
            else if(character.getHitPoints() + 20 > characterMaxHP)
            {
              character.heal(characterMaxHP - character.getHitPoints());
              SlowText.slowText("\n*You have healed for " + (characterMaxHP - character.getHitPoints()) + " HP*");
            }
          }
          else if(actionAnswer.equals("h") && potions <= 0)
          {
            SlowText.slowText("\n*You currently do not have any potions on you.");
            SlowText.slowText("*\nThe monster hits you for " + monster.getAD() + " and you now have " + character.getHitPoints() + " HP");
            if(character.getHitPoints() <=0)
            {
              System.out.println();
              SlowText.slowText("*\nYou failure, you have died.*");
              System.exit(0);
            }
          }
          if(actionAnswer.equals("a"))
          {
            monster.takeDamage(character.getDamage());
            character.takeDamage(monster.getAD());
            SlowText.slowText("\n*You dealt " + character.getDamage() + " damage to the monster and it now has " + monster.getHP()+ " HP*");
            if(monster.getHP() <= 0)
            {
              SlowText.slowText("\nThe monster has been slain." + "\nYour current HP is: " + character.getHitPoints());
              counter++;
              character.increaseScore();
            }
            else if(monster.getHP() > 0)
            {
              SlowText.slowText("\nThe monster hits back for " + monster.getAD() + " and you now have " + character.getHitPoints() + " HP.");
              if(character.getHitPoints() <= 0)
              {
                SlowText.slowText("*\nYou failure, you have died.*");
                System.exit(0);
              }
            }
          }
          if(actionAnswer.equals("r"))
          {
            System.out.println();
            SlowText.slowText("\nYou run away to fight the next upcoming monster.");
            monster.takeDamage(monster.getHP());
          }
          if(!actionAnswer.equals("a") && !actionAnswer.equals("r") && !actionAnswer.equals("h"))
          {
            System.out.println("\n");
            SlowText.slowText("Please enter a valid option: (a) for attack, (h) for heal, or (r)un to the next monster.");
            actionAnswer = scan.nextLine();
          }
        }
      }
      if (character.getHitPoints()<=0)
      {
        SlowText.slowText("*\nYou failure, you have died.*");
      }
      if (counter >= 3)
      {
        SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " You can leave choose to leave with your current earnings if you want. You won't be able to upgrade your equipment as much, however.");
        String leaveDungeonAnswer = "";
        SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Do you want to stop fighting these monsters? ");
        leaveDungeonAnswer = scan.nextLine();
        if(leaveDungeonAnswer.equals("yes") || leaveDungeonAnswer.equals("y") || leaveDungeonAnswer.equals("Y") || leaveDungeonAnswer.equals("YES"))
        {
          minMonsterKilled = false;
        }
      }
      if (counter == 5)
      {
        SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " The monsters are starting to get harder. Be careful...");
      }
      if (counter == 10)
      {
        SlowText.slowText("\n*You encounter a large monster that takes you out within seconds. The scenery turns black and you slowly get enveloped by the darkness.*");
        SlowText.slowText("\n*The monster did " + Integer.MAX_VALUE + " damage to you. And you died instantly.");
        System.exit(0);
      }
    }
    balance  = counter * 100;
    character.setMoney(balance);
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Nice work runt, you now have $" + character.getMoney() + ". Come, I will bring you to the shop. This will be your last destination before facing the mighty boss.");
    System.out.println();
    SlowText.slowText("*You follow the gnome into the shop.*");
    System.out.println();
    String shopAnswer = "";
    SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Hello, how many I be of service for you? Are you interested in our swords, bows, or staffs? ");
    shopAnswer = scan.nextLine();
    while(!shopAnswer.equals("swords") && !shopAnswer.equals("bows") && !shopAnswer.equals("staffs"))
    {
      SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " That is not one of the things that I said. Please try another item.");
      shopAnswer = scan.nextLine();
    }
    if (shopAnswer.equals("swords"))
    {
      SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " We have a wooden sword for $100 and a magic sword for $500. Which one do you want to buy? ");
      shopAnswer = scan.nextLine();
      if (shopAnswer.equals("wooden sword") && character.getMoney() >= 100)
      {
        character.newWeapon("wooden sword");
        character.increaseAttack(25);
        character.setMoney(-100);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
      else if (shopAnswer.equals("wooden sword") && character.getMoney() < 100)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney());
      }
      else if (shopAnswer.equals("magic sword") && character.getMoney() >= 500)
      {
        character.newWeapon("magic sword");
        character.increaseAttack(100);
        character.setMoney(-500);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
      else if (shopAnswer.equals("magic sword") && character.getMoney() < 500)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney() + "I'll give you the wooden sword instead");
        character.newWeapon("wooden sword");
        character.increaseAttack(25);
        character.setMoney(-100);
      }
    }
    if (shopAnswer.equals("bows"))
    {
      SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " We have a wooden bow for $100 and a magic bow for $500. Which one do you want to buy? ");
      shopAnswer = scan.nextLine();
      if (shopAnswer.equals("wooden bow") && character.getMoney() >= 100)
      {
        character.newWeapon("wooden bow");
        character.increaseAttack(50);
        character.setMoney(-100);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
      if (shopAnswer.equals("wooden bow") && character.getMoney() < 100)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney());
      }
      if (shopAnswer.equals("magic bow") && character.getMoney() >= 500)
      {
        character.newWeapon("magic bow");
        character.increaseAttack(200);
        character.setMoney(-500);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
      if (shopAnswer.equals("magic bow") && character.getMoney() < 500)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney() + "I'll give you the wooden bow instead");
        character.newWeapon("wooden bow");
        character.increaseAttack(50);
        character.setMoney(-100);
      }
    }
    if (shopAnswer.equals("staffs"))
    {
      SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " We have a wooden staff for $100 and a magic staff for $500. Which one do you want to buy? ");
      shopAnswer = scan.nextLine();
      if (shopAnswer.equals("wooden staff") && character.getMoney() >= 100)
      {
        character.newWeapon("wooden staff");
        character.increaseAttack(75);
        character.setMoney(-100);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
      else if (shopAnswer.equals("wooden staff") && character.getMoney() < 100)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney());
      }
      else if (shopAnswer.equals("magic staff") && character.getMoney() >= 500)
      {
        character.newWeapon("magic staff");
        character.increaseAttack(300);
        character.setMoney(-500);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
      if (shopAnswer.equals("magic staff") && character.getMoney() < 500)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney() + "I'll give you the wooden stagf instead");
        character.newWeapon("wooden staff");
        character.increaseAttack(75);
        character.setMoney(-100);
      }
    }
    String characterWeapon = character.getWeapon();
    SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " There's also armor for you to buy so that you can have more HP");
    if (characterWeapon.equals("wooden sword") || characterWeapon.equals("magic sword") || characterWeapon.equals("dull sword"))
    {
      SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " We have a iron armor for $100 and diamond armor for $400. Which one do you want to buy? ");
      shopAnswer = scan.nextLine();
      while(!shopAnswer.equals("iron armor") && !shopAnswer.equals("diamond armor"))
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " That is not one of the things that I said. Please try another item.");
        shopAnswer = scan.nextLine();
      }
      if (shopAnswer.equals("iron armor") && character.getMoney() < 100)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney());
      }
      else if (shopAnswer.equals("iron armor") && character.getMoney() >= 100)
      {
        character.increaseHP(100);
        character.setMoney(-100);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
      else if (shopAnswer.equals("diamond armor") && character.getMoney() < 400)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney() + "I'll buy you the iron armor even if you don't have enough.");
        character.increaseHP(100);
        character.setMoney(-1 * character.getMoney());
      }
      else if (shopAnswer.equals("diamond armor") && character.getMoney() >= 400)
      {
        character.increaseHP(300);
        character.setMoney(-400);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
    }
    if (characterWeapon.equals("wooden bow") || characterWeapon.equals("magic bow") || characterWeapon.equals("rusty bow"))
    {
      SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " We have a leather armor for $100 and a chainmail armor for $400. Which one do you want to buy? ");
      shopAnswer = scan.nextLine();
      while(!shopAnswer.equals("leather armor") && !shopAnswer.equals("chainmail armor"))
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " That is not one of the things that I said. Please try another item.");
        shopAnswer = scan.nextLine();
      }
      if (shopAnswer.equals("leather armor") && character.getMoney() < 100)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney());
      }
      else if (shopAnswer.equals("leather armor") && character.getMoney() >= 100)
      {
        character.increaseHP(100);
        character.setMoney(-100);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
      else if (shopAnswer.equals("chainmail armor") && character.getMoney() < 400)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney());
      }
      else if (shopAnswer.equals("chainmail armor") && character.getMoney() >= 400)
      {
        character.increaseHP(300);
        character.setMoney(-400);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
    }
    if (characterWeapon.equals("wooden staff") || characterWeapon.equals("magic staff") || characterWeapon.equals("beginner's staff"))
    {
      SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " We have a wizard's robe for $100 and an archmage's robe for $400. Which one do you want to buy? ");
      shopAnswer = scan.nextLine();
      while(!shopAnswer.equals("wizard's robe") && !shopAnswer.equals("archmage's robe"))
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " That is not one of the things that I said. Please try another item.");
        shopAnswer = scan.nextLine();
      }
      if (answer.equals("wizard's robe") && character.getMoney() < 100)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney());
      }
      else if (shopAnswer.equals("wizard's robe") && character.getMoney() >= 100)
      {
        character.increaseHP(100);
        character.setMoney(-100);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
      else if (answer.equals("archmage's robe") && character.getMoney() < 400)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " Sorry but you do not have enough money for this purchase. You have $" + character.getMoney() + "I'll buy you the wizard's robes even if you don't have enough.");
        character.increaseHP(100);
        character.setMoney(-1 * character.getMoney());
      }
      else if (shopAnswer.equals("archmage's robe") && character.getMoney() >= 400)
      {
        character.increaseHP(300);
        character.setMoney(-400);
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " You now have $" + character.getMoney());
      }
    }
    SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + " There are also health potions for you to buy if you have enough money. Health potions cost $10 each and there is no limit to how much you can buy. :)");
    String potionAnswer = "";
    if(character.getMoney() > 10)
    {
      SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + "How many potions do you want to buy?");
      potionAnswer = scan.nextLine();
      int potionAmt = Integer.parseInt(potionAnswer);
      while(character.getMoney() < potionAmt * 10)
      {
        SlowText.slowText(TEXT_YELLOW + "\nShop Keeper:" + TEXT_RESET + "Sorry but you do not have enough money to buy this many potions.");
        SlowText.slowText(TEXT_YELLOW + "Shop Keeper:" + TEXT_RESET + " How many potions would you like to buy?");
      }
      if(character.getMoney() >= potionAmt * 10)
      {
        potions = potionAmt;
      }
    }
    System.out.println();
    System.out.print(character);
    System.out.println();
    SlowText.slowText("Potions: " + potions);
    System.out.println();
    SlowText.slowText("\n*That is your current stats*");
    SlowText.slowText(TEXT_GREEN + "\nGnome:" + TEXT_RESET + " Lets go back to the dungeon to face the boss.");
    SlowText.slowText("\n*You go to the dungeon and you try to attempt to kill the boss.*");
    SlowText.slowText(TEXT_BLUE + "\n" + name + ":" + TEXT_RESET + " Why is this so hard? I thought that my new weapon would be enough to kill it.");
    SlowText.slowText("\n*The boss swings their club and you only have" + (character.getHitPoints() - 50) + " hitpoints left." + TEXT_RED + " Be careful, the boss does a lot of damage!" + TEXT_RESET + "*");
    while(boss.getHP() > 0 && character.getHitPoints() > 0)
    {
      String fightBossAnswer = "";
      SlowText.slowText("*\nYou currently have " + character.getHitPoints() + " HP and " + character.getDamage() + " attack damage. Do you want to (h)eal or (a)ttack the boss. BTW there's no running away from him.*");
      fightBossAnswer = scan.nextLine();
      if(fightBossAnswer.equals("h") && potions > 0)
      {
        character.heal(20);
        if(character.getHitPoints() + 20 < characterMaxHP)
        {
          SlowText.slowText("\n*You have healed for 20 HP and dodged the boss's incoming attack.*");
          potions--;
        }
        else if(character.getHitPoints() == characterMaxHP)
        {
          SlowText.slowText("\n*You cannot heal, you can't go above your current HP");
        }
        else if(character.getHitPoints() + 20 > characterMaxHP)
        {
          character.heal(characterMaxHP - character.getHitPoints());
          SlowText.slowText("\n*You have healed for " + (characterMaxHP - character.getHitPoints()) + " HP*");
        }
      }
      else if(fightBossAnswer.equals("h") && potions <= 0)
      {
        SlowText.slowText("\n*You currently do not have any potions on you.");
        SlowText.slowText("\n*The boss hits you for " + boss.getAD() + " damage and you now have " + character.getHitPoints() + " HP*");
        if(character.getHitPoints() <= 0)
        {
          System.out.println();
          SlowText.slowText("*\nYou failure, you have died." + TEXT_RED + "You can't turn back now, you have sealed your fate!" + TEXT_RESET + "*");
          System.exit(0);
        }
      }
      if(fightBossAnswer.equals("a"))
      {
        boss.takeDamage(character.getDamage());
        character.takeDamage(boss.getAD());
        SlowText.slowText("\n*You dealt " + character.getDamage() + " damage to the boss and it now has " + boss.getHP()+ " HP*");
        if(boss.getHP() <= 0)
        {
          SlowText.slowText("*\nThe boss has been slain." + "\nYour current HP is: " + character.getHitPoints());
        } 
        else if(boss.getHP() > 0)
        {
          SlowText.slowText("*\nThe boss hits back for " + boss.getAD() + " damage and you now have " + character.getHitPoints() + " HP.*");
          if(character.getHitPoints() <= 0)
          {
            System.out.println();
            SlowText.slowText("*\nYou failure, you have died." + TEXT_RED + "You can't turn back now, you have sealed your fate!" + TEXT_RESET + "*");
            System.exit(0);
          }
        }
        if(!fightBossAnswer.equals("a") && !fightBossAnswer.equals("h"))
        {
          System.out.println("\n");
          SlowText.slowText("*Please enter a valid option: (a) for attack or (h) for heal for the boss.*");
          fightBossAnswer = scan.nextLine();
        }
      }
    }
    SlowText.slowText("*A figure appears out of no where from the ruins of the dungeon.*");
    SlowText.slowText(TEXT_BLUE + "\n" + name + TEXT_RESET + ": God is that you?");
    SlowText.slowText(TEXT_PURPLE + "\nGOD:" + TEXT_RESET + " Yes, you can call me God. And wow you actually did it. The first commoner to ever defeat one of the bosses in this dungeon.");
    SlowText.slowText(TEXT_BLUE + "\n" + name + TEXT_RESET + ": Do I get anything for winning?");
    SlowText.slowText(TEXT_PURPLE + "\nGOD:" + TEXT_RESET + ": Ah yes, you get a wish. I shall grant you anything that you ask for. So, what do you wish for?");
    System.out.println("\n");
    SlowText.slowText(TEXT_BLUE + "\n" + name + TEXT_RESET + ": ");
    answer = scan.nextLine();
    SlowText.slowText(TEXT_PURPLE + "\nGOD:" + TEXT_RESET + ": Your wish is my command. SIKE YOU WOULD'VE THOUGHT.");
    SlowText.slowText("*The God knocks you unconscious. You eventually wake up binding in a large and dark room. It seems really familiar for some reason. It is as if you have been here before. After a while,you remmeber that it reminds you of the room you were in when you killed that boss. \nAfter you look around, you realize that you have become the boss. It is now your duty to fight off challengers that have the courage to even enter the room that you are in.*");
  }
}