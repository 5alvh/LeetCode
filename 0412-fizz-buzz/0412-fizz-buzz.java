class Solution {
    public List<String> fizzBuzz(int n) {
        
        ArrayList response = new ArrayList<String>();
        for(int i=0; i<n; i++){
            int i1 = i+1;
            if( i1%3== 0 && i1%5 ==0){
                response.add("FizzBuzz");
                continue;
            }else if(i1%3== 0){
                response.add("Fizz");
            }else if(i1%5== 0){
                response.add("Buzz");
            }else{
                response.add(Integer.toString(i+1));
            }
        }
        return response;
    }
}