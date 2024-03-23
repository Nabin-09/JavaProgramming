class box{
    int h;
    int w;
    int b;
}
class demo{
    public static void main(String[] args) {
        box mb = new box();
        double vol;
        mb.h = 2;
        mb.w = 3;
        mb.b = 8;
        vol = mb.h * mb.w * mb.b;
        System.err.println("The volume of box is "+vol);
    }
}