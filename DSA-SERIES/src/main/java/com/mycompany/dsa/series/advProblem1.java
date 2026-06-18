package com.mycompany.dsa.series;

class advProblem1 {
    public static int CountPath(int m, int n, int i, int j) {
        if((i == m || j == n)) {
            return 0;
        }
        if(i == m - 1 && j == n - 1) {
            return 1;
        }
        int RigthPath = CountPath(m , n, i + 1, j);
        
        int DownPath = CountPath(m , n, i, j + 1);
        return RigthPath + DownPath;
    }
    public static void main(String [] args) {
        int m = 3;
        int n = 3;
        System.out.println(CountPath(m, n, 0, 0));
    }

    
}