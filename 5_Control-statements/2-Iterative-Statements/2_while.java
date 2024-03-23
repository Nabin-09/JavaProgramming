//This eg show how the body of while statement can be empty
class while_tut {
    public static void main(String[] args) {
        int i, j;
    i = 100;
    j = 200;
     // find midpoint between i and j
    while(++i < --j); // no body in this loop
    System.out.println("Midpoint is " + i);
    }
}