package homework1;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("JavaCore Homework #1");

        Team myTeam = new Team("FireFly", "Bob", 10,
                "John", 15,
                "Mark", 20,
                "Kobe", 100);

        int[] courseObstacles = {15, 20, 10};
        Course course = new Course(courseObstacles);
        course.doIt(myTeam);

        System.out.println("All Team results: ");
        myTeam.showResults();

        System.out.println("Team results (just passed): ");
        myTeam.showPassedResults();

    }
}
