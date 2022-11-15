import java.util.*;

public class Minimum {
    public void minMax(double[] arr, int n){
        double sum=0;
        double max=-1;
        double min = Double.MAX_VALUE;
        for(int j=0;j<n;j++){
            max=arr[j]>max?arr[j]:max;
            min=arr[j]<min?arr[j]:min;
            sum+=arr[j];
        }

        System.out.println("maximum "+max);
        System.out.println("minimum "+min);
        System.out.println("Mean "+(max/n));
    }
    void printArray(double arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void bubble(double[] arr){
        int n=arr.length;
        double temp;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j - 1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public boolean prime(int start){
        for(int j=2;j*j<=start;j++){
            if(start%j==0){
                return false;
            }
        }
        return true;
    }

    public void remove(int[] rem,int k){
        ArrayList<Integer> result=new ArrayList<>();
        int j= rem.length;
        for(int i=0;i<rem.length;i++){
            if(rem[i]!=k){
               result.add(rem[i]);
            }
        }
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
    public void count(String letter){
        Map<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<letter.length();i++){
            char k=letter.charAt(i);
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }else{
                map.put(k,1);
            }
        }
        System.out.println(map);
    }
    public char unique(String unq){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<unq.length();i++) {
            char k = unq.charAt(i);
            if (mp.containsKey(k)) {
                mp.put(k, mp.get(k) + 1);
            } else {
                mp.put(k, 1);
            }
        }
        for(int i=0;i<unq.length();i++){
            char c=unq.charAt(i);
            if(mp.get(c)==1){
                return c;
            }
        }
        return 0;
    }
    /*Iterator<Integer> it = new Iterator<Integer>() {
        private int currentIndex=0;
        private int curr;
        @Override
        public boolean hasNext() {
            if(arr[currentIndex]&1==0 && arr.length>currentIndex){
                return true;
            }
            while(it!=null && it.hasNext()){
                curr=it.next();
                if((curr&1)==0){
                    return true;
                }
            }
            return false;
        }

        @Override
        public Integer next() {
            return Integer.valueOf(arr[currentIndex++]);
        }
    };*/
    public void even(int[] arr){
        for(int i:arr){
            if((i&1)==0){
                System.out.println(i);
            }
        }
    }


}
