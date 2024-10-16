package demo;

import java.util.IdentityHashMap;

class demo001 {
    public static void main(String[] args) {
        System.out.println("hEllo");
        int num = 10;
        int val = 10;
        // Integer.valueOf(num).hashCode();
        System.out.println(Integer.identityHashCode(num));
    }
}
