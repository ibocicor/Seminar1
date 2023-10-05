public class Problem1A {

    public static boolean sequantial_search(int[] array, int nr){
        for ( int i = 0; i < array.length; i++)
            if (nr == array[i])
                return true;
        return false;
    }
    public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Please provide at least 2 arguments!");
            return;
        }

        int numberToSearchFor = Integer.parseInt(args[0]);
        int arrayLength = args.length - 1;
        int[] arrayNumbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
            arrayNumbers[i] = Integer.parseInt(args[i+1]);
        if (sequantial_search(arrayNumbers, numberToSearchFor) == true)
            System.out.println("Number was found");
        else System.out.println("Number was not found");
    }
}
