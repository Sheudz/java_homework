package semester1.practice10;

public class EmergencyBeacon implements AcousticSignal, OpticalSignal
{
    @Override
    public String emitAlert()
    {
        return AcousticSignal.super.emitAlert() + " | " + OpticalSignal.super.emitAlert();
    }
}

interface AcousticSignal
{
    default String emitAlert()
    {
        return "🔊 Звукова сирена 110 дБ";
    }
}

interface OpticalSignal
{
    default String emitAlert()
    {
        return "🚨 Стробоскопічний маячок";
    }
}
