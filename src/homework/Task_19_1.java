package homework;

public class Task_19_1 {
        private double radius;

        public Task_19_1(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            if(radius < 0){
                radius = 0;
                return radius;
            }else{
                return radius;
            }
        }

        public double getArea(){
            double area = (radius * radius * Math.PI);
            return area;
        }
    }
