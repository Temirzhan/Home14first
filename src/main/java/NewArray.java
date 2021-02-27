public class NewArray {
    public int[] getAfterFour(int[] array){
        int lastFour = -1;
        if(array.length == 0)
            throw new RuntimeException();
        for(int i = 0; i < array.length; i++){
            if(array[i] == 4)
                lastFour = i;
        }
        if(lastFour != -1){
            lastFour++;
            int[] newArray = new int[array.length - lastFour];

            for (int i = lastFour; i < array.length; i++){
                newArray[i-lastFour] = array[i];
            }
            return newArray;
        }else {
            throw new RuntimeException();
        }

    }

    public boolean haveOneAndFour(int[] array){
        boolean i1 = false;
        boolean i4 = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 4);
            i4= true;
            if (array[i]==1)
                i1 = true;
        }
        if(i1&&i4)
            return true;
        else return false;
    }
}
