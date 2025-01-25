public class Arrays {
    public static void main(String[] args) {
        // in the memory we don't define size then then array consider null
        // ex : int then 0 , string then '', boolean then false,float then 0.0

        // int[] marks = {}; you can define array in multiple ways
        // or
        // int marks[] = new int[];
        // or
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 90;

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
