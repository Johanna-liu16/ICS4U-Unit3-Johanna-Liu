/*
* This program codes for a triangle
*
* @author  Johanna Liu
* @version 1.0
* @since   2024-03-25
*/

class Triangle {
    /**
     * The main() method.
     *
     * @param args The command line arguments
     */

    private int numberOne = 1;
    private int numberTwo = 2;
    private int numberThree = 3;

    private int side1;
    private int side2;
    private int side3;

    /**
     * The constructor.
     *
     * @param side1 The first side of the triangle
     * @param side2 The second side of the triangle
     * @param side3 The third side of the triangle
     */
    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * The validity of the triangle.
     *
     * @return isValid
     */
    public boolean isValid() {
        if (side1 + side2 > side3
            && side2 + side3 > side1
            && side3 + side1 > side1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The semiperimeter of the triangle.
     *
     * @return semiPerimeter
     */
    public double semiPerimeter() {
        if (!this.isValid()) {
            return -1;
        } else {
            final int semiPerimeter = (side1 + side2 + side3) / 2;
            return semiPerimeter;
        }
    }

    /**
     * The area of the triangle.
     *
     * @return area
     */
    public double area() {
        if (!this.isValid()) {
            return -1;
        } else {
            final double area =
                Math.sqrt(semiPerimeter()
                * (semiPerimeter() - side1)
                * (semiPerimeter() - side2)
                * (semiPerimeter() - side3));
            return area;
        }
    }

    /**
     * The type of the triangle.
     *
     * @return type
     */
    public String getType() {
        if (!this.isValid()) {
            return "-1";
        } else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    /**
     * The angle of the triangle.
     *
     * @param angleNumber The angle number
     * @return angle
     */
    public double angle(double angleNumber) {
        if (!this.isValid()) {
            return -1;
        } else if (angleNumber == numberOne) {
            final double angle = Math.acos((Math.pow(side2, 2)
                + Math.pow(side3, 2)
                - Math.pow(side1, 2)) / (2 * side2 * side3));
            return angle;
        } else if (angleNumber == numberTwo) {
            final double angle = Math.acos((Math.pow(side3, 2)
                + Math.pow(side1, 2)
                - Math.pow(side2, 2)) / (2 * side3 * side1));
            return angle;
        } else if (angleNumber == numberThree) {
            final double angle = Math.acos((Math.pow(side1, 2)
                + Math.pow(side2, 2)
                - Math.pow(side3, 2)) / (2 * side1 * side2));
            return angle;
        }
        return angle(angleNumber);
    }

    /**
     * The height of the triangle.
     *
     * @param sideNumber The side number
     * @return height
     */
    public double height(double sideNumber) {
        if (!this.isValid()) {
            return -1;
        } else if (sideNumber == numberOne) {
            final double height = 2 * area() / side1;
            return height;
        } else if (sideNumber == numberTwo) {
            final double height = 2 * area() / side2;
            return height;
        } else if (sideNumber == numberThree) {
            final double height = 2 * area() / side3;
            return height;
        }
        return height(sideNumber);
    }

    /**
     * The inner circle radius.
     *
     * @return radius
     */
    public double innerCircleRadius() {
        if (!this.isValid()) {
            return -1;
        } else {
            final double radius = area() / semiPerimeter();
            return radius;
        }

    }

    /**
     * The circumcircle radius.
     *
     * @return radius
     */
    public double circumsCircleRadius() {
        if (!this.isValid()) {
            return -1;
        } else {
            final double radius = (side1 * side2 * side3) / (4 * area());
            return radius;

        }

    }

}