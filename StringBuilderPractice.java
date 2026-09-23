class first
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Stringa");
        for(int i = 0;i<sb.length()/2;i++)
        {
            int front = 0;
            int back = sb.length() - 1 - i;

            char fronta = sb.charAt(front);
            char backa = sb.charAt(back);

            sb.setCharAt(front, backa);
            sb.setCharAt(back,fronta );
        }
        System.out.println(sb);
    }
}
