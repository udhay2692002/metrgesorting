import java.util.Arrays;

public class mergelogic {



    public static int[] divide(int[] a) {

        if(a.length==1)
            return a;
        else{

        int len=a.length;
        int mid= len/2;
        int []left=divide(Arrays.copyOfRange(a,0,mid));
        int []right=divide(Arrays.copyOfRange(a,mid,len));


        return merge(left,right);
        }

    }

    public static int[] merge(int []left,int []right)

    {
        int i=0;
        int j=0;
        int k=0;

        int []joined=new int[left.length+right.length];

        while(i<left.length&&j<right.length)
        {
            if(left[i]<right[j])
            {
               joined[k++]=left[i++];
            }
            else {
                joined[k++]=right[j++];

            }

        }

        while(i<left.length)
        {
            joined[k++]=left[i++];

        }

        while(j<right.length)
        {
            joined[k++]=right[j++];

        }

        return joined;
    }

    public static void main(String []args)
    {
        int []a={3,2,4,1,};

        System.out.println(Arrays.toString(divide(a)));
    }


}
