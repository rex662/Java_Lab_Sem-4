public class exp5 {
    public static void main(String[] args) {
        String str1 = "Madhav";
        String str2 = "MITS";
        String str3 = new String("Java");

        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Substring from str3: " + str3.substring(1, 4));
        System.out.println("Is str1 equal to str2? " + str1.equals(str2));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());
        System.out.println("Replacing 'Java' with 'Python': " + str3.replace("Java", "Python"));
        System.out.println("Does str3 contain 'av'? " + str3.contains("av"));
        String sentence = "Thus the world was created";
        String[] words = sentence.split(" ");
        System.out.println("Words in sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
