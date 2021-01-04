public class Range {
    private int start;
    private int end;

    public Range(int range){
        start = 0;
        end = range;

        if (start > end){
            throw new IndexOutOfBoundsException();
        }
    }

    public int getStart() {
        return 0;
    }

    /*public void setStart(int value) {
        this.start = value;
    }*/

    public int getEnd() {
        return end;
    }

    /*public void setEnd(int value) {
        this.end = value;
    }*/

    public int length(){
        return this.end - this.start;
    }

}
