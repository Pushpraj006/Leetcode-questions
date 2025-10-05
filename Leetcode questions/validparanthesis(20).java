class Solution {
    public boolean isValid(String s) {
        String prev;
        do {

        // assingn the value of the string s in the prev
            prev = s;
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        } while (!s.equals(prev)); 
        // if the prev becomes equals to the s the the loop will stop and then we will returnthe result
        return s.isEmpty();

        // this return line will gives true if the string is empty and return false if the string is not empty 
    }
}
