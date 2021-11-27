package com.dd.designpattern.creational.builder;

public class House {

    private int roomNumbers;
    private int bathrooms;
    private boolean kitchen;
    private boolean lawn;
    private boolean parking;
    private boolean terrace;

    private House(Builder builder) {
        this.roomNumbers = builder.roomNumbers;
        this.bathrooms = builder.bathrooms;
        this.kitchen = builder.kitchen;
        this.lawn = builder.lawn;
        this.parking = builder.parking;
        this.terrace = builder.terrace;
    }

    public int getRoomNumbers() {
        return roomNumbers;
    }

    public void setRoomNumbers(int roomNumbers) {
        this.roomNumbers = roomNumbers;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public boolean isLawn() {
        return lawn;
    }

    public void setLawn(boolean lawn) {
        this.lawn = lawn;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isTerrace() {
        return terrace;
    }

    public void setTerrace(boolean terrace) {
        this.terrace = terrace;
    }

    public static class Builder{
        //mandatory parameters
        private int roomNumbers;
        private int bathrooms;
        private boolean kitchen;

        //optional parameters
        private boolean lawn;
        private boolean parking;
        private boolean terrace;

        public Builder(int roomNumbers, int bathrooms, boolean kitchen) {
            this.roomNumbers = roomNumbers;
            this.bathrooms = bathrooms;
            this.kitchen = kitchen;
        }

        public Builder setLawn(boolean lawn) {
            this.lawn = lawn;
            return this;
        }

        public Builder setParking(boolean parking) {
            this.parking = parking;
            return this;
        }

        public Builder setTerrace(boolean terrace) {
            this.terrace = terrace;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "roomNumbers=" + roomNumbers +
                ", bathrooms=" + bathrooms +
                ", kitchen=" + kitchen +
                ", lawn=" + lawn +
                ", parking=" + parking +
                ", terrace=" + terrace +
                '}';
    }
}

class BuilderMain{
    public static void main(String[] args) {
        House house = new House.Builder(4,4,true).setLawn(true).setParking(true).build();
        System.out.println(house);

        House house2 = new House.Builder(1,1,true).build();
        System.out.println(house2);
    }
}
