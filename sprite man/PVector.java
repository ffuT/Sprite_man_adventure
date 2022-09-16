public class PVector {
    float x,y;
    float mag = mag();

    public PVector(float x, float y){
        this.x = x;
        this.y = y;
        mag = (float) Math.sqrt(x*x + y*y);
    }
    public PVector(){
        this.x = 0;
        this.y = 0;
    }
    public float mag(){
        mag =(float) Math.sqrt(x*x + y*y);
        if(mag==0){
            return Math.abs(x-y);
        }
        
        return mag;
    }
    public int getx(){
        return (int) this.x;
    }
    public int gety(){
        return (int) this.y;
    }
    public void set(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void add(PVector v2){
        this.x = this.x + v2.x;
        this.y = this.y + v2.y;
    }
    public PVector add(PVector v1, PVector v2){
        return new PVector(v1.x+v2.x,v1.y+v2.y);
    }
    public void sub(PVector v2){
        this.x = this.x - v2.x;
        this.y = this.y - v2.y;
    }
    public PVector sub(PVector v1, PVector v2){
        return new PVector(v1.x-v2.x,v1.y-v2.y);
    }
    public void mult(Float n){
        x = x * n;
        y = y * n;
    }
    public void mult(PVector n){
        x = x * n.x;
        y = y * n.y;
    }
    public void div(Float n){
        x = x / n;
        y = y / n;
    }
    public void normalize(){
        mag();
        float m = mag;
        if (m != 0) {
            div(m);
        }
    }
    public PVector get(){
        return new PVector(this.x, this.y);
    }
    public void PrintV(){
        System.out.println("("+x+","+y+")");
    }

}
