/******************************************************************************
TO DO A ALPHABETICAL SEARCH OF AN ELEMENT
if it key is found then return it else return the ceil of that key
{ceil of a element is smallest element which is greater than a key Alphabet}
*******************************************************************************/

public class Main {
    public static char alphabetical_search(char[] chars, char target) {
        int start = 0;
        int end = chars.length - 1;
        char res = '\0'; // Initialize res with a default value

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (chars[mid] == target) {
                return chars[mid]; // Exact match, so target is the ceiling
            } else if (chars[mid] < target) {
                start = mid + 1;
            } else {
                res = chars[mid]; // Update the result
                end = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'c', 'd', 'f', 'i', 'l'};
        char target = 'a';
        char val = alphabetical_search(chars, target);
        if (val == target) {
            System.out.println("The target value is: " + val);
        } else {
            System.out.println("The ceiling value is: " + val);
        }
    }
}
