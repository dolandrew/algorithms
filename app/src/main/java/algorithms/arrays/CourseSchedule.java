package algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

class CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        //  2 [[1,0]]

        // iterate through the array and check that each pair is greater on the left than the right

        Map<Integer, Integer> courses = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            courses.put(prerequisites[i][0], prerequisites[i][1]);
            while (courses.containsKey(prerequisites[i][0])) {

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] prerequisites = {{1,0},{0,1}};
        System.out.println(canFinish(2, prerequisites));
    }

}