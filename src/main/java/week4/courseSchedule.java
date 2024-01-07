package week4;

import java.util.LinkedList;
import java.util.List;

/***
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi]
 * indicates that you must take course bi first if you want to take course ai.
 *
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return true if you can finish all courses. Otherwise, return false.
 *
 *
 *
 * Example 1:
 *
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So it is possible.
 */
public class courseSchedule {
    LinkedList<Integer> adj[];
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj = new LinkedList[numCourses];
        for(int i=0;i<numCourses;i++){
            adj[i] = new LinkedList<>();
        }

        for(int i=0;i<prerequisites.length;i++){
            adj[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        if(isCyclic(numCourses)){
            return false;
        }
        return true;
    }

    public boolean isCyclic(int numcourses){
        boolean[] recStack = new boolean[numcourses];
        boolean[] visited = new boolean[numcourses];

        for(int i=0;i<numcourses;i++){
            if(isCyclicUtil(visited, recStack, i))
                return true;
        }
        return false;
    }

    public boolean isCyclicUtil(boolean[] visited, boolean[] recStack, int i){
        if(recStack[i]) return true;
        if(visited[i]) return false;

        visited[i] = true;
        recStack[i] = true;

        List<Integer> l = adj[i];
        for(Integer k:l){
            if(isCyclicUtil(visited, recStack, k)){
                return true;
            }
        }

        recStack[i] = false;
        return false;
    }
}
