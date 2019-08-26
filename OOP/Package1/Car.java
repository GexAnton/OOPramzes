package OOP.Package1;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private double engineVolume;
    private String vendor;
    private String colour;
    private int seats;

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", vendor='" + vendor + '\'' +
                ", colour='" + colour + '\'' +
                ", seats=" + seats +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Car)){
            return false;
        }
        Car o = (Car)obj;
        return this.vendor.equals(o.vendor);                  //!!!!!!!!!!!!!!!!!!!!!

    }


    public Car() {
    }

    public Car(double engineVolume, String vendor, String colour, int seats) {
        this.engineVolume = engineVolume;
        this.vendor = vendor;
        this.colour = colour;
        this.seats = seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public int compareTo(Car o) {
        return this.vendor.compareTo(o.vendor);
    }

    static class CarComparator implements Comparator<Car>{
        private int sortingField = 0;
        public static final int SORTING_FIELD_VOLUME = 0;
        public static final int SORTING_FIELD_COLOUR = 1;
        public static final int SORTING_FIELD_VENDOR = 2;
        public static final int SORTING_FIELD_SEATS = 3;

        public CarComparator() {
        }

        public CarComparator(int sortingField) {
            this.sortingField = sortingField;
        }

        public int getSortingField(){
            return sortingField;
        }

        public void setSortingField(int sortingField){
            this.sortingField = sortingField;
        }


        @Override
        public int compare(Car o1, Car o2) {
            switch(sortingField){
                case 0: {
                    if(o1.engineVolume>o2.engineVolume){
                        return 1;
                    }else if (o1.engineVolume<o2.engineVolume){
                        return -1;
                    } else {
                        return 0;
                    }
                }
                case 1: {
                    return o1.colour.compareTo(o2.colour);

                }
                case 2: {
                    return o1.vendor.compareTo(o2.vendor);

                }
                case 3: {
                    return o1.seats - o2.seats;

                }
                default: {
                   return o1.compareTo(o2);
                }

            }


        }
    }
}

