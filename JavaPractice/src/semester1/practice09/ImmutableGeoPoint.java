package semester1.practice09;

public final class ImmutableGeoPoint
{
    private final double latitude;
    private final double longitude;

    public ImmutableGeoPoint(double latitude, double longitude)
    {
        this.latitude = Math.max(-90, Math.min(90, latitude));
        this.longitude = Math.max(-180, Math.min(180, longitude));
    }
    public double getLatitude()
    {
        return latitude;
    }
    public double getLongitude()
    {
        return longitude;
    }
    public ImmutableGeoPoint shift(double dLat, double dLon)
    {
        return new ImmutableGeoPoint(latitude + dLat, longitude + dLon);
    }
    @Override
    public String toString()
    {
        return "GeoPoint{latitude=" + latitude + ", longitude=" + longitude + "}";
    }
}
