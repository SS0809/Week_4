package java.org.regex.replacemodify;

//Replace Multiple Spaces with a Single Space
//🔹 Example Input:
//        "This is an example with multiple spaces."
//        🔹 Expected Output:
//        "This is an example with multiple spaces."
public class MultipleToSingleSpace {
    String replace(String input){
        String regex = "\\s+",res = "";
        return input.replaceAll(regex, " ");
    }
    public static void main(String[] args) {
        String input = "This      is  an example  with multiple  spaces.";
        MultipleToSingleSpace ms = new MultipleToSingleSpace();
        System.out.println(ms.replace(input));
    }
}
