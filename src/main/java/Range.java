public class Range {
    private int start;
    private int end;

    public Range(int start, int end){
        this.start = start;
        this.end = end;

        if (start > end){
            throw new IndexOutOfBoundsException();
        }
    }

    public int getStart() {
        return start;
    }

    public void setStart(int value) {
        this.start = value;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int value) {
        this.end = value;
    }

    public int length(){
        return this.end - this.start;
    }

}
