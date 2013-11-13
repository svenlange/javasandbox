package za.co.svenlange.java;

class MitVariablenNamenDenCodeUnverstaendlichMachen {

    static int $x = 4;
    static int _y = 10;

    public static void main(String[] args) {
		boolean z = (_y % $x) == 2;
        System.out.println(z);
    }
}