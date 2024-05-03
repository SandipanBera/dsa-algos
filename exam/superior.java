package exam;

public class superior {
    public static void main(String[] args) {
        System.out.println(findSuperior(new int[] { 2, 8, 9, 7, 4, 2 }));

    }

    public static int findSuperior(int[] arr) {
        if (arr == null || arr.length < 1)
            return -1;
        int i = 0;
        int result = 1;      
        while (i < arr.length - 1) {
            boolean flag = true;
            int j = i + 1;
            while (j < arr.length) {
                if (arr[i] < arr[j]) {
                    flag = false;
                    break;
                }
                j++;
            }
            result=flag?++result:result;            
            i++;
        }
        
        return result;
        
    }
}
