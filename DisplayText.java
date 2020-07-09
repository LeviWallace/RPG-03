public class DisplayText {
    
    public static void display(String output) throws InterruptedException
    {
        String[] words = output.split(" ");
        int count = 0;
        for (String word: words)
        {   
            count += word.length();
            System.out.print(word + " ");
            Thread.sleep(250);
            if (count >= 60)
            {
                System.out.print("\n");
                count = 0;
            }
        }
    }
}