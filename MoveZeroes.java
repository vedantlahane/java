class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroes(nums);
        for(int i = 0 ; i < nums.length ; i++ ){
            System.out.print(nums[i] + " ");
        }
    }
    public void moveZeroes(int[] nums) {
        //int index = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++ ){
            if( nums[i] != 0 ){
                count++;
            }
        }
        for(int i = 0 ,index = 0; i < nums.length ; i++ ){
            if( nums[i] != 0 && index < count ){
                nums[index] = nums[i];
                index++;
            }
        }
        for( int  i = count ; i < nums.length ; i++ ){
            nums[i] = 0;
        }

    }
}