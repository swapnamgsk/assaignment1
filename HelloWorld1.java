class HelloWorld1 {
    public static void main(String[] args) {
        int num = 156;
        int armstrongNum = 0;
        
        String numString = "" + num;
        
        for (int i =0;i < numString.length(); i++ )
        {
            int chNum = numString.charAt(i) - '0';
            armstrongNum +=  Math.pow(chNum,numString.length()); 
        }
        
        if(num == armstrongNum)
        {
            System.out.println("Armstrong Number" + num + ":" + armstrongNum);
        }
        else
        {
            System.out.println("Not an Armstrong Number"  + num + ":" + armstrongNum);
        }
    }
}
