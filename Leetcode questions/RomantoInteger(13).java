class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while(i< s.length()){
            // for the subcase (two romannumber like IX ,IV etc)
            if(i+1 < s.length()){
                String twochar = s.substring(i,i+2);
                if(twochar.equals("IV")){
                    sum +=4;
                    i +=2;
                    continue;
                }
                else if(twochar.equals("IX")){
                    sum +=9;
                    i +=2; 
                    continue;
                }
                else if(twochar.equals("XL")){
                    sum +=40;
                    i +=2;
                    continue;
                }
                else if(twochar.equals("XC")){
                    sum+=90;
                    i+=2;
                    continue;
                }
                else if(twochar.equals("CD")){
                    sum+=400;
                    i+=2;
                    continue;
                }
                else if(twochar.equals("CM")){
                    sum+=900;
                    i+=2;
                    continue;
                }
            }


            //single character checking
            char c = s.charAt(i);
            if(c == 'I'){
                sum +=1;
                i +=1;
            }
            else if( c== 'V'){
                sum+=5;
                i +=1;
            }
            else if(c == 'X'){
                sum +=10;
                i+=1;
            }
            else if(c== 'C'){
                sum +=100;
                i+=1;
            }
            else if(c == 'L'){
                sum+=50;
                i+=1;
            }
            else if(c=='D'){
                sum+=500;
                i+=1;
            }
            else if(c == 'M'){
                sum += 1000;
                i+= 1;
            }
        }
        return sum;
    }
}
