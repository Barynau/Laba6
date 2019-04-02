public class Laba6 {
    public static boolean canBeEqualTo24(int[] nums) {
        if (nums.length < 4) return false;
        final int RESULT = 24;
        if (nums[0] + nums[1] + nums[2] + nums[3] == RESULT) return true;
        if (nums[0] * nums[1] * nums[2] * nums[3] == RESULT) return true;

        int[][] shuffle = {
                {0, 1, 2, 3},
                {0, 1, 3, 2},
                {0, 2, 1, 3},
                {0, 2, 3, 1},
                {0, 3, 2, 1},
                {0, 3, 1, 2},

                {1, 0, 2, 3},
                {1, 0, 3, 2},
                {1, 2, 0, 3},
                {1, 2, 3, 0},
                {1, 3, 2, 0},
                {1, 3, 0, 2},

                {2, 0, 1, 3},
                {2, 0, 3, 1},
                {2, 1, 0, 3},
                {2, 1, 3, 0},
                {2, 3, 0, 1},
                {2, 3, 1, 0},

                {3, 0, 1, 2},
                {3, 0, 2, 1},
                {3, 1, 0, 2},
                {3, 1, 2, 0},
                {3, 2, 0, 1},
                {3, 2, 1, 0},


        };
        for (int i = 0; i < 24; i++) {
            int a = nums[shuffle[i][0]];
            int b = nums[shuffle[i][1]];
            int c = nums[shuffle[i][2]];
            int d = nums[shuffle[i][3]];

            if (a * b - c == RESULT) return true;
            if (a * b + c == RESULT) return true;

            if (a + b + c - d == RESULT) return true;
            if (a + b + c * d == RESULT) return true;
            if (a + b * c * d == RESULT) return true;
            if (a * b * c - d == RESULT) return true;
            if (a + b * c - d == RESULT) return true;
            if (a - b - c + d == RESULT) return true;
            if (a - b - c * d == RESULT) return true;
            if (a + b - c - d == RESULT) return true;

            if (-a + b + c - d == RESULT) return true;
            if (-a + b + c * d == RESULT) return true;
            if (-a + b * c * d == RESULT) return true;
            if (-a * b * c - d == RESULT) return true;
            if (-a + b * c - d == RESULT) return true;
            if (-a - b - c + d == RESULT) return true;
            if (-a - b - c * d == RESULT) return true;
            if (-a + b - c - d == RESULT) return true;

            if (a + (b * c * d) == RESULT) return true;
            if (a * (b * c - d) == RESULT) return true;
            if (a * -(b * c - d) == RESULT) return true;
            if ((a + b + c) * d == RESULT) return true;
            if ((a - b - c) * d == RESULT) return true;
            if ((a - b + c) * d == RESULT) return true;

            if ((-a - b - c) * d == RESULT) return true;
            if ((-a - b + c) * d == RESULT) return true;
            if (-(a - b - c) * d == RESULT) return true;
            if (-(a - b + c) * d == RESULT) return true;
            if (d != 0) {
                if (a + b + c / d == RESULT) return true;
                if (a * b * c / d == RESULT) return true;
                if (a + b - c / d == RESULT) return true;
                if (a * b + c / d == RESULT) return true;
                if (a * b - c / d == RESULT) return true;
                if (a - b - c / d == RESULT) return true;

                if (-a + b + c / d == RESULT) return true;
                if (-a * b * c / d == RESULT) return true;
                if (-a + b - c / d == RESULT) return true;
                if (-a * b + c / d == RESULT) return true;
                if (-a * b - c / d == RESULT) return true;
                if (-a - b - c / d == RESULT) return true;

                if ((a + b + c) / d == RESULT) return true;
                if ((a - b - c) / d == RESULT) return true;
                if ((a + b - c) / d == RESULT) return true;

                if ((-a + b + c) / d == RESULT) return true;
                if ((-a - b - c) / d == RESULT) return true;
                if ((-a + b - c) / d == RESULT) return true;

                if (-(a - b - c) / d == RESULT) return true;
                if (-(a + b - c) / d == RESULT) return true;
            }
            if (d != 0 && c != 0) {
               
                if (a * b / c / d == RESULT) return true;
                          
              

            }

        }


        return false;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 3};

        System.out.println(canBeEqualTo24(array));

    }
}
