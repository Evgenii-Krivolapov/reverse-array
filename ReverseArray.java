package practice.reverseArray;



public class ReverseArray {

    public static String[] reverse(String[] strings) {
        int text = strings.length;
        String name;
        for (int i = 0; i < text/2; i++){
            name = strings[text-i-1];
            strings[text-i-1] = strings[i];
            strings[i] = name;
        }
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        return strings;
    }

}