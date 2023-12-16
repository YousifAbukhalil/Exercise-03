public class DecipherText {
    public static void main(String[] args) {
        String secretMessage = "evuubemy bqiw ndkyltmwu pyou izeapndz nlmbv ...";
        String[] words = secretMessage.split("\\s+");

        for (String word : words) {
            String decipheredWord = reverseCharacters(word);
            System.out.print(decipheredWord + " ");
        }
    }

    private static String reverseCharacters(String word) {
        char[] characters = word.toCharArray();
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            start++;
            end--;
        }

        return new String(characters);
    }
}
