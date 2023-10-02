import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final int NUM_ROWS = 3;
        final int NUM_COLS = 2;

        int[][] points = new int[NUM_ROWS][NUM_COLS];
        int[][] newPoints = new int[NUM_ROWS][NUM_COLS];
        char axis;
        int translateX, translateY;

        // Ask for 3 triangle points and store them as the starting triangle
        for (int i = 0; i < NUM_ROWS; i++) {
            System.out.print("Enter point #" + (i + 1) + " as x and y: ");
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        // Print the starting triangle
        System.out.print("Starting Triangle: ");
        printTriangle(points);
        System.out.println();

        // Rotate the triangle and print the rotated triangle
        System.out.print("Rotated Triangle: ");
        rotateTriangle(points, newPoints);
        printTriangle(newPoints);
        System.out.println();

        // Reflect the triangle and print the reflected triangle
        System.out.print("Enter axis to reflect (x or y): ");
        axis = scanner.next().charAt(0);
        if (reflectTriangle(axis, points, newPoints) == 0) {
            System.out.print("Reflected Triangle: ");
            printTriangle(newPoints);
        } else {
            System.out.println("Invalid Axis. Next time enter x or y.");
        }
        System.out.println();

        // Translate the triangle and print the translated triangle
        System.out.print("Enter translation values (x and y): ");
        translateX = scanner.nextInt();
        translateY = scanner.nextInt();
        translateTriangle(translateX, translateY, points, newPoints);
        System.out.print("Translated Triangle: ");
        printTriangle(newPoints);
        System.out.println();

        scanner.close();
    }

    // Function to print the triangle
    public static void printTriangle(int[][] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.printf("(%d, %d) ", points[i][0], points[i][1]);
        }
    }

    // Function to rotate the triangle
    public static void rotateTriangle(int[][] original, int[][] rotated) {
        for (int i = 0; i < original.length; i++) {
            rotated[i][0] = original[i][1];
            rotated[i][1] = -original[i][0];
        }
    }

    // Function to reflect the triangle
    public static int reflectTriangle(char reflectAxis, int[][] original, int[][] reflected) {
        for (int i = 0; i < original.length; i++) {
            if (reflectAxis == 'x' || reflectAxis == 'X') {
                reflected[i][0] = original[i][0];
                reflected[i][1] = -original[i][1];
            } else if (reflectAxis == 'y' || reflectAxis == 'Y') {
                reflected[i][0] = -original[i][0];
                reflected[i][1] = original[i][1];
            } else {
                return -1; // Invalid axis
            }
        }
        return 0;
    }

    // Function to translate the triangle
    public static void translateTriangle(int tranX, int tranY, int[][] original, int[][] translated) {
        for (int i = 0; i < original.length; i++) {
            translated[i][0] = original[i][0] + tranX;
            translated[i][1] = original[i][1] + tranY;
        }
    }
}
