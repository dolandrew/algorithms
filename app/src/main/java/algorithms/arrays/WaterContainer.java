package algorithms.arrays;

class WaterContainer {

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        int newArea = 0;
        while (i < j) {
            newArea = (j - i) * Math.min(height[i],height[j]);
            System.out.println(newArea);
            if (newArea > area) {
                area = newArea;
            }
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }

        }
        return area;
    }

    public static void main(String[] args) {
        int[] heights = {4,5,3,7,8,9};
        System.out.println(maxArea(heights));
    }

}