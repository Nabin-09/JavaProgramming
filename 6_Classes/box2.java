public class box2 {
    int h;
    int b;
    int w;
}
class demo2{
    public static void main(String[] args) {
        box2 b1 = new box2();//Making two objects of the same class
        box2 b2 = new box2();
        b1.h = 3;
        b1.b = 5;
        b1.w = 2;
        //If we make two objects of Class box2 both have their own copy of variables. 
        b2.b = 6;
        b2.w = 9;
        b2.h = 1;
        System.out.println("The volume of Box2 from object b1 = : "+ b1.h*b1.b*b1.w);
        System.out.println("The volume of Box2 from object b2 = : "+ b2.h*b2.b*b2.w);
    }
}
/* OUTPUT 
    The volume of Box2 from object b1 = : 30
    The volume of Box2 from object b2 = : 54    
 */
