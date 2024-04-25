package capitulo5.string;

public class StringType {
    public static void main(final String args[]) {
        char[] helloArray = {'H', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        int len = helloString.length();
        System.out.println("String Length is : " + len);

        helloString = helloString.concat(" World ");
        System.out.println(helloString);

        System.out.println(helloString.charAt(6));

        System.out.println(helloString.indexOf('l'));

        System.out.println(helloString.substring(3));

        System.out.println(helloString.toUpperCase());

        System.out.println(helloString.equals("ABC"));

        System.out.println(helloString.startsWith("a"));

        System.out.println(helloString.contains("o"));

        System.out.println(helloString.replace('e', 'a'));

        System.out.println(helloString.trim());

        String str = "world";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

}
