//package Recursion&Backtracking;

public class Toweroh {
    static void toh(int n,char A,char C,char B){
    if(n==1)
    {
        System.out.println("Move disk 1 from "+A+" to "+C);
        return;
    }

    toh(n-1,A,B,C);
    System.out.println("Move disk "+n+" from "+A+" to "+C);
    toh(n-1,B,C,A);
}
public static void main(String args[])
{
    int n=2;
    toh(n,'A','C','B');

}
}
