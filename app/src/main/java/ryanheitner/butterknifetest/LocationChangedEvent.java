package ryanheitner.butterknifetest;
public class LocationChangedEvent {
    public final float lat;
    public final float lon;

    public LocationChangedEvent(float lat, float lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @Override public String toString() {
        return new StringBuilder("(") //
                .append(lat) //
                .append(", ") //
                .append(lon) //
                .append(")") //
                .toString();
    }
}