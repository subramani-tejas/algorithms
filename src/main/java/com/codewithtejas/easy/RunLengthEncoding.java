package com.codewithtejas.easy;

public class RunLengthEncoding {

    public static String encode(String message) {
        var encodedMessage = new StringBuilder();
        int currentRunLength = 1;

        for (int i = 1; i < message.length(); i++) {
            if ((message.charAt(i) != message.charAt(i - 1)) || (currentRunLength == 9)) {
                encodedMessage.append(Integer.toString(currentRunLength))
                        .append(message.charAt(i - 1));
                currentRunLength = 0;
            }
            currentRunLength += 1;
        }
        encodedMessage.append(Integer.toString(currentRunLength))
                .append(message.charAt(message.length() - 1));

        return encodedMessage.toString();
    }

    public static void main(String[] args) {
        String message = "AAABBCFFFFFFFFFFFAAA";
        System.out.println(RunLengthEncoding.encode(message));
    }
}
