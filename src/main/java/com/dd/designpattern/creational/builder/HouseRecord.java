package com.dd.designpattern.creational.builder;

public record HouseRecord(int roomNumbers, int bathrooms, boolean kitchen, boolean lawn, boolean parking, boolean terrace) {

    private HouseRecord(Builder builder) {
        this(builder.roomNumbers, builder.bathrooms, builder.kitchen, builder.lawn, builder.parking, builder.terrace);
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

        public HouseRecord build(){
            return new HouseRecord(this);
        }
    }

    @Override
    public String toString() {
        return "HouseRecord{" +
                "roomNumbers=" + roomNumbers +
                ", bathrooms=" + bathrooms +
                ", kitchen=" + kitchen +
                ", lawn=" + lawn +
                ", parking=" + parking +
                ", terrace=" + terrace +
                '}';
    }
}

class BuilderRecordMain{
    public static void main(String[] args) {
        HouseRecord house = new HouseRecord.Builder(4,4,true).setLawn(true).setParking(true).build();
        System.out.println(house);

        HouseRecord house2 = new HouseRecord.Builder(1,1,true).build();
        System.out.println(house2);
    }
}
