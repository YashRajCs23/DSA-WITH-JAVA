// package finques;
import java.util.*;
public class Anagram {
    static HashMap<Character,Integer> makeFreqMap(String str){
        for (int i = 0; i < str.length(); i++) {
            Character ch=str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int currFreq=mp.get(ch);
                mp.put(ch,currFreq+1);
            }           
        }
        return mp;
    }

    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>mp=makeFreqMap(s);
        Character ch=t.charAt(i);
        if(!mp.containsKey(ch)) return  false;
        int currFreq=mp.get(ch);
        mp.put(ch,currFreq-1);
    }
    for(Integer i:mp.values()){
        if(i!=0) return false;
    }
    return true;
    }