import java.util.Stack;

public class One {
    public boolean validBrackets(String test) {
        Stack<Character> charStack = new Stack<>();
        // Converts string of characters into an Array of characters.
        char[] charArray = test.toCharArray();

        // This loop iterates through each character of the given string
        // to check for each type of bracket case.
        for (int i = 0; i < charArray.length; i++) {
            // These if statements check the current character in the string
            // to see if they are a type of bracket.
            // If so, they are pushed onto a stack. 
            if (charArray[i] == '(') {
                charStack.push(charArray[i]);
            }

            if (charArray[i] == '{') {
                charStack.push(charArray[i]);
            }

            if (charArray[i] == '[') {
                charStack.push(charArray[i]);
            }

            // These if statements check for closing brackets of each type,
            // and if the current head of the stack is a matching bracket.

            // If the closing bracket has a matching opening bracket at the head 
            // of the stack, the opening bracket is popped and the loop
            // moves on to the next bracket in the order of characters in the string. 
            
            // If the closing bracket does not have a matching opening bracket,
            // that means the order of brackets is incorrect in the string, returns false.
            if (charArray[i] == ')') {
                if (!charStack.isEmpty() && charStack.peek() == '(') {
                    charStack.pop();
                } else {
                    return false;
                }
            }

            if (charArray[i] == '}') {
                if (!charStack.isEmpty() && charStack.peek() == '{') {
                    charStack.pop();
                } else {
                    return false;
                }
            }

            if (charArray[i] == ']') {
                if (!charStack.isEmpty() && charStack.peek() == '[') {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }

        // If the stack stack is not empty, that means there is an opening bracket
        // that did not have a matching closing bracket, meaning the brackets are incorrect.
        if (!charStack.isEmpty()) {
            return false;
        }
        // If all checks have been passsed without false being returned, 
        // that means the order of brackets in the string is correct.
        return true;
    }

    public static void main(String[] args) throws Exception {
        String string_1 = "()";
        String string_2 = "()[]{}";
        String string_3 = "({[";
        String string_4 = "]})";
        String string_5 = "({[{}]})";
        String string_6 = "({)[}]";
        String string_7 = "...(...{...[...]...}...)...";
        One isValid = new One();

        System.out.println(string_1 + " is valid? --- " + isValid.validBrackets(string_1));
        System.out.println(string_2 + " is valid? --- " + isValid.validBrackets(string_2));
        System.out.println(string_3 + " is valid? --- " + isValid.validBrackets(string_3));
        System.out.println(string_4 + " is valid? --- " + isValid.validBrackets(string_4));
        System.out.println(string_5 + " is valid? --- " + isValid.validBrackets(string_5));
        System.out.println(string_6 + " is valid? --- " + isValid.validBrackets(string_6));
        System.out.println(string_7 + " is valid? --- " + isValid.validBrackets(string_7));
    }
}