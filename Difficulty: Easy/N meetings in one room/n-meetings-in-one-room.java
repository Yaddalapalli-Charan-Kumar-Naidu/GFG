class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        ArrayList<int[]> arr=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            arr.add(new int[]{start[i],end[i]});
        }
        Collections.sort(arr, (a, b) -> a[1] - b[1]);
        int total=1;
        int lastEnd=arr.get(0)[1];
        for(int i=1;i<arr.size();i++){
            if(lastEnd<arr.get(i)[0]){
                total++;
                lastEnd=arr.get(i)[1];
            }
        }
        return total;
    }
}
