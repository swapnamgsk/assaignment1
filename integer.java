class integer {
    public static void main(String[] args)
    {
        int x=123;
        //its convert number into string
        
        String y=""+x;
        
        System.out.println(y);
        
        //checking type of output 
        
        System.out.println(((Object)y).getClass().getSimpleName());
    }
}
