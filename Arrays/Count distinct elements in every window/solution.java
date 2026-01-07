class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int n=arr.length;
        ArrayList<Integer> result =new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        result.add(map.size());
        
        for(int i=k;i<n;i++){
            int removeStartData=arr[i-k];
            map.put(removeStartData,map.get(removeStartData)-1);
            if(map.get(removeStartData)==0){
                map.remove(removeStartData);
            }
            
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            result.add(map.size());
        }
        return result;
        
    }
}