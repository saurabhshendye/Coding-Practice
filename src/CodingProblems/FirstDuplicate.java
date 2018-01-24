package CodingProblems;

public class FirstDuplicate {
    int firstDuplicate(int[] a) {
//        Solution with O(n) time and space complexity
//     HashMap map = new HashMap();
//     for (int i=0; i<a.length; i++){
//         if(map.containsValue(new Integer(a[i]))){
//             return a[i];
//         }else{
//             map.put(new Integer(i), new Integer(a[i]));
//         }
//     }

//     return -1;

        // Solution with O(n) time complexity and O(1) space complexity
        for(int i=0; i< a.length; i++){
            if(a[Math.abs(a[i]) -1] < 0){
                return Math.abs(a[i]);
            } else{
                a[Math.abs(a[i]) -1] = -a[Math.abs(a[i]) -1];
            }
        }

        return -1;
    }
}
