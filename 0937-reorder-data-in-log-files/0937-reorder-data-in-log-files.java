class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> let=new ArrayList<>();
        List<String> dig=new ArrayList<>();
        for(int i=0;i<logs.length;i++){
            String s=logs[i];
            if(Character.isDigit(s.charAt(s.length()-1))){
                dig.add(s);
                continue;
            }
            let.add(s);
        }
        Collections.sort(let,(a,b)->{
            String s1[]=a.split(" ",2);
            String s2[]=b.split(" ",2);
            if(!s1[1].equals(s2[1])){
                return s1[1].compareTo(s2[1]);
            }
            return s1[0].compareTo(s2[0]);
    });
        String res[]=new String[logs.length];
        for(int i=0;i<let.size();i++){
            res[i]=let.get(i);
        }
        int k=let.size();
        for(int i=0;i<dig.size();i++){
            res[k++]=dig.get(i);
        }
        return res;

    }
}