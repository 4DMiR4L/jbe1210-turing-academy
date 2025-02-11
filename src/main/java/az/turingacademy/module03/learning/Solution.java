package az.turingacademy.module03.learning;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        HashMap<Character, String> phone = new HashMap<>();
        phone.put('2', "abc");
        phone.put('3', "def");
        phone.put('4', "ghi");
        phone.put('5', "jkl");
        phone.put('6', "mno");
        phone.put('7', "pqrs");
        phone.put('8', "tuv");
        phone.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        for (char digit : digits.toCharArray()) {
            String letters = phone.get(digit);
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentCombination = queue.poll();
                for (char letter : letters.toCharArray()) {
                    queue.offer(currentCombination + letter);
                }
            }
        }
        result.addAll(queue);
        return result;
    }
}
