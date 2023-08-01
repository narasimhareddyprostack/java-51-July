class Test{
     public static void main(String[] args){
        int[]  marks={35,36,37,38,99};
        //index        0   1  2 3  4
        System.out.println(marks);
        //read array elements - using index
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        //System.out.println(marks[10]); RE - ie AIOBE
        marks[4] = 39;
        System.out.println(marks[4]);
        
     }
}