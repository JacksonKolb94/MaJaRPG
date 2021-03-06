package com.maja.world;

/* Max Morrison & Jackson Kolb
    Location class handles all of the Tile and Region class objects for any other class
*/

public final class Location {

    private Tile tile;
    private Region region;

    public Location(Tile tile, Region region) {
        this.tile = tile;
        this.region = region;
    }

    public Tile getTile() {
        return tile;
    }

    public Region getRegion() {
        return region;
    }
}
