package homework;

public class Task_19_2 extends Task_19_1{
        private double height;

        public Task_19_2(double radius, double height) {

            super(radius);
            this.height = height;
        }

        public double getHeight() {
            if(height > 0){
                return height;
            }else{
                height = 0;
                return height;
            }
        }

        public double getVolume(){
            double area = getArea() * getHeight();
            return area;
        }

    }

