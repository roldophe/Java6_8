package Main;

public class GetFirstAndLastName {
    public static void main(String[] args) {
        String str="KHOEM RADOM";
        String[] word =  str.split(" ");
        for (int i = 0; i<word.length; i++){
            System.out.println("Word["+i+"]: = "+word[i]);
        }
    }
}

/*
assign full to word and then compare s_name
if word==s_name
so, output
 */