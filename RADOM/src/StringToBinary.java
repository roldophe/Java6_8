class StringToBinary {
    static void strToBinary(String s){
        int n=s.length();
        for(int i=0; i<n ; i++){
            //convert each char to ASCII value
            int value = Integer.valueOf(s.charAt(i));

            //Covert ASCII value to Binary
            String binary = "";
            while(value>0){
                if(value%2==1){
                    binary +='1';
                }
                else{
                    binary += '0';
                }
                value=value/2;
            }
            binary = reverse(binary);
            System.out.print(binary+" ");
        }
    }
    static String reverse(String input){
        char[] arrays = input.toCharArray();
        int l, r=0;
        r= arrays.length-1;
        for(l=0; l<r; l++,r--){
            //swap values of l and r
            char temp=arrays[l];
            arrays[l]=arrays[r];
            arrays[r]=temp;
        }
        return String.valueOf(arrays);
    }

    //Driver code
    public static void main(String[] args){
        String str="RADOM";
        strToBinary(str);
    }
}
