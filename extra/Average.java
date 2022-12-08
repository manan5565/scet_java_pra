class Average {
    public static void main(String args[]) {
        int nums[] = { 10, 11, 12, 13, 14 };
        int result = 0;
        int i;
        for (i = 0; i < 5; i++)
            result = result + nums[i];
        System.out.println("Average is " + result / 5);
    }
}