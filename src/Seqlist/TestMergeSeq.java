package Seqlist;

public class TestMergeSeq {
    public static void main(String[] args) {
        int[] A=new int[]{1,2,3,65,79};
        int[] B=new int[]{8,9,13,18,19,23,27,87};
        int[] C=new int[A.length+B.length];
        TestMergeSeq t1=new TestMergeSeq();
        t1.mergerSeqList(A,B,C);
        //打印新数组
        for(int i=0;i<C.length;i++){
            System.out.println(C[i]+":");
        }
    }
    //合并算法
    public boolean mergerSeqList(int[] A,int[] B,int[] C){
        if((A.length+B.length)>C.length){
            return false;

        }
        int i=0,j=0,k=0;
        while (i<A.length&&j<B.length){
            if(A[i]<B[j]){
                C[k++]=A[i++];
            }
            else {
                C[k++]=B[j++];
            }
        }
        while(i<A.length){
            C[k++]=A[i++];
        }
        while(j<B.length){
            C[k++]=B[j++];
        }
       return true;

    }


}

