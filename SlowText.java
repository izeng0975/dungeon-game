public class SlowText
{
  public static void slowText(String text)
  {
    try
    {
      for(int i = 0; i < text.length(); i++)
      {
         System.out.print(text.charAt(i));
         Thread.sleep(100);
      }
    }
    catch (Exception e) {}
  }
}